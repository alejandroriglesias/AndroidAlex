 package com.example.prueba_vt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

 public class MainActivity<registerReceiver> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String texto = "onCreate";
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }

    Intent intent = new Intent(this, ServicioViernes.class);
     @Override
     public ComponentName startService(Intent service) {
         return super.startService(intent);
     }

     @Override
     public boolean stopService(Intent name) {
         return super.stopService(intent );
     }

     BroadcastReceiver rviernes = new ReceiverViernes();
     IntentFilter filtro = new IntentFilter(Intent.ACTION_HEADSET_PLUG);    //ES NECESARIO REGISTRAR ESTO EN EL MAIN
     this.registerReceiver(rviernes, filtro);

     @Override
     protected void onStart(){
        super.onStart();
         String texto = "onStart";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }


     @Override
     protected void onRestart(){
         super.onRestart();
         String texto = "onRestart";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onPause(){
         super.onPause();
         String texto = "onPause";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onResume(){
         super.onResume();
         String texto = "onResume";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }
     @Override
     protected void onStop(){
         super.onStop();
         String texto = "onStop";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onDestroy(){
         super.onDestroy();
         String texto = "onDestroy";
         Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
     }

     public void irAMain2Activity(View view) {
        Intent intent = new Intent (MainActivity.this, Main2Activity.class);
        startActivity(intent);
        finish();
     }

     public void changeActivityForResult(View view) {
        Intent intent = new Intent (MainActivity.this, Activity2.class);
        intent.putExtra("name", " ******HOLA, SOY UNA APP:-)***** ");
        startActivity(intent);
     }
 }