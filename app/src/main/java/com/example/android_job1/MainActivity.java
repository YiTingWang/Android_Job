package com.example.android_job1;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] title = new String[]{
            "Email", "Device ID", "Version", "Date"
    };
    String[] text = new String[]{
            "", "WAS-14-0002", "2.4.6", "2016-09-20\n" + "09:11:20"
    };

    private CheckBox mCheckBox;
    private TextView mTextView;

    private CheckBox mCheckBoxs;
    private TextView mTextViews;

    private TextView mTextViewKeepDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        ListView lvACCOUNT = (ListView)findViewById(R.id.lvACCOUNT);
        List<AccountItem> list = new ArrayList<>();

        for(int i=0;i<title.length;i++){
            AccountItem account = new AccountItem(title[i],text[i]);
            list.add(account);
        }

        lvACCOUNT.setAdapter(new AccountAdapter(list,this));


        //CheckBox
        mCheckBox = (CheckBox) findViewById(R.id.checkbox);
        mCheckBoxs = (CheckBox) findViewById(R.id.checkboxs);

        mTextView = (TextView) findViewById(R.id.tvCheck);
        mTextView.setText("Camera\n"+"Current Status : Open");

        mTextViews = (TextView) findViewById(R.id.tvChecks);
        mTextViews.setVisibility(View.GONE);
        mCheckBoxs.setVisibility(View.GONE);

        OnClickListener checkBoxListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCheckBox.isChecked()) {
                    mTextViews = (TextView) findViewById(R.id.tvChecks);
                    //System.out.println("checked");
                    mTextViews.setVisibility(View.VISIBLE);
                    mCheckBoxs.setVisibility(View.VISIBLE);
                }else{
                    mTextViews.setVisibility(View.GONE);
                    mCheckBoxs.setVisibility(View.GONE);
                }
            }
        };
        mCheckBox.setOnClickListener(checkBoxListener);


        //AlertDialog
        mTextViewKeepDay = (TextView) findViewById(R.id.tvKeepDay);

//        mTextViewKeepDay.setClickable(true);
//        mTextViewKeepDay.setFocusable(true);
        OnClickListener textViewChecked = new OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogRadio myDialog = new AlertDialogRadio();
                myDialog.show(getFragmentManager(),"myDialog");
            }
        };
        mTextViewKeepDay.setOnClickListener(textViewChecked);

//        AlertDialogRadio myDialog = new AlertDialogRadio();
//        myDialog.show(this.getFragmentManager(),"myDialog");


        //TextView checklayou = (TextView)findViewById(R.id.checklayout);
        //checklayou.setAdapter(new CheckAdapter(titlecheck,this));

    }
}
