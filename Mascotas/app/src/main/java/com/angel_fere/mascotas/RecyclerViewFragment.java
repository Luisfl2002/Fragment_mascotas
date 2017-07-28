package com.angel_fere.mascotas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Angel_Fere on 25/07/2017.
 */

public class RecyclerViewFragment extends Fragment{

    ArrayList<Mascotas> mascotas;
    RecyclerView listaMascotas;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_mascota, container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvfmascotas);
        LinearLayoutManager l = new LinearLayoutManager(getActivity());
        l.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(l);
        inicializarListaMascotas();
        inicializarAdaptador();
        return v;
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

        mascotasAdaptador adaptador = new mascotasAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }
}