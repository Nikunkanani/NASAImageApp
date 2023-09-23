package com.mirrar.nasaimageapp.core.di;

import com.mirrar.nasaimageapp.data.local.AppDatabase;
import com.mirrar.nasaimageapp.data.local.NasaImageDao;
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
public final class AppModule_ProvideNasaImageDaoFactory implements Factory<NasaImageDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideNasaImageDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NasaImageDao get() {
    return provideNasaImageDao(dbProvider.get());
  }

  public static AppModule_ProvideNasaImageDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideNasaImageDaoFactory(dbProvider);
  }

  public static NasaImageDao provideNasaImageDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNasaImageDao(db));
  }
}
