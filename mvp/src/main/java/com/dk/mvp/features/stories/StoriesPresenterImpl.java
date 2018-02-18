package com.dk.mvp.features.stories;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;

import com.dk.core.model.DataSourceA;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by dkakuli on 15/02/2018.
 */

public class StoriesPresenterImpl implements StoriesContract.Presenter {


    private final StoriesApi storiesApi;
    StoriesContract.View view;

    public StoriesPresenterImpl(StoriesContract.View view, StoriesApi storiesApi) {
        this.view = view;
        this.storiesApi = storiesApi;
    }


    @Override
    public void getAllStories() {
        storiesApi.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DataSourceA>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(DataSourceA dataSourceA) {
                        view.onDataLoadFinished(dataSourceA);
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
