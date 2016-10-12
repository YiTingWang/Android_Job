package com.example.android_job1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
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
            final AccountItem accountitem = mList.get(position);
            //textview.setText(accountitem.getText());
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.list_item,parent,false);
            TextView titleview = (TextView) row.findViewById(R.id.titleCheck);
            TextView textview = (TextView) row.findViewById(R.id.text);
            final CheckBox checkbox = (CheckBox) row.findViewById(R.id.checkbox);
            row.setOnClickListener(accountitem.getClickListener());

            //final TextView othertextview = (TextView) row.findViewById(R.id.tvChecks);
            //final CheckBox othercheckbox = (CheckBox) row.findViewById(R.id.checkboxs);

            accountitem.getShowTextVisibility();
            accountitem.getShowCheckVisibility();
            titleview.setVisibility(View.VISIBLE);
            if(accountitem.getShowCheckVisibility()) {
                checkbox.setVisibility(View.VISIBLE);
//                View.OnClickListener checkBoxListener = new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if(checkbox.isChecked()) {
//                            othertextview.setVisibility(View.VISIBLE);
//                            othercheckbox.setVisibility(View.VISIBLE);
//                            textview.setText(accountitem.getText()+"Open");
//                        }else{
//                            othertextview.setVisibility(View.GONE);
//                            othercheckbox.setVisibility(View.GONE);
//                            textview.setText(accountitem.getText()+"Close");
//                        }
//                    }
//                };
//                checkbox.setOnClickListener(checkBoxListener);
            } else {
                checkbox.setVisibility(View.GONE);
            }
            if(accountitem.getShowTextVisibility()){
                textview.setVisibility(View.VISIBLE);
            } else {
                textview.setVisibility(View.GONE);
            }


            checkbox.setChecked(accountitem.getCheck());
//            accountitem.setText(accountitem.getText()+"Open");
//            textview.setText(accountitem.getText());

//            if(accountitem.getCheck()){
//                checkbox.setChecked(true);
//                System.out.println("1");
//                accountitem.setText(accountitem.getText()+"Open");
//                textview.setText(accountitem.getText());
//            }else{
//                checkbox.setChecked(false);
//                System.out.println("2");
//                accountitem.setText(accountitem.getText()+"Close");
//                textview.setText(accountitem.getText());
//            }


            titleview.setText(accountitem.getTitle());
            titleview.setTextSize(accountitem.getSize());
            textview.setText(accountitem.getText());
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
