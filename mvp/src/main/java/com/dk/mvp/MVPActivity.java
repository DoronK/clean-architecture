package com.dk.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.dk.mvp.features.stories.StoriesContract;
import com.dk.core.model.DataSourceA;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by dkakuli on 15/02/2018.
 */

public class MVPActivity extends DaggerAppCompatActivity implements StoriesContract.View {

    private TextView mTextView;

    @Inject
    StoriesContract.Presenter storiesPresenterImpl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Building View
        findViewById(R.id.get_stories_btn_id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storiesPresenterImpl.getAllStories();
            }
        });
        mTextView = findViewById(R.id.data_textview);
    }


    //region StoriesContract.View
    @Override
    public void setPresenter(StoriesContract.Presenter presenter) {
        storiesPresenterImpl = presenter;
    }

    @Override
    public void onDataLoadFinished(DataSourceA dataSourceA) {
        mTextView.setText(dataSourceA.getAllStories().toString());
    }
    //endregion
}
