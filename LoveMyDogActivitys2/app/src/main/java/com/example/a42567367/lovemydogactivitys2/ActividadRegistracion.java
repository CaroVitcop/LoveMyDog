package com.example.a42567367.lovemydogactivitys2;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ActividadRegistracion extends AppCompatActivity {
    String usuario;
    String pass;
    String dir;
    String diralt;
    String nombredelperro;
    String pesoperro;
    String raza;
    String nombrefamiliar1;
    String nombrefamiliar2;
    String nombrefamiliar3;
    String celu1;
    String celu2;
    String celu3;
    Intent Registrarse;


    Boolean Registrado =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_registracion);

        String[] names=new String []{
                "American Staffordshire Terrier","American Water Spaniel","Antiguo Pastor Inglés","Bichón Maltés",
                "Bobtail","Border Collie","Boston Terrier","Boxer","Bull Terrier","Americano","Francés",
                "Inglés","Boyero de berna","Bulldog","Caniche","Carlino","Chihuahua","Cirneco del Etna","Chow Chow","Dálmata",
                "Dobermann","Dogo Alemán","Dogo Argentino","Dogo de Burdeos","Fox Terrier","Finlandés","Foxhound Americano","Foxhound Inglés","Pastor Alemán",
                "Pastor Australiano","Pekinés","Pitbull","Rottweiler","San Bernardo","Scottish Terrier","Terranova",
                "Terrier Australiano",
                "Terrier Escocés" ,"Terrier Irlandés",
                "Yorkshire Terrier"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, names);

        Spinner spn;
        spn=(Spinner)findViewById(R.id.raza);
        spn.setAdapter(adapter);
    }
    public void Ir(View Requerido) {

        EditText usuarioedt = (EditText) findViewById(R.id.NombreR);
        EditText passedt = (EditText) findViewById(R.id.ContraseñaR);
        EditText diredt = (EditText) findViewById(R.id.DireccionR);
        EditText direaltdt = (EditText) findViewById(R.id.DireccionaltR);
        EditText nombreperroedt= (EditText) findViewById(R.id.NombreperroeR);
        EditText pesodelperroedt = (EditText) findViewById(R.id.pesoPerro);
        Spinner razaedt = (Spinner) findViewById(R.id.raza);
        EditText nombrefamedt = (EditText) findViewById(R.id.Nombredelfamiliar1R);
        EditText nombrefamedt2 = (EditText) findViewById(R.id.Nombredelfamiliar2R);
        EditText nombrefamedt3 = (EditText) findViewById(R.id.Nombredelfamiliar3R);
        EditText celuedt = (EditText) findViewById(R.id.Celulardefamiliar1R);
        EditText celuedt2 = (EditText) findViewById(R.id.Celulardelfamiliar2R);
        EditText celuedt3 = (EditText) findViewById(R.id.Celulardefamiliar3R);
        usuario = usuarioedt.getText().toString();
        pass = passedt.getText().toString();
        dir = diredt.getText().toString();
        diralt = direaltdt.getText().toString();
        nombredelperro = nombreperroedt.getText().toString();
        pesoperro = pesodelperroedt.getText().toString();
        raza = razaedt.getSelectedItem().toString();
        nombrefamiliar1 = nombrefamedt.getText().toString();
        nombrefamiliar2 = nombrefamedt2.getText().toString();
        nombrefamiliar3 = nombrefamedt3.getText().toString();
        celu1 = celuedt.getText().toString();
        celu2 = celuedt2.getText().toString();
        celu3 = celuedt3.getText().toString();

        Registra(new String[]{
                usuario, pass, dir, diralt, nombredelperro,
                pesoperro,raza, nombrefamiliar1 , celu1, nombrefamiliar2, celu2, nombrefamiliar3, celu3
        });
        Registrarse= new Intent(this, ActividadLoguearse.class);


       /* Toast miMensaje;
        String mensajeAMostrar;*/
        if (Registrado){

        }
      /*  else
            {
                Toast.makeText(ActividadRegistracion.this, "El Usuario se creo con exito", Toast.LENGTH_LONG).show();
            }*/


      /*  if (Requerid.length() != 0 && Requerid2.length() != 0 && Requerid3.length() !=0 && Requerid.length() !=0)
        {
            Intent Registrarse;
            Registrarse= new Intent(this, ActividadLoguearse.class);
            startActivity(Registrarse);
        }
        else {
    }

        if (Requerid.length()==0)
          {
              mensajeAMostrar = "Debes ingresar tu nombre de usuario";
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
        }*/


    }
    private void Registra(String[] params){
        new Registrame().execute(params[0], params[1], params[2], params[3], params[4], params[5], params[6],
                params[7], params[8], params[9], params[10], params[11], params[12]);
    }
    private class Registrame extends AsyncTask<String, Void, String> {

        protected void onPostExecute(String datos) {
            super.onPostExecute(datos);


            if (Registrado) {
                Toast.makeText(ActividadRegistracion.this, "El Usuario se creo con exito", Toast.LENGTH_LONG).show();
                startActivity(Registrarse);

            }
        }

        @Override
        protected String doInBackground(String... parametros) {


            OkHttpClient client = new OkHttpClient();
            client.newBuilder().connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS).build();

            if (parametros[0].trim().length() > 0 && parametros[1].trim().length() > 0 &&
                    parametros[2].trim().length() > 0 && parametros[3].trim().length() > 0 &&
                    parametros[4].trim().length() > 0) {


                RequestBody requestBody = new MultipartBody.Builder()
                        .setType(MultipartBody.FORM)
                        .addFormDataPart("Usuario", parametros[0])
                        .addFormDataPart("Password", parametros[1])
                        .addFormDataPart("Direccion", parametros[2])
                        .addFormDataPart("DireccionAlternativa", parametros[3])
                        .addFormDataPart("NombrePerro", parametros[4])
                        .addFormDataPart("PesoPerro", parametros[5])
                        .addFormDataPart("RazaPerro", parametros[6])
                        .addFormDataPart("Nombrefamiliar1", parametros[7])
                        .addFormDataPart("Celularfamiliar1", parametros[8])
                        .addFormDataPart("Nombrefamiliar2", parametros[9])
                        .addFormDataPart("Celularfamiliar2", parametros[10])
                        .addFormDataPart("Nombrefamiliar3", parametros[11])
                        .addFormDataPart("Celularfamiliar3", parametros[12])
                        .build();

                Registrado = true;


                Request request = new Request.Builder()
                        .url("http://192.99.56.223/proyectoflor/registrarse.php")
                        .method("POST", RequestBody.create(null, new byte[0]))
                        .post(requestBody)
                        .build();

                try {
                    Response response = client.newCall(request).execute();
                    String resultado = response.body().string();
                    return resultado;
                } catch (Exception e) {
                    Log.d("Debug", e.getMessage());
                    //mostrarError(e.getMessage()); // Error de Network
                    return "error";
                }
            } else {
                return "faltanDatos";
            }
        }
    }
}
