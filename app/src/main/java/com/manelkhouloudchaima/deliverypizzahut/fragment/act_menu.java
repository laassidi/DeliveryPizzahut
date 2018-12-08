package com.manelkhouloudchaima.deliverypizzahut.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toolbar;

import com.manelkhouloudchaima.deliverypizzahut.R;

import java.util.ArrayList;
import java.util.HashMap;

import static com.manelkhouloudchaima.deliverypizzahut.R.string.navigation_drawer_open;
public class act_menu extends Activity {

    NavigationView navigationView;
    DrawerLayout drawer;
    Toolbar toolbar=null;
    protected ListView maListViewPerso;
    private Toolbar supportActionBar;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);



        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        maListViewPerso = findViewById(R.id.listviewperso);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItems = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> item;

        // Titre des items
        String[] title = new String[]{
                getResources().getString(R.string.mex),
                getResources().getString(R.string.jam),
                getResources().getString(R.string.nep),
                getResources().getString(R.string.spec)};
        // Description des items
        String[] description = new String[]{
                getResources().getString(R.string.mex_description),
                getResources().getString(R.string.jam_description),
                getResources().getString(R.string.nep_description ),
                getResources().getString(R.string.spec_description)};
        // Icones (images) des items
        String[] icon = new String[]{
                String.valueOf(R.drawable.img4),
                String.valueOf(R.drawable.img5),
                String.valueOf(R.drawable.img6),
                String.valueOf(R.drawable.img7)};
        // Creation des items de la liste
        for (int i = 0; i < 4; i++) {
            item = new HashMap<>();
            // Titre
            item.put("title", title[i]);
            // Description
            item.put("description", description[i]);
            // Icone
            item.put("icon", icon[i]);
            listItems.add(item);
        }
        for (int i = 0; i < 4; i++) {
            item = new HashMap<>();
            // Titre
            item.put("title", title[i]);
            // Description
            item.put("description", description[i]);
            // Icone
            item.put("icon", icon[i]);
            listItems.add(item);
        }
        // Creation d l’Adapter
        SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(),
                listItems,
                R.layout.activity_act_menu,
                new String[] {"title", "description", "icon"},
                new int[] {R.id.title, R.id.description, R.id.icon});
        // Association de l’adapter à la liste
        maListViewPerso.setAdapter(adapter);

        // Interaction avec les items de la liste
    }

    public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {

            case R.id.nav_login:
                Intent intent1 = new Intent(act_menu.this, LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_inscription:
                Intent intent2 = new Intent(act_menu.this, Inscription.class);
                startActivity(intent2);
                break;
            case R.id.nav_act_menu:
                Intent intent3 = new Intent(act_menu.this, act_menu.class);
                startActivity(intent3);
                break;
        }
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}



