package com.mirrar.nasaimageapp.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/mirrar/nasaimageapp/core/di/AppModule;", "", "()V", "provideApiService", "Lcom/mirrar/nasaimageapp/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppDatabase", "Lcom/mirrar/nasaimageapp/data/local/AppDatabase;", "context", "Landroid/content/Context;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideNasaImageDao", "Lcom/mirrar/nasaimageapp/data/local/NasaImageDao;", "db", "provideNasaImageRepository", "Lcom/mirrar/nasaimageapp/data/repository/NasaRepository;", "apiService", "nasaImageDao", "moshi", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mirrar.nasaimageapp.core.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mirrar.nasaimageapp.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mirrar.nasaimageapp.data.repository.NasaRepository provideNasaImageRepository(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.local.NasaImageDao nasaImageDao, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mirrar.nasaimageapp.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mirrar.nasaimageapp.data.local.NasaImageDao provideNasaImageDao(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.local.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
}