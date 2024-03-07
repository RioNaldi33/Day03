package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        
        
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.btn1) {
            Intent intent = new Intent(this, MoveActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn2) {
            Intent intent = new Intent(this, MoveWithData.class);
            intent.putExtra(MoveWithData.KEY_DATA, "Rio");
            startActivity(intent);
        } else if (v.getId() == R.id.btn3) {
            Marvel marvel = new Marvel();
            marvel.setName("Spiderman");
            marvel.setType("Human");
            marvel.setAge(12);

            Intent intent = new Intent(this, MoveWithObjectActivity.class);
            intent.putExtra(MoveWithObjectActivity.KEY_DATA,marvel);
            startActivity(intent);

        } else if (v.getId() == R.id.btn4) {
            String phone = "081263657743";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
            startActivity(intent);
        }

    }
}