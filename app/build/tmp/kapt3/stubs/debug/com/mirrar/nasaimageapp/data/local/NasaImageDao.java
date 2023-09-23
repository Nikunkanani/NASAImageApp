package com.mirrar.nasaimageapp.data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/mirrar/nasaimageapp/data/local/NasaImageDao;", "", "getImageByDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mirrar/nasaimageapp/data/local/NasaImageEntity;", "date", "", "insertImage", "", "nasaImage", "(Lcom/mirrar/nasaimageapp/data/local/NasaImageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NasaImageDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM nasa_images WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<com.mirrar.nasaimageapp.data.local.NasaImageEntity> getImageByDate(@org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertImage(@org.jetbrains.annotations.NotNull
    com.mirrar.nasaimageapp.data.local.NasaImageEntity nasaImage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}