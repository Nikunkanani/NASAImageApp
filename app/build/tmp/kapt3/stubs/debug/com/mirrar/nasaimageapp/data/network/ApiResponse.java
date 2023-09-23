package com.mirrar.nasaimageapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "T", "", "()V", "Error", "Loading", "Success", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Error;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Loading;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Success;", "app_debug"})
public abstract class ApiResponse<T extends java.lang.Object> {
    
    private ApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Success;", "T", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.mirrar.nasaimageapp.data.network.ApiResponse<T> {
        private final T data = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mirrar.nasaimageapp.data.network.ApiResponse.Success<T> copy(T data) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Success(T data) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00060\u0004j\u0002`\u0005H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Error;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "apiError", "Lcom/mirrar/nasaimageapp/data/network/ApiError;", "(Ljava/lang/Exception;Lcom/mirrar/nasaimageapp/data/network/ApiError;)V", "getApiError", "()Lcom/mirrar/nasaimageapp/data/network/ApiError;", "getException", "()Ljava/lang/Exception;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error extends com.mirrar.nasaimageapp.data.network.ApiResponse {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Exception exception = null;
        @org.jetbrains.annotations.Nullable
        private final com.mirrar.nasaimageapp.data.network.ApiError apiError = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.mirrar.nasaimageapp.data.network.ApiResponse.Error copy(@org.jetbrains.annotations.NotNull
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable
        com.mirrar.nasaimageapp.data.network.ApiError apiError) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable
        com.mirrar.nasaimageapp.data.network.ApiError apiError) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Exception getException() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.mirrar.nasaimageapp.data.network.ApiError component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.mirrar.nasaimageapp.data.network.ApiError getApiError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/mirrar/nasaimageapp/data/network/ApiResponse$Loading;", "Lcom/mirrar/nasaimageapp/data/network/ApiResponse;", "", "()V", "app_debug"})
    public static final class Loading extends com.mirrar.nasaimageapp.data.network.ApiResponse {
        @org.jetbrains.annotations.NotNull
        public static final com.mirrar.nasaimageapp.data.network.ApiResponse.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}