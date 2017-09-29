package com.example.a42567367.lovemydogactivitys2;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Informacion extends AppCompatActivity {

    public String v1;
    public String v2;
    public String v3;
    public String v4;
    public String v5;
    CheckBox uno;
    CheckBox dos;
    CheckBox tres;
    CheckBox cuatro;
    CheckBox cinco;
    String User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }

    public void Presionar(View info) {
        Button Presionado;
        Presionado = (Button) info;
        if (Presionado.getId() == R.id.Vacunas) {

            String url = "http://192.99.56.223/proyectoflor/vacunass.php?id=";
            Bundle datos = this.getIntent().getExtras();
            User= datos.getString("Usuario");
            new BuscarDatosTask().execute(url);
            Intent Vacunas;
            Vacunas = new Intent(this, Vacunas.class);
            startActivity(Vacunas);


            uno = (CheckBox) findViewById(R.id.cb45dias);
            dos = (CheckBox) findViewById(R.id.cb9semanas);
            tres = (CheckBox) findViewById(R.id.cb12semanas);
            cuatro = (CheckBox) findViewById(R.id.cb4meses);
            cinco = (CheckBox) findViewById(R.id.cb2años);


            /*
            if(v2 == null)

            {
                v2 = false;
            }
            if(v3 == null)
            {
                v3 = false;
            }
            if(v4 == null)
            {
                v4 = false;
            }
            if(v5 == null)
            {
                v5 = false;
            }
            */

           /*
            dos.setChecked(v2);
            tres.setChecked(v3);
            cuatro.setChecked(v4);
            cinco.setChecked(v5);
            */




        } else {
            if (Presionado.getId() == R.id.Veterinarias) {
                Intent Veterinarias;
                Veterinarias = new Intent(this, Veterinarias.class);
                startActivity(Veterinarias);
            } else {
                if (Presionado.getId() == R.id.Cuidados) {
                    Intent Cuidado;
                    Cuidado = new Intent(this, CuidadosDelPerro.class);
                    startActivity(Cuidado);
                }
            }
        }
    }

    private class BuscarDatosTask extends AsyncTask<String, Void, ArrayList<Vacuna>> {

        protected void onPostExecute(ArrayList<Vacuna> datos) {
            super.onPostExecute(datos);
        }

        @Override
        protected ArrayList<Vacuna> doInBackground(String... parametros) {
            String url = parametros[0];
            OkHttpClient client = new OkHttpClient();
            url = url + User;
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            try {
                Response response = client.newCall(request).execute();  // Llamo al API Rest servicio1 en ejemplo.com
                String resultado = response.body().string();
                ArrayList<Vacuna> vacunas = parsearResultado(resultado);
                return vacunas;
            } catch (IOException e) {
                Log.d("Error", e.getMessage());             // Error de Network
                return null;
            }
        }

    }

    ArrayList<Vacuna> parsearResultado(String result) {
        ArrayList<Vacuna> vac = new ArrayList<>();
        try {

            JSONArray jsonCities = new JSONArray(result);
            for (int i = 0; i < jsonCities.length(); i++) {
                JSONObject jsonResultado = jsonCities.getJSONObject(i);
                String nombre = jsonResultado.getString("Usuario");
                String vv1 = jsonResultado.getString("Vacuna1");
                String vv2 = jsonResultado.getString("Vacuna2");
                String vv3 = jsonResultado.getString("Vacuna3");
                String vv4 = jsonResultado.getString("Vacuna4");
                String vv5 = jsonResultado.getString("Vacuna5");

                Vacuna c = new Vacuna(nombre, vv1, vv2, vv3, vv4, vv5);
                vac.add(c);
            }
        } catch (JSONException e) {

            return null;
        }

        return vac;
    }
}