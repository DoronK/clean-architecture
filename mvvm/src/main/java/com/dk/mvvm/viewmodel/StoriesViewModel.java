package com.dk.mvvm.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.dk.core.api.StoriesApi;
import com.dk.core.model.DataSourceA;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by dkakuli on 17/02/2018.
 */

public class StoriesViewModel extends ViewModel {

    private final StoriesApi storiesApi;

    private final MutableLiveData<DataSourceA> response = new MutableLiveData<>();


    public MutableLiveData<DataSourceA> response() {
        return response;
    }

    StoriesViewModel(StoriesApi storiesApi) {
        this.storiesApi = storiesApi;
    }


    public void getStories() {
        storiesApi.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DataSourceA>() {
                    @Override
                    public void accept(DataSourceA dataSourceA) throws Exception {
                        response.setValue(dataSourceA);
                    }
                });
    }

}
