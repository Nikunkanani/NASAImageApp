package com.mirrar.nasaimageapp.data.repository;

import com.mirrar.nasaimageapp.data.local.NasaImageDao;
import com.mirrar.nasaimageapp.data.remote.ApiService;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NasaRepository_Factory implements Factory<NasaRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<NasaImageDao> nasaImageDaoProvider;

  private final Provider<Moshi> moshiProvider;

  public NasaRepository_Factory(Provider<ApiService> apiServiceProvider,
      Provider<NasaImageDao> nasaImageDaoProvider, Provider<Moshi> moshiProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.nasaImageDaoProvider = nasaImageDaoProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public NasaRepository get() {
    return newInstance(apiServiceProvider.get(), nasaImageDaoProvider.get(), moshiProvider.get());
  }

  public static NasaRepository_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<NasaImageDao> nasaImageDaoProvider, Provider<Moshi> moshiProvider) {
    return new NasaRepository_Factory(apiServiceProvider, nasaImageDaoProvider, moshiProvider);
  }

  public static NasaRepository newInstance(ApiService apiService, NasaImageDao nasaImageDao,
      Moshi moshi) {
    return new NasaRepository(apiService, nasaImageDao, moshi);
  }
}
