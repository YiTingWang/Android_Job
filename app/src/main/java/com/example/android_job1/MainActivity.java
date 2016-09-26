package com.example.android_job1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

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
        List<HashMap<String , String>> list = new ArrayList<>();

        for(int i=0;i<title.length;i++){
            HashMap<String , String> hashMap = new HashMap<>();
            hashMap.put("title",title[i]);
            hashMap.put("text",text[i]);
            list.add(hashMap);
        }

        ListAdapter listAdapter = new SimpleAdapter(
          this,list,android.R.layout.simple_list_item_2,new String[]{"title","text"},new int[]{android.R.id.text1,android.R.id.text2}
        );
        lvACCOUNT.setAdapter(listAdapter);
    }
}
