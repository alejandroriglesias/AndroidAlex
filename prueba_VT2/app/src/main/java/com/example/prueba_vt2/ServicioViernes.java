package com.example.prueba_vt2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServicioViernes extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {      //AQUÍ VA LA LÓGICA
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {       //AQUÍ DESTRUIMOS EL SERVICIO (IMPORTANTE)
        super.onDestroy();          //AHORA HAY QUE DECLARAR EL SERVICIO EN EL MANIFEST (res--> Androidmanifest.xml)
    }
}
