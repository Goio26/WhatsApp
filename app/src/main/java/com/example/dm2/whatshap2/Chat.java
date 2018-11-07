package com.example.dm2.whatshap2;

import android.graphics.drawable.Drawable;

public class Chat {

    private Drawable img;
    private String nombre,frase;

    public Chat(Drawable i,String n,String f){
        img=i;
        nombre=n;
        frase=f;
    }


    //Getters

    public Drawable getImg() {
        return img;
    }



    public String getNombre() {
        return nombre;
    }



    public String getFrase() {
        return frase;
    }


}
