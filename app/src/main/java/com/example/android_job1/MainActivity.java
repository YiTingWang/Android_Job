package com.example.android_job1;

import android.app.AlertDialog;
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

    String[] title = new String[] {"Email", "Device ID", "Version", "Date"};
    String[] text = new String[] {"box02@walton.com.tw", "WAS-14-0002", "2.4.6", "2016-09-20 " + "09:11:20"};

    private CheckBox mCheckBox;
    private TextView mTextView;

    private CheckBox mCheckBoxs;
    private TextView mTextViews;

    private TextView mTextViewKeepDay;
    private TextView mTextViewErase;
    private TextView mTextViewSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /******************************ListView******************************/
        ListView lvACCOUNT = (ListView)findViewById(R.id.lvACCOUNT);
        List<AccountItem> list = new ArrayList<>();

        //list.add(new AccountItem("ACCOUNT",30));
        for(int i=0;i<title.length;i++){
            //AccountItem account = new AccountItem(title[i],text[i]);
            list.add(new AccountItem(title[i],text[i],15));
        }

        AccountAdapter accountAdapter = new AccountAdapter(list,this);

        AccountItem accountItem = new AccountItem("Camera","Currennt Status:",false,15);
        CheckListener checkListener = new CheckListener(accountItem,accountAdapter);
        accountItem.setClickListener(checkListener);
        list.add(accountItem);

        AccountItem accountItem1 = new AccountItem("Used Disk Space",15);
        ChangeListener changeListener = new ChangeListener(MainActivity.this);
        accountItem1.setClickListener(changeListener);
        list.add(accountItem1);

        AccountItem accountItem2 = new AccountItem("Keep Day","Default keep days",15);
        RadioListener radioListener = new RadioListener(MainActivity.this);
        accountItem2.setClickListener(radioListener);
        list.add(accountItem2);

        list.add(new AccountItem("Legal and Privacy",15));

        AccountItem accountItem3 = new AccountItem("Erase","Erase all offline file",15);
        ConfirmListener confirmListener = new ConfirmListener(MainActivity.this,"Erase","Erase all offline file");
        accountItem3.setClickListener(confirmListener);
        list.add(accountItem3);

        AccountItem accountItem4 = new AccountItem("Sign out",15);
        ConfirmListener confirmListener1 = new ConfirmListener(MainActivity.this,"Sign out","Ready to logout?");
        accountItem4.setClickListener(confirmListener1);
        list.add(accountItem4);


        lvACCOUNT.setAdapter(accountAdapter);


//        ListView lvSETTING = (ListView)findViewById(R.id.lvSETTING);
//        List<AccountItem> list2 = new ArrayList<>();
//
//        list2.add(new AccountItem("Camera","Currennt Status:",false,15));
//        list2.add(new AccountItem("Used Disk Space\n",15));
//        list2.add(new AccountItem("Keep Day","Default keep days",15));
//
//        list2.add(new AccountItem("Legal and Privacy\n",15));
//        list2.add(new AccountItem("Erase","Erase all offline file",15));
//        list2.add(new AccountItem("Sign out\n",15));
//
//        lvSETTING.setAdapter(new AccountAdapter(list2,this));


        /******************************CheckBox******************************/
        mCheckBox = (CheckBox) findViewById(R.id.checkbox);
        mCheckBoxs = (CheckBox) findViewById(R.id.checkboxs);

        mTextView = (TextView) findViewById(R.id.tvCheck);
        mTextViews = (TextView) findViewById(R.id.tvChecks);

//        mTextViews.setVisibility(View.GONE);
//        mCheckBoxs.setVisibility(View.GONE);

        //mCheckBox.setOnClickListener(new CheckListener());

//        mTextViews.setVisibility(View.GONE);
//        mCheckBoxs.setVisibility(View.GONE);

//        OnClickListener checkBoxListener = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mCheckBox.isChecked()) {
//                    mTextViews = (TextView) findViewById(R.id.tvChecks);
//                    //System.out.println("checked");
//                    mTextViews.setVisibility(View.VISIBLE);
//                    mCheckBoxs.setVisibility(View.VISIBLE);
//                    mTextView.setText(getString(R.string.tvCheck)+"Open");
//                }else{
//                    mTextViews.setVisibility(View.GONE);
//                    mCheckBoxs.setVisibility(View.GONE);
//                    mTextView.setText(getString(R.string.tvCheck)+"Close");
//                }
//            }
//        };
        //mCheckBox.setOnClickListener(checkBoxListener);


        /******************************AlertDialog with radiobutton******************************/
        mTextViewKeepDay = (TextView) findViewById(R.id.tvKeepDay);

        //mTextViewKeepDay.setClickable(true);
        //mTextViewKeepDay.setFocusable(true);
//        OnClickListener textViewChecked = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialogRadio myDialog = new AlertDialogRadio();
//                myDialog.show(getFragmentManager(),"myDialog");
//            }
//        };
        mTextViewKeepDay.setOnClickListener(new RadioListener(MainActivity.this));

        //AlertDialogRadio myDialog = new AlertDialogRadio();
        //myDialog.show(this.getFragmentManager(),"myDialog");


        /******************************AlertDialog(Eraser)******************************/
        mTextViewErase = (TextView)findViewById(R.id.tvErase);

//        OnClickListener textViewErase = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Erase");
//                builder.setMessage("Erase all offline file");
//                //builder.setCancelable(false);   //不能使用手機返回鑑離開AlertDialog
//                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                AlertDialog erase = builder.create();
//                erase.show();
//            }
//        };
        mTextViewErase.setOnClickListener(new ConfirmListener(MainActivity.this,"Erase","Erase all offline file"));


        /******************************AlertDialog(SignOut)******************************/
        mTextViewSignOut = (TextView) findViewById(R.id.tvSignOut);

//        OnClickListener textViewSignOut = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Sign out");
//                builder.setMessage("Ready to logout?");
//                //builder.setCancelable(false);   //不能使用手機返回鑑離開AlertDialog
//                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                AlertDialog signout = builder.create();
//                signout.show();
//            }
//        };
        mTextViewSignOut.setOnClickListener(new ConfirmListener(MainActivity.this,"Sign out","Ready to logout?"));

    }
}

