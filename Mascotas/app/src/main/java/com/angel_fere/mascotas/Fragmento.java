package com.angel_fere.mascotas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Angel_Fere on 25/07/2017.
 */

public class Fragmento extends Fragment {

    ArrayList<Mascotas> mascotas;
    RecyclerView listaMascotas ;

     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
         View v = inflater.inflate(R.layout.fragment_principal, container, false);
         listaMascotas = (RecyclerView) v.findViewById(R.id.rvfprincipal);

         GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
         listaMascotas.setLayoutManager(manager);
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
