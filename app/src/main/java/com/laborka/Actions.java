package com.laborka;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by Marek on 25.11.2015.
 */
public class Actions extends Activity {

    private Switch  isVertical;
    private SeekBar value;

    private void buttonClickListener(Activity activity) {
        // tutaj kod do otworzenia nowej aktywności
    }

    private void prepare(final Activity view) {
        Button button = (Button) view.findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickListener(view);
            }
        });
        value = (SeekBar) view.findViewById(R.id.value);
        isVertical = (Switch) view.findViewById(R.id.isVertical);
        isVertical.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                value.setRotation(isChecked ? -90 : 0);
            }
        });
    }

    private void prepare(View view, final Activity activity) {
        Button button = (Button) view.findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClickListener(activity);
            }
        });
        value = (SeekBar) view.findViewById(R.id.value);
        isVertical = (Switch) view.findViewById(R.id.isVertical);
        isVertical.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                value.setRotation(isChecked ? -90 : 0);
            }
        });
    }
}
