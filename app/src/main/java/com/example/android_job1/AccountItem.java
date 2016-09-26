package com.example.android_job1;

/**
 * Created by 27758 on 2016/9/26.
 */
public class AccountItem {

    private String mTitle;
    private String mText;

    public AccountItem(String title, String text) {
        mTitle = title;
        mText = text;
    }

    public String getTitle (){
        return mTitle;
    }

    public String getText(){
        return mText;
    }

}

