package com.example.android_job1;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by 27758 on 2016/10/11.
 */
public class CheckListener implements View.OnClickListener {
//    private MainActivity mMainActivity;
//    private CheckBox mCheckBox;
//    private CheckBox mCheckBoxs;
//    private TextView mTextView;
//    private TextView mTextViews;

    private AccountItem mAccountItem;
    private AccountAdapter mAccountAdapter;
    private String mSetText;


//    public CheckListener (MainActivity activity, CheckBox checkbox,CheckBox checkBoxs,TextView textView,TextView textViews){
//        mMainActivity = activity;
//        mCheckBox = checkbox;
//        mCheckBoxs = checkBoxs;
//        mTextView = textView;
//        mTextViews = textViews;
//
////        mTextView.setText(mMainActivity.getString(R.string.tvCheck)+"Close");
////        mTextViews.setVisibility(View.GONE);
////        mCheckBoxs.setVisibility(View.GONE);
//
//
//    }

    public CheckListener (AccountItem accountItem,AccountAdapter accountAdapter){
        mAccountItem = accountItem;
        mAccountAdapter = accountAdapter;

    }


    public void onClick(View v){
        mAccountItem.setCheck(!mAccountItem.getCheck());

//        if(mAccountItem.getCheck()){
//            mSetText = mAccountItem.getText()+"Open";
//            mAccountItem.setText(mSetText);
//            System.out.println(mAccountItem.getText());
//            System.out.println("1");
//        }else{
//            mSetText = mAccountItem.getText()+"Close";
//            mAccountItem.setText(mSetText);
//            System.out.println(mAccountItem.getText());
//            System.out.println("2");
//        }

        System.out.println(mAccountItem.getCheck());
        mAccountAdapter.notifyDataSetChanged();




//        mTextViews.setVisibility(View.GONE);
//        mCheckBoxs.setVisibility(View.GONE);

//        if(mCheckBox.isChecked()) {
//            mTextViews = (TextView) mMainActivity.findViewById(R.id.tvChecks);
//            mTextViews.setVisibility(View.VISIBLE);
//            mCheckBoxs.setVisibility(View.VISIBLE);
//            mTextView.setText(mMainActivity.getString(R.string.tvCheck)+"Open");
//        }else{
//            mTextViews.setVisibility(View.GONE);
//            mCheckBoxs.setVisibility(View.GONE);
//            mTextView.setText(mMainActivity.getString(R.string.tvCheck)+"Close");
//        }
    }

}
