package com.example.android_job1;

import android.view.View;

/**
 * Created by 27758 on 2016/10/11.
 */
public class NonListener implements View.OnClickListener{


    @Override
    public void onClick(View v) {
       System.out.println("click");
    }

}
