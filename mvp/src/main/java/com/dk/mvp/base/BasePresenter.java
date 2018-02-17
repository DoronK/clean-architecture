package com.dk.mvp.base;

import java.util.List;

import io.reactivex.disposables.Disposable;

public interface BasePresenter<T> {

    void setView(T view);
}