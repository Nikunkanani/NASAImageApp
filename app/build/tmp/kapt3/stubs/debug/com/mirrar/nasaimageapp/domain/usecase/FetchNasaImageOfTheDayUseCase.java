package com.mirrar.nasaimageapp.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/mirrar/nasaimageapp/domain/usecase/FetchNasaImageOfTheDayUseCase;", "", "nasaRepository", "Lcom/mirrar/nasaimageapp/data/repository/NasaRepository;", "(Lcom/mirrar/nasaimageapp/data/repository/NasaRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "Lcom/mirrar/nasaimageapp/domain/model/NasaImage;", "date", "", "mapToDomainModel", "response", "Lcom/mirrar/nasaimageapp/data/remote/NasaImageDto;", "app_debug"})
public final class FetchNasaImageOfTheDayUseCase {
    private final com.mirrar.nasaimageapp.data.repository.NasaRepository nasaRepository = null;
    
    @javax.inject.Inject
    public FetchNasaImageOfTheDayUseCase(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.repository.NasaRepository nasaRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.mirrar.nasaimageapp.data.network.ApiResponse<com.mirrar.nasaimageapp.domain.model.NasaImage>> execute(@org.jetbrains.annotations.Nullable
    java.lang.String date) {
        return null;
    }
    
    private final com.mirrar.nasaimageapp.domain.model.NasaImage mapToDomainModel(com.mirrar.nasaimageapp.data.remote.NasaImageDto response) {
        return null;
    }
}