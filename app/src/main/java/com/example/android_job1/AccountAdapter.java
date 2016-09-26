package com.example.android_job1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 27758 on 2016/9/26.
 */
public class AccountAdapter extends BaseAdapter{

        private List<AccountItem> mList;
        private Context mContext;


        public int getCount(){
            return mList.size();
        }
        public View getView(int position, View convertView, ViewGroup parent){

            //TextView textview = new TextView(mContext);
            AccountItem accountitem = mList.get(position);
            //textview.setText(accountitem.getText());
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.list_item,parent,false);
            TextView textview = (TextView) row.findViewById(R.id.title);
            TextView subtextview = (TextView) row.findViewById(R.id.text);
            textview.setText(accountitem.getTitle());
            subtextview.setText(accountitem.getText());
            return row;
        }
        public long getItemId(int position){
            return 0;
        }
        public AccountItem getItem(int position){
            return mList.get(position);
        }

        public AccountAdapter (List<AccountItem> list, Context context){
            mList = list;
            mContext = context;
        }
}
