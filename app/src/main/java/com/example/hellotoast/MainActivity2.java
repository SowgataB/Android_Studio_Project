package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int count = getIntent().getIntExtra("COUNT_VALUE", 0);

        TextView helloTextView = findViewById(R.id.hello_text);
        TextView countTextView = findViewById(R.id.count_text);

        helloTextView.setText("Hello!");
        countTextView.setText(String.valueOf(count));
    }
}
