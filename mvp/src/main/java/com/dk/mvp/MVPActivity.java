package com.dk.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dk.core.model.DataSourceA;
import com.dk.mvp.features.stories.StoriesContract;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.InstanceState;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by dkakuli on 15/02/2018.
 */

@EActivity(R.layout.activity_main)
public class MVPActivity extends DaggerAppCompatActivity implements StoriesContract.View {

    @ViewById(R.id.data_textview)
    TextView mTextView;

    @InstanceState
    DataSourceA dataSourceA;

    @Inject
    StoriesContract.Presenter storiesPresenterImpl;

    @AfterViews
    void afterViews() {
        mTextView.setText(dataSourceA != null ? dataSourceA.getAllStories().toString() : "");
    }

    @Click(R.id.get_stories_btn_id)
    void onButtonClicked() {
        storiesPresenterImpl.getAllStories();

    }


    //region StoriesContract.View
    @Override
    public void onDataLoadFinished(DataSourceA dataSourceA) {
        this.dataSourceA = dataSourceA;
        mTextView.setText(dataSourceA.getAllStories().toString());
    }
    //endregion
}
