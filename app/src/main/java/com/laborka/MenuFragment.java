package com.laborka;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Marek on 25.11.2015.
 */
public class MenuFragment extends Fragment {
    private MenuListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (MenuListener) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.menu, container, false);

        final View actions_button = view.findViewById(R.id.actions);
        actions_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.openAction();
            }
        });
        final View message = view.findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.openMessage();
            }
        });

        return view;
    }

    public interface MenuListener {
        void openAction();
        void openMessage();
    }
}
