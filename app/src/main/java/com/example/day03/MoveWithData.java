package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithData extends AppCompatActivity {
    public static final  String KEY_DATA = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        String name = getIntent().getStringExtra(KEY_DATA);

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(name);

    }
}