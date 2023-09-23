package com.mirrar.nasaimageapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/mirrar/nasaimageapp/data/repository/NasaRepository;", "", "apiService", "Lcom/mirrar/nasaimageapp/data/remote/ApiService;", "nasaImageDao", "Lcom/mirrar/nasaimageapp/data/local/NasaImageDao;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/mirrar/nasaimageapp/data/remote/ApiService;Lcom/mirrar/nasaimageapp/data/local/NasaImageDao;Lcom/squareup/moshi/Moshi;)V", "fetchImageOfTheDay", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "Lcom/mirrar/nasaimageapp/data/remote/NasaImageDto;", "date", "", "app_debug"})
public final class NasaRepository {
    private final com.mirrar.nasaimageapp.data.remote.ApiService apiService = null;
    private final com.mirrar.nasaimageapp.data.local.NasaImageDao nasaImageDao = null;
    private final com.squareup.moshi.Moshi moshi = null;
    
    @javax.inject.Inject
    public NasaRepository(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.local.NasaImageDao nasaImageDao, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.mirrar.nasaimageapp.data.network.ApiResponse<com.mirrar.nasaimageapp.data.remote.NasaImageDto>> fetchImageOfTheDay(@org.jetbrains.annotations.Nullable
    java.lang.String date) {
        return null;
    }
}