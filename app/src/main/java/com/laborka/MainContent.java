package com.laborka;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Marek on 25.11.2015.
 */
public class MainContent extends Activity {
    public static final String ACTION = "action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_content);

        Fragment fragment;
        if (getIntent().getBooleanExtra(ACTION, true)) {
//            fragment = new Actions();
        } else {
            fragment = new Message();
        }
//        getFragmentManager().beginTransaction().replace(R.id.placeholder, fragment).commit();
    }
}
