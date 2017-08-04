package com.example.a42567367.lovemypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
    }
        public void PresionarBoton(View  Vistarecibida)

        {
            Button Botonpresionado;
            Botonpresionado=(Button) Vistarecibida;
            if (Botonpresionado.getId()== R.id.Registrarse)
            {
                Intent Registrarse;
                Registrarse= new Intent(this, ActividadRegistracion.class);
                startActivity(Registrarse);

            }
            else
                {
                    if (Botonpresionado.getId()==R.id.loguearse)
                    {
                        Intent Loguearse;
                        Loguearse= new Intent(this, ActividadLoguearse.class);
                        startActivity(Loguearse);
                    }
                }
        }

        
    }


