package com.dk.mvp.features.stories;

import com.dk.mvp.base.BasePresenter;
import com.dk.mvp.base.BaseView;
import com.dk.core.model.DataSourceA;

public class StoriesContract {

    public interface View extends BaseView<Presenter> {
        void onDataLoadFinished(DataSourceA dataSourceA);
    }

    public interface Presenter extends BasePresenter<View> {

        void getAllStories();
    }


}