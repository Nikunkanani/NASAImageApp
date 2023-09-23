package com.mirrar.nasaimageapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mirrar.nasaimageapp.data.network.ApiResponse
import com.mirrar.nasaimageapp.domain.model.NasaImage
import com.mirrar.nasaimageapp.domain.usecase.FetchNasaImageOfTheDayUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class NasaViewModel @Inject constructor(
    private val fetchNasaImageOfTheDayUseCase: FetchNasaImageOfTheDayUseCase
) : ViewModel() {

    private val _nasaImage = MutableStateFlow<ApiResponse<NasaImage?>>(ApiResponse.Loading)
    val nasaImage: StateFlow<ApiResponse<NasaImage?>> = _nasaImage

    init {
        val todayDate: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        fetchImageOfTheDay(todayDate)
    }

    private fun fetchImageOfTheDay(date: String? = null) {
        viewModelScope.launch {
            fetchNasaImageOfTheDayUseCase.execute(date).collect { result ->
                _nasaImage.value = result
            }
        }
    }
}