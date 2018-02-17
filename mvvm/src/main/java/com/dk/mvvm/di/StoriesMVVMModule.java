package com.dk.mvvm.di;

import com.dk.core.api.StoriesApi;
import com.dk.mvvm.viewmodel.StoriesViewModelFactory;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by dkakuli on 15/02/2018.
 */

@Module
public class StoriesMVVMModule {

    @Provides
    StoriesApi provideStoriesApi(Retrofit retrofit) {
        return retrofit.create(StoriesApi.class);
    }

    @Provides
    StoriesViewModelFactory provideStoriesViewModelFactory(StoriesApi storiesApi) {
        return new StoriesViewModelFactory(storiesApi);
    }

}
