package com.example.android_job1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvACCOUNT = (ListView)findViewById(R.id.lvACCOUNT);
        List<AccountItem> list = new ArrayList<>();

        for(int i=0;i<title.length;i++){
            AccountItem account = new AccountItem(title[i],text[i]);
            list.add(account);
        }

        lvACCOUNT.setAdapter(new AccountAdapter(list,this));

    }
}
