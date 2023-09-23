package com.mirrar.nasaimageapp.ui.viewmodel;

import com.mirrar.nasaimageapp.domain.usecase.FetchNasaImageOfTheDayUseCase;
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
public final class NasaViewModel_Factory implements Factory<NasaViewModel> {
  private final Provider<FetchNasaImageOfTheDayUseCase> fetchNasaImageOfTheDayUseCaseProvider;

  public NasaViewModel_Factory(
      Provider<FetchNasaImageOfTheDayUseCase> fetchNasaImageOfTheDayUseCaseProvider) {
    this.fetchNasaImageOfTheDayUseCaseProvider = fetchNasaImageOfTheDayUseCaseProvider;
  }

  @Override
  public NasaViewModel get() {
    return newInstance(fetchNasaImageOfTheDayUseCaseProvider.get());
  }

  public static NasaViewModel_Factory create(
      Provider<FetchNasaImageOfTheDayUseCase> fetchNasaImageOfTheDayUseCaseProvider) {
    return new NasaViewModel_Factory(fetchNasaImageOfTheDayUseCaseProvider);
  }

  public static NasaViewModel newInstance(
      FetchNasaImageOfTheDayUseCase fetchNasaImageOfTheDayUseCase) {
    return new NasaViewModel(fetchNasaImageOfTheDayUseCase);
  }
}
