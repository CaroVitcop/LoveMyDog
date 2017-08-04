package com.example.a42567367.lovemypet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

public class ActividadLoguearse extends AppCompatActivity {



    boolean logueado;

    Intent Registrarse;
    String User;
    String Pass;
    public String Usuario;
    public String Direccion;
    public Activity log = this;


    public Activity getLog(){ return log;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_loguearse);
        Registrarse = new Intent(this, ActividadInformacion.class);

    }


    public void Ir2(View Requerido) {
        EditText edtUser;
        edtUser = (EditText) findViewById(R.id.NombreL);
        User = edtUser.getText().toString();
        EditText edtPass;
        edtPass= (EditText) findViewById(R.id.ContraseñaL);
        Pass = edtPass.getText().toString();
        edtUser.findViewById(R.id.NombreL);
        Toast miMensaje;
        String mensajeAMostrar;
        new Login().execute();
        if (User.length() != 0 && Pass.length() != 0) {



        } else {


            if (User.length() == 0) {
                mensajeAMostrar = "Debes ingresar tu nombre";
                miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                miMensaje.show();
            } else {

                if (Pass.length() == 0) {

                    mensajeAMostrar = "Debes ingresar tu contraseña";
                    miMensaje = Toast.makeText(this, mensajeAMostrar, Toast.LENGTH_LONG);
                    miMensaje.show();
                }

            }
        }
    }
    ArrayList<Usuario> parseResultGSON(String resultado) {
        Gson gson = new GsonBuilder().create();
        Usuario[] arr = gson.fromJson(resultado, Usuario[].class);
        return new ArrayList<>(Arrays.asList(arr));
    }

    private class Login extends AsyncTask<Void, Void, ArrayList<Usuario>>{

        @Override
        protected void onPostExecute(ArrayList<Usuario> u) {
            super.onPostExecute(u);

            for (Usuario U:u
                 ) {
                if (U.getUsuario().equals(User) && U.getPassword().equals(Pass)){

                    Usuario = U.getUsuario();
                    Direccion = U.getDireccion();
                        startActivity(Registrarse);
                    }
            }
        }
        @Override
        protected ArrayList<Usuario> doInBackground(Void... Parametros){
            ArrayList<Usuario> U = new ArrayList<>();
            String url = "http://192.99.56.223/proyectoflor/login.php";

            HttpHandler sh = new HttpHandler(getApplicationContext());
            String jsonStr;

            if (sh.makeServiceCall(url) != null)
                jsonStr = sh.makeServiceCall(url);
            else
                return null;

            U = parseResultGSON(jsonStr);;
            return U;

        }
    }
    }


