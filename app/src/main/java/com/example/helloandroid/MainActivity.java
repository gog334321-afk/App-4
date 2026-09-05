package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        label = new TextView(this);
        label.setText("Hello");
        label.setTextSize(24);
        label.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setText("press");

        button.setOnClickListener(v -> {
            label.setText("world");
        });

        layout.addView(button);
        layout.addView(label);

        setContentView(layout);
    }
          }
