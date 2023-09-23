package com.mirrar.nasaimageapp.domain.usecase;

import com.mirrar.nasaimageapp.data.repository.NasaRepository;
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
public final class FetchNasaImageOfTheDayUseCase_Factory implements Factory<FetchNasaImageOfTheDayUseCase> {
  private final Provider<NasaRepository> nasaRepositoryProvider;

  public FetchNasaImageOfTheDayUseCase_Factory(Provider<NasaRepository> nasaRepositoryProvider) {
    this.nasaRepositoryProvider = nasaRepositoryProvider;
  }

  @Override
  public FetchNasaImageOfTheDayUseCase get() {
    return newInstance(nasaRepositoryProvider.get());
  }

  public static FetchNasaImageOfTheDayUseCase_Factory create(
      Provider<NasaRepository> nasaRepositoryProvider) {
    return new FetchNasaImageOfTheDayUseCase_Factory(nasaRepositoryProvider);
  }

  public static FetchNasaImageOfTheDayUseCase newInstance(NasaRepository nasaRepository) {
    return new FetchNasaImageOfTheDayUseCase(nasaRepository);
  }
}
