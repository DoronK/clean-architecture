package com.dk.mvvm;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.dk.core.model.DataSourceA;
import com.dk.mvvm.viewmodel.StoriesViewModel;
import com.dk.mvvm.viewmodel.StoriesViewModelFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by dkakuli on 15/02/2018.
 */

public class MVVMActivity extends DaggerAppCompatActivity {

    private TextView mTextView;
    private StoriesViewModel mViewModel;

    @Inject
    StoriesViewModelFactory storiesViewModelFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);
        mTextView = findViewById(R.id.data_textview);

        mViewModel = ViewModelProviders.of(this, storiesViewModelFactory).get(StoriesViewModel.class);

        findViewById(R.id.get_stories_btn_id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getStories();
            }
        });


        mViewModel.response().observe(this, new android.arch.lifecycle.Observer<DataSourceA>() {
            @Override
            public void onChanged(@Nullable DataSourceA dataSourceA) {
                mTextView.setText(dataSourceA.getAllStories().toString());
            }
        });
    }
}
