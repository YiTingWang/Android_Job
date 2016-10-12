package com.example.android_job1;

import android.content.DialogInterface;
import android.view.View;

/**
 * Created by 27758 on 2016/10/7.
 */
public class RadioListener implements View.OnClickListener{
    private MainActivity mMainActivity;
    private String mTitle;
    private String mMessage;

    public RadioListener(MainActivity activity) {
        mMainActivity = activity;
    }
    public void onClick(View v) {
        AlertDialogRadio myDialog = new AlertDialogRadio();
        myDialog.show(mMainActivity.getFragmentManager(),"myDialog");
    }

}
