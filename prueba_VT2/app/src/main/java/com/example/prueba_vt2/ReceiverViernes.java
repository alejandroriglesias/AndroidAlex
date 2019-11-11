package com.example.prueba_vt2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ReceiverViernes extends BroadcastReceiver {
    private final String headset = "android.intent.action.HEADSET_PLUG";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() !=null){
            if (intent.getAction().equals(headset)){
                Bundle bundle = intent.getExtras();
                if (bundle != null){
                        switch (bundle.getInt("state")){ //STATE ES DONDE ESTAN LOS KEYS DE HEADSET PLUG (0 y 1)
                            case 0:
                                Toast.makeText(context, "Auriculares desconectados", Toast.LENGTH_LONG).show();
                                break;
                            case 1:
                                Toast.makeText(context, "Auriculares conectados", Toast.LENGTH_LONG).show();
                                break;
                        }       //AHORA A DECLARARLO EN EL MANIFEST
                }
            }
        }
    }
}
