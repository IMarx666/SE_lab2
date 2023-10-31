package com.example.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends Activity {

    private int count = 0;
    private Button incrementButton;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        incrementButton = findViewById(R.id.btn_add);
        countTextView = findViewById(R.id.countTextView);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countTextView.setText(String.valueOf(count));
            }
        });
    }
}
