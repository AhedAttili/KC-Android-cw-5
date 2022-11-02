package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = findViewById(R.id.textViewName);
        TextView ageText = findViewById(R.id.textViewAge);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("n");
        String age = bundle.getString("a");

        nameText.setText(name);
        ageText.setText(age);
    }
}