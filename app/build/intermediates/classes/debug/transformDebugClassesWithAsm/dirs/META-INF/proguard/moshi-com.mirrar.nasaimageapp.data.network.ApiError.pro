-if class com.mirrar.nasaimageapp.data.network.ApiError
-keepnames class com.mirrar.nasaimageapp.data.network.ApiError
-if class com.mirrar.nasaimageapp.data.network.ApiError
-keep class com.mirrar.nasaimageapp.data.network.ApiErrorJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
