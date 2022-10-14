package com.example.a6_componenterecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Datos> listDatos;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerId);

        recycler.setHasFixedSize(true);
        Configuration orientation = new Configuration();

        if(this.recycler.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            recycler.setLayoutManager(new GridLayoutManager(this,2));
        }
        else if(this.recycler.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            recycler.setLayoutManager(new GridLayoutManager(this,4));
        };

        listDatos = new ArrayList<Datos>();

        listDatos.add(new Datos(R.drawable.usr1,"Adrián Gutierrez Nava"));
        listDatos.add(new Datos(R.drawable.usr2,"Hugo Hernández García"));
        listDatos.add(new Datos(R.drawable.usr3,"Martín Martínez López"));
        listDatos.add(new Datos(R.drawable.usr4,"Lucas Gonzáles Pérez"));
        listDatos.add(new Datos(R.drawable.usr5,"Mateo Rodríguez Sánches"));
        listDatos.add(new Datos(R.drawable.usr1,"Leo Ramírez Cruz"));
        listDatos.add(new Datos(R.drawable.usr2,"Daniel Rey Zanchez"));
        listDatos.add(new Datos(R.drawable.usr3,"Alejandro Carvajal Vargas"));
        listDatos.add(new Datos(R.drawable.usr4,"Pablo Cruz García"));
        listDatos.add(new Datos(R.drawable.usr5,"Manuel Fernánde Martínez"));
        listDatos.add(new Datos(R.drawable.usr1,"Alvaro Rodriguez Botero"));
        listDatos.add(new Datos(R.drawable.usr2,"David Polo Castellanos"));
        listDatos.add(new Datos(R.drawable.usr3,"Mario Pintor Pinzon"));
        listDatos.add(new Datos(R.drawable.usr4,"Enzo Ospina Alfonso"));
        listDatos.add(new Datos(R.drawable.usr5,"Diego Dussan Gusman"));
        listDatos.add(new Datos(R.drawable.usr1,"Marcos Torres Frias"));
        listDatos.add(new Datos(R.drawable.usr2,"Izan Gomez Delgado"));
        listDatos.add(new Datos(R.drawable.usr3,"Javier Hernandez Bravo"));
        listDatos.add(new Datos(R.drawable.usr4,"Marco Puerto Navia"));
        listDatos.add(new Datos(R.drawable.usr5,"Alex Diaz Beltran"));
        listDatos.add(new Datos(R.drawable.usr1,"Bruno Mendoza Alvear"));

        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);

    }
}