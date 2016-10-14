package com.example.android_job1;

import android.view.View;

/**
 * Created by 27758 on 2016/9/26.
 */
public class AccountItem {

    private String mTitle;
    private String mText;
    private float mSize;
    private boolean mCheck;
    private boolean mShowText;
    private boolean mShowCheck;
    private View.OnClickListener mListener;


    public AccountItem(String title, String text,float size) {
        mTitle = title;
        mText = text;
        mSize = size;
        mShowText = true;
        mShowCheck = false;
        mListener = new NonListener();


    }

    public AccountItem(String title,float size){
        mTitle = title;
        mSize = size;
        mListener = new NonListener();
    }

    public AccountItem(String title, String text,boolean check,float size) {
        mTitle = title;
        mText = text;
        mSize = size;
        mShowText = true;
        mShowCheck = true;
        mCheck = check;
        mListener = new NonListener();
    }

    public String getTitle (){
        return mTitle;
    }

    public String getText(){
        return mText;
    }

    public void setText(String text){
        mText = text;
    }

    public float getSize(){
        return mSize;
    }

    public void setCheck(boolean check){
        mCheck = check;
    }

    public boolean getCheck(){
        return mCheck;
    }

    public boolean getShowTextVisibility(){
        return mShowText;
    }

    public boolean getShowCheckVisibility(){
        return mShowCheck;
    }

    public View.OnClickListener getClickListener(){
        return mListener;
    }

    public void setClickListener(View.OnClickListener listener){
        mListener = listener;
    }

}

