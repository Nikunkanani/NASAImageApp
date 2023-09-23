package com.mirrar.nasaimageapp.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/mirrar/nasaimageapp/ui/viewmodel/NasaViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchNasaImageOfTheDayUseCase", "Lcom/mirrar/nasaimageapp/domain/usecase/FetchNasaImageOfTheDayUseCase;", "(Lcom/mirrar/nasaimageapp/domain/usecase/FetchNasaImageOfTheDayUseCase;)V", "_nasaImage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "Lcom/mirrar/nasaimageapp/domain/model/NasaImage;", "nasaImage", "Lkotlinx/coroutines/flow/StateFlow;", "getNasaImage", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchImageOfTheDay", "", "date", "", "app_debug"})
public final class NasaViewModel extends androidx.lifecycle.ViewModel {
    private final com.mirrar.nasaimageapp.domain.usecase.FetchNasaImageOfTheDayUseCase fetchNasaImageOfTheDayUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mirrar.nasaimageapp.data.network.ApiResponse<com.mirrar.nasaimageapp.domain.model.NasaImage>> _nasaImage = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.mirrar.nasaimageapp.data.network.ApiResponse<com.mirrar.nasaimageapp.domain.model.NasaImage>> nasaImage = null;
    
    @javax.inject.Inject
    public NasaViewModel(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.domain.usecase.FetchNasaImageOfTheDayUseCase fetchNasaImageOfTheDayUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.mirrar.nasaimageapp.data.network.ApiResponse<com.mirrar.nasaimageapp.domain.model.NasaImage>> getNasaImage() {
        return null;
    }
    
    private final void fetchImageOfTheDay(java.lang.String date) {
    }
}