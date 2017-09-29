package com.example.a42567367.lovemydogactivitys2;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class ActividadLoguearse extends AppCompatActivity {

    boolean logueado;

    Intent Registrarse;
    public String User;
    String Pass;
    public String Usuario;
    public String Direccion;
    public Activity log = this;


    public Activity getLog(){ return log;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_loguearse);
        Registrarse = new Intent(this, Informacion.class);
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

    private class Login extends AsyncTask<Void, Void, ArrayList<Usuario>> {

        @Override
        protected void onPostExecute(ArrayList<Usuario> u) {
            super.onPostExecute(u);

            for (Usuario U:u) {
                if(U.getUsuario() == null || U.getPassword() == null)
                {}
                else
                {
                    if (U.getUsuario().equals(User) && U.getPassword().equals(Pass)){

                        User = User;
                        Usuario = U.getUsuario();
                        Direccion = U.getDireccion();

                        Intent s = new Intent(getApplicationContext(), Informacion.class);
                        s.putExtra("Usuario", User);
                        startActivity(s);
                    }
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

