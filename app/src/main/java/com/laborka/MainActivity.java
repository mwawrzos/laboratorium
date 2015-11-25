package com.laborka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Marek on 25.11.2015.
 */
public class MainActivity extends Activity implements MenuFragment.MenuListener {

    private View placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        placeholder = findViewById(R.id.placeholder);

        setContentView(R.layout.main_activity);
    }

    @Override
    public void openAction() {
        if (getResources().getBoolean(R.bool.dualPanel)) {
//            getFragmentManager().beginTransaction().replace(R.id.placeholder, new Actions()).commit();
        } else {
            final Intent intent = new Intent(this, MainContent.class);
            intent.putExtra(MainContent.ACTION, true);
            startActivity(intent);
        }
    }

    @Override
    public void openMessage() {
        if (getResources().getBoolean(R.bool.dualPanel)) {
            getFragmentManager().beginTransaction().replace(R.id.placeholder, new Message()).commit();
        } else {
            final Intent intent = new Intent(this, MainContent.class);
            intent.putExtra(MainContent.ACTION, false);
            startActivity(intent);
        }
    }
}
