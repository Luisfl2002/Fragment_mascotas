package com.angel_fere.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Angel_Fere on 20/07/2017.
 */

public class Mascotas_favoritas  extends AppCompatActivity{

    ArrayList<Mascotas> mascotas;
    RecyclerView rmascotas;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);
        rmascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        linear.setOrientation(LinearLayoutManager.VERTICAL);
        rmascotas.setLayoutManager(linear);
        inicializarListaMascotas();
        inicializarAdaptador();

    }



    public void inicializarListaMascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascotas(R.drawable.gatito,"Alex",5));
        mascotas.add(new Mascotas(R.drawable.salchicha,"Benji",10));
        mascotas.add(new Mascotas(R.drawable.peque_ito,"Little",3));
        mascotas.add(new Mascotas(R.drawable.pug,"Gorila",8));
        mascotas.add(new Mascotas(R.drawable.lanudo,"Lanudo",7));
    }

    public void inicializarAdaptador(){

        mascotasAdaptador adaptador = new mascotasAdaptador(mascotas,this);
        rmascotas.setAdapter(adaptador);

    }


}
