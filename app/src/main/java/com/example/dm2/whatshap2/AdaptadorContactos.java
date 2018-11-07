package com.example.dm2.whatshap2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class AdaptadorContactos extends ArrayAdapter<Contacto> {


    private Contacto[] contactos;


    public AdaptadorContactos(Context context, Contacto[] contactos) {
        super(context, R.layout.list_item2,contactos);
        this.contactos=contactos;
    }


    public View getView(int position,View convertView, ViewGroup parent) {



        LayoutInflater inflater = LayoutInflater.from(getContext());
        View vista=inflater.inflate(R.layout.list_item2,null);

        ImageView img=vista.findViewById(R.id.imgCont);
        img.setImageDrawable(contactos[position].getImg());

        TextView nombre=vista.findViewById(R.id.NomContacto);
        nombre.setText(contactos[position].getNombre());

        return vista;

    }
}
