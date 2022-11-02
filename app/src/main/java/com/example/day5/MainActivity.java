package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameText = findViewById(R.id.editTextOne);
        EditText ageText = findViewById(R.id.editTextTwo);
        Button enter = findViewById(R.id.button);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name,age;
                name = nameText.getText().toString();
                age = ageText.getText().toString();

                Intent intent = new Intent(MainActivity.this, mainActivity2.class);
                intent.putExtra("n", name);
                intent.putExtra("a", age);
                startActivity(intent);

                if (name.toString().equals("")) {
                    enter.setEnabled(false);
                } else {
                    enter.setEnabled(true);
                }

                if (age.toString().equals("")) {
                    enter.setEnabled(false);
                } else {
                    enter.setEnabled(true);
                }

            }
        });
    }
}