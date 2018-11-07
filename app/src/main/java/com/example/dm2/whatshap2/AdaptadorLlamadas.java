package com.example.dm2.whatshap2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorLlamadas extends ArrayAdapter<Llamada> {


    private Llamada[] llamadas;


    public AdaptadorLlamadas(Context context, Llamada[] llamadas) {
        super(context, R.layout.list_item3,llamadas);
        this.llamadas=llamadas;
    }


    public View getView(int position, View convertView, ViewGroup parent) {



        LayoutInflater inflater = LayoutInflater.from(getContext());
        View vista=inflater.inflate(R.layout.list_item3,null);

        ImageView img=vista.findViewById(R.id.imgLLam);
        img.setImageDrawable(llamadas[position].getImg());

        TextView nombre=vista.findViewById(R.id.NomLlamada);
        nombre.setText(llamadas[position].getNombre());

        return vista;

    }
}

