package com.dk.mvp.base;

public interface BaseView<T> {

//    boolean hasSavedData(@NonNull Bundle bundle);

//    void restoreState(@NonNull Bundle bundle);

//    Bundle saveState(@NonNull Bundle bundle);

//    String getLastResultKey();

    void setPresenter(T presenter);


}