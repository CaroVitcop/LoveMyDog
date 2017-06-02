package com.example.a42567367.lovemypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.PrivateKey;


public class ActividadRegistracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_registracion);

    }


    public void Ir(View Requerido) {
        EditText Requerid;
        Requerid = (EditText) findViewById(R.id.NombreR);
        EditText Requerid4;
        Requerid4 = (EditText) findViewById(R.id.ContraseñaR);
        EditText Requerid2;
        Requerid2 = (EditText) findViewById(R.id.DireccionR);
        EditText Requerid3;
        Requerid3 = (EditText) findViewById(R.id.NombreperroeR);
        Toast miMensaje;
        String mensajeAMostrar;

        if (Requerid.length() != 0 && Requerid2.length() != 0 && Requerid3.length() !=0 && Requerid.length() !=0)
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

            if (Requerid4.length() == 0) {

                mensajeAMostrar = "Debes ingresar una contraseña";
                miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                miMensaje.show();
            } else {

                if (Requerid2.length() == 0) {

                    mensajeAMostrar = "Debes ingresar una direccion";
                    miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                    miMensaje.show();
                } else {
                    if (Requerid3.length() == 0) {
                        mensajeAMostrar = "Debes ingresar el nombre de tu perro";
                        miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                        miMensaje.show();
                    }
                }

            }
        }
        String[] names=new String []{
                "American Staffordshire Terrier","American Water Spaniel","Antiguo Pastor Inglés","Bichón Maltés",
                "Bobtail","Border Collie","Boston Terrier","Boxer","Bull Terrier","Americano","Francés",
                "Inglés","Boyero de berna","Bulldog","Caniche","Carlino","Chihuahua","Cirneco del Etna","Chow Chow","Dálmata",
            "Dobermann","Dogo Alemán","Dogo Argentino","Dogo de Burdeos","Fox Terrier","Finlandés","Foxhound Americano","Foxhound Inglés","Pastor Alemán",
                "Pastor Australiano","Pekinés","Pitbull","Rottweiler","San Bernardo","Scottish Terrier","Terranova",
                "Terrier Australiano",
            "Terrier Escocés" ,"Terrier Irlandés",
            "Yorkshire Terrier"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, names);

        Spinner spn;
        spn=(Spinner)findViewById(R.id.raza);
        spn.setAdapter(adapter);

    }

}