package com.example.a42567367.lovemypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadLoguearse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_loguearse);
    }
    public void Ir2(View Requerido)
    {
        EditText Requerid;
        Requerid = (EditText) findViewById(R.id.NombreL);
        EditText Requerid1;
        Requerid1 = (EditText) findViewById(R.id.ContraseñaL);
        Toast miMensaje;
        String mensajeAMostrar;

        if (Requerid.length() != 0 && Requerid1.length() != 0 )
        {
            Intent Registrarse;
            Registrarse= new Intent(this, ActividadInformacion.class);
            startActivity(Registrarse);
        }
        else {
        }

        if (Requerid.length()==0)
        {
            mensajeAMostrar = "Debes ingresar tu nombre";
            miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
            miMensaje.show();

        }
        else {

            if (Requerid1.length() == 0) {

                mensajeAMostrar = "Debes ingresar tu contraseña";
                miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                miMensaje.show();
            }

            }
        }

    }
