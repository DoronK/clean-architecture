package com.dk.mvp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.dk.mvp.features.stories.StoriesContract;
import com.dk.core.model.DataSourceA;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.InstanceState;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by dkakuli on 15/02/2018.
 */

@EActivity
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
    public void onDataLoadFinished(DataSourceA dataSourceA) {
        mTextView.setText(dataSourceA.getAllStories().toString());
    }
    //endregion
}
