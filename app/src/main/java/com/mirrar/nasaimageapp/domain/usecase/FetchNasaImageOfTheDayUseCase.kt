package com.mirrar.nasaimageapp.domain.usecase

import com.mirrar.nasaimageapp.data.network.ApiResponse
import com.mirrar.nasaimageapp.data.remote.NasaImageDto
import com.mirrar.nasaimageapp.data.repository.NasaRepository
import com.mirrar.nasaimageapp.domain.model.NasaImage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class FetchNasaImageOfTheDayUseCase @Inject constructor(private val nasaRepository: NasaRepository) {
    fun execute(date: String? = null): Flow<ApiResponse<NasaImage>> {
        return nasaRepository.fetchImageOfTheDay(date).map { result ->
            when (result) {
                is ApiResponse.Success -> {
                    ApiResponse.Success(mapToDomainModel(result.data))
                }

                is ApiResponse.Error -> {
                    ApiResponse.Error(result.exception, result.apiError)
                }

                is ApiResponse.Loading -> {
                    ApiResponse.Loading
                }
            }
        }
    }

    private fun mapToDomainModel(response: NasaImageDto): NasaImage {
        return NasaImage(
            title = response.title,
            date = response.date,
            explanation = response.explanation,
            url = response.url,
            mediaType = response.mediaType
        )
    }
}