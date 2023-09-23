package com.mirrar.nasaimageapp.core.di;

import com.mirrar.nasaimageapp.data.local.NasaImageDao;
import com.mirrar.nasaimageapp.data.remote.ApiService;
import com.mirrar.nasaimageapp.data.repository.NasaRepository;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideNasaImageRepositoryFactory implements Factory<NasaRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<NasaImageDao> nasaImageDaoProvider;

  private final Provider<Moshi> moshiProvider;

  public AppModule_ProvideNasaImageRepositoryFactory(Provider<ApiService> apiServiceProvider,
      Provider<NasaImageDao> nasaImageDaoProvider, Provider<Moshi> moshiProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.nasaImageDaoProvider = nasaImageDaoProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public NasaRepository get() {
    return provideNasaImageRepository(apiServiceProvider.get(), nasaImageDaoProvider.get(), moshiProvider.get());
  }

  public static AppModule_ProvideNasaImageRepositoryFactory create(
      Provider<ApiService> apiServiceProvider, Provider<NasaImageDao> nasaImageDaoProvider,
      Provider<Moshi> moshiProvider) {
    return new AppModule_ProvideNasaImageRepositoryFactory(apiServiceProvider, nasaImageDaoProvider, moshiProvider);
  }

  public static NasaRepository provideNasaImageRepository(ApiService apiService,
      NasaImageDao nasaImageDao, Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNasaImageRepository(apiService, nasaImageDao, moshi));
  }
}
