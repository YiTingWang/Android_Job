package com.example.android_job1;

import android.content.Intent;
import android.view.View;

/**
 * Created by 27758 on 2016/10/12.
 */
public class ChangeListener implements View.OnClickListener{

    private MainActivity mMainActivity;

    public ChangeListener (MainActivity mainActivity) {
        mMainActivity = mainActivity;

    }

    public void onClick(View v){
        Intent intent = new Intent();
        intent.setClass(mMainActivity,Main2Activity.class);
        mMainActivity.startActivity(intent);
    }
}