package com.dk.mvp.di;

import com.dk.mvp.MVPActivity;
import com.dk.mvp.features.stories.StoriesApi;
import com.dk.mvp.features.stories.StoriesContract;
import com.dk.mvp.features.stories.StoriesPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dkakuli on 15/02/2018.
 */

@Module
public class MainActivityModule {

    @Provides
    StoriesContract.Presenter provideStoriesPresenter(StoriesContract.View view, StoriesApi storiesApi) {
        return new StoriesPresenterImpl(view,storiesApi);
    }

    @Provides
    StoriesContract.View provideStoriesView(MVPActivity MVPActivity) {
        return MVPActivity;
    }
}
