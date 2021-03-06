package com.example.android_job1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/**
 * Created by 27758 on 2016/9/29.
 */
public class AlertDialogRadio extends DialogFragment {

    final String[] items = new String[] {"5 Days","10 Days","20 Days","30 Days"};
    private String selection;

    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Keep Day").setSingleChoiceItems(items, -1, new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        selection = (String) items[which];
                        break;
                    case 1:
                        selection = (String) items[which];
                        break;
                    case 2:
                        selection = (String) items[which];
                        break;
                    case 3:
                        selection = (String) items[which];
                        break;
                }
                //dismiss();
            }
        }).setNegativeButton("取消",null);
        return builder.create();
    }

}

