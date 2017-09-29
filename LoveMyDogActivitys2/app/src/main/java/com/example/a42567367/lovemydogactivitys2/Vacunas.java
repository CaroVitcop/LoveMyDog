package com.example.a42567367.lovemydogactivitys2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.BoringLayout;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Vacunas extends AppCompatActivity {

    public Boolean v1;
    public Boolean v2;
    public Boolean v3;
    public Boolean v4;
    public Boolean v5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunas);
    }

    public void PresionarBoton(View vista) {
        new Vacunaas().execute();


        CheckBox uno = (CheckBox) findViewById(R.id.cb45dias);
        CheckBox dos = (CheckBox) findViewById(R.id.cb9semanas);
        CheckBox tres = (CheckBox) findViewById(R.id.cb12semanas);
        CheckBox cuatro = (CheckBox) findViewById(R.id.cb4meses);
        CheckBox cinco = (CheckBox) findViewById(R.id.cb2años);

        if (uno.isChecked() == true) {
            v1 = true;
        }
        if (dos.isChecked() == true) {
            v2 = true;
        }
        if (tres.isChecked() == true) {
            v3 = true;
        }
        if (cuatro.isChecked() == true) {
            v4 = true;
        }
        if (cinco.isChecked() == true) {
            v5 = true;
        }

    }

    String parseResultGSON(String resultado) {
        Gson gson = new GsonBuilder().create();
        Vacuna[] arr = gson.fromJson(resultado, Vacuna[].class);
        return resultado;
    }

    private class Vacunaas extends AsyncTask<Boolean,Boolean, Boolean> {

        protected Boolean doInBackground(Boolean... Parametros) {
            OkHttpClient client = new OkHttpClient();
            client.newBuilder().connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS).build();

            ActividadLoguearse O = new ActividadLoguearse();

            RequestBody requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("Usuario", O.Usuario)
                    .addFormDataPart("Vacuna1", v1.toString())
                    .addFormDataPart("Vacuna2", v2.toString())
                    .addFormDataPart("Vacuna3", v3.toString())
                    .addFormDataPart("Vacuna4", v4.toString())
                    .addFormDataPart("Vacuna5", v5.toString())
                    .build();


            Request request = new Request.Builder()
                    .url("http://192.99.56.223/proyectoflor/vacunas.php")
                    .method("POST", RequestBody.create(null, new byte[0]))
                    .post(requestBody)
                    .build();

            try {
                Response response = client.newCall(request).execute();
                String resultado = response.body().string();
                return true;
            } catch (Exception e) {
                Log.d("Debug", e.getMessage());
                //mostrarError(e.getMessage()); // Error de Network
                return false;
            }
        }

    }
}
