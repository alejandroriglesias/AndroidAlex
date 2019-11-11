package com.example.prueba_vt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void volverAmain(View view) {
        Intent intent = new Intent (Main2Activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
