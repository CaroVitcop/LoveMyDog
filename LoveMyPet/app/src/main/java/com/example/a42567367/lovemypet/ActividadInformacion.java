package com.example.a42567367.lovemypet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ActividadInformacion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_informacion);

        TextView  myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("Evita cargarlo constantemente: Trata de resistir esta tentación, porque su cuerpo es muy delicado. Si lo haces, primero coloca una mano sobre su parte posterior y otra bajo el pecho, levántalo con ambas manos y mantenlo junto a tu cuerpo para que se sienta seguro. ");
        TextView myTextView1 = (TextView) findViewById(R.id.myTextView1);
        myTextView1.setText("Horario para sus necesidades: Establece una rutina regular de alimentación; si se trata de un perro, sácalo de paseo con frecuencia para que haga sus necesidades, especialmente cuando se despierte. Si le ves caminar en círculos o gimiendo cerca de la puerta, son signos seguros de que necesita salir al exterior rápidamente.");
        TextView myTextView2 = (TextView) findViewById(R.id.myTextView2);
        myTextView2.setText("Cuida su higiene: El cepillado regular es esencial para los perros jóvenes, debido a que elimina el pelo muerto, la suciedad y los parásitos; además, estimula el aporte de sangre hacia la piel, lo que genera un pelaje de aspecto más sano y brillante. Utiliza un equipo especial para esta acción");
        TextView myTextView3 = (TextView) findViewById(R.id.myTextView3);
        myTextView3.setText("Supervisa su dentición y masticación: Para ayudar a que salgan todos los dientes y deje de morder los muebles, tu cachorro necesitará algún objeto indestructible como puede ser un hueso de goma o una pelota para masticar. Asegúrate de que estos productos tienen el tamaño adecuado para que no los pueda tragar. Evita los huesos de verdad, ya que pueden astillarse y asfixiarle. Para controlar el sarro y la placa dental, es aconsejable nutrirlo con un alimento seco, ya que le ayudará a aflojar los dientes de leche y acelerar así el proceso de dentición. Si la boca de tu cachorro es muy sensible, ablanda la comida sumergiéndola primero en agua.");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actividad_informacion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
