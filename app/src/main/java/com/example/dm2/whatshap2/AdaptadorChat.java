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

import com.example.dm2.whatshap2.Chat;
import com.example.dm2.whatshap2.R;

//CLASE PARA JUNTAR LA LISTA DE CHATS EN LA VENTANA CORRESPONDIENTE.
public class AdaptadorChat extends ArrayAdapter<Chat> {

    private Chat[] chats;

    public AdaptadorChat( Context contexto, Chat[] chats) {
       super(contexto, R.layout.list_item, chats);
        this.chats = chats;
    }


    public View getView(int position,View convertView, ViewGroup parent) {


        LayoutInflater inflater = LayoutInflater.from(getContext());
        View vista=inflater.inflate(R.layout.list_item,null);


        ImageView img=vista.findViewById(R.id.imgChat);
        img.setImageDrawable(chats[position].getImg());

        TextView nombre=vista.findViewById(R.id.NomChat);
        nombre.setText(chats[position].getNombre());

        TextView url=vista.findViewById(R.id.FraseChat);
        url.setText(chats[position].getFrase());


        return vista;
    }
}
