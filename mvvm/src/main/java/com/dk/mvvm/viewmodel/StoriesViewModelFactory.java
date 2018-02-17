package com.dk.mvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.dk.core.api.StoriesApi;

/**
 * Created by dkakuli on 17/02/2018.
 */

public class StoriesViewModelFactory implements ViewModelProvider.Factory {


    private final StoriesApi storiesApi;

    public StoriesViewModelFactory(StoriesApi storiesApi) {
        this.storiesApi = storiesApi;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new StoriesViewModel(storiesApi);
    }
}
