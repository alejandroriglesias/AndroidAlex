package com.example.prueba_vt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if (extras !=null) {
            String name = extras.getString("name");
            textView.setText(name);
            //Toast.makeText(this, name, Toast.LENGTH_LONG).show();
        }
    }
}
