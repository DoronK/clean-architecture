package com.dk.mvp.features.stories;

import com.dk.mvp.MVPActivity;
import com.dk.mvp.MVPActivity_;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by dkakuli on 15/02/2018.
 */

@Module
public class StoriesModule {

    @Provides
    StoriesApi provideStoriesApi(Retrofit retrofit) {
        return retrofit.create(StoriesApi.class);

    }

    @Provides
    StoriesContract.Presenter provideStoriesPresenter(StoriesContract.View view, StoriesApi storiesApi) {
        return new StoriesPresenterImpl(view, storiesApi);
    }

    @Provides
    StoriesContract.View provideStoriesView(MVPActivity_ MVPActivity) {
        return MVPActivity;
    }
}
