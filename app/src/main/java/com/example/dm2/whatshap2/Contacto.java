package com.example.dm2.whatshap2;

import android.graphics.drawable.Drawable;

public class Contacto {

    private Drawable img;
    private String nombre;

    Contacto(Drawable i,String n){

        img=i;
        nombre=n;
    }


    public String getNombre() {
        return nombre;
    }

    public Drawable getImg() {
        return img;
    }
}
