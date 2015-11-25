package com.laborka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Marek on 25.11.2015.
 */
public class GreetingsActivity extends Activity {
    public static final String VALUE = "value";
    public static final String IS_VERTICAL = "isVertical";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.greetings);

        final View vertical = findViewById(R.id.vertical);
        final View horizontal = findViewById(R.id.horizontal);
        final TextView text = (TextView) findViewById(R.id.my_text);

        final Intent intent = getIntent();
        if (intent.getBooleanExtra(IS_VERTICAL, true)) {
            horizontal.setVisibility(View.GONE);
        } else {
            vertical.setVisibility(View.GONE);
        }

        final int value = intent.getIntExtra(VALUE, 0);
        text.setText(String.valueOf(value));
    }
}
