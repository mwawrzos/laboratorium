package com.laborka;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by Marek on 25.11.2015.
 */
public class Actions extends Fragment {

    private Switch  isVertical;
    private SeekBar value;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.actions);
//
//        prepare(this);
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.actions, container, false);

        prepare(view, getActivity());

        return view;
    }

    private void prepare(final Activity view) {
        Button button = (Button) view.findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(view);
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
                next(activity);
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

    private void next(Activity activity) {
        Intent intent = new Intent(activity, GreetingsActivity.class);
        intent.putExtra(GreetingsActivity.VALUE, value.getProgress());
        intent.putExtra(GreetingsActivity.IS_VERTICAL, isVertical.isChecked());
        startActivity(intent);
    }
}
