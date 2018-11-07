package com.example.dm2.whatshap2;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listaCa,listaCo,listaLlam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //PESTAÑAS............

        Resources res = getResources();
        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("Llamadas");

        spec.setContent(R.id.tab1);
        spec.setIndicator("Llamadas",
                null);
        tabs.addTab(spec);


        spec=tabs.newTabSpec("Chats");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Chats",
                null);
        tabs.addTab(spec);

        spec=tabs.newTabSpec("Contactos");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Contactos",
                null);
        tabs.addTab(spec);

        tabs.setCurrentTab(0);


        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            //CUANDO SE PULSA CADA PESTAÑA

            @SuppressLint("RestrictedApi")
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(getApplicationContext(),tabId,Toast.LENGTH_SHORT).show();

                if(tabId.equals("Llamadas")){
                    ActionMenuItemView icono=findViewById(R.id.user);
                    icono.setIcon(getDrawable(R.mipmap.ic_launcher_carrito));
                }

                if(tabId.equals("Chats")){
                  ActionMenuItemView icono=findViewById(R.id.user);
                   icono.setIcon(getDrawable(R.mipmap.ic_launcher_grecia));
                }

                if(tabId.equals("Contactos")){
                    ActionMenuItemView icono=findViewById(R.id.user);
                    icono.setIcon(getDrawable(R.mipmap.ic_launcher_monigote));
                }
            }
        });




        //array para los CHATS.

        final Chat[] chats={
                new Chat(getDrawable(R.mipmap.ic_launcher_chat),"Unai","Ultima vez a las..."),
                new Chat(getDrawable(R.mipmap.ic_launcher_chat),"Goio","Este mensaje fue borrado"),
                new Chat(getDrawable(R.mipmap.ic_launcher_chat),"Marck","....................."),
                new Chat(getDrawable(R.mipmap.ic_launcher_chat),"Ibon","  ;) ;)"),
                new Chat(getDrawable(R.mipmap.ic_launcher_chat),"Amaia","Mensaje enviado correctamente..."),


        };


        AdaptadorChat aw=new AdaptadorChat(this,chats);
        listaCa=findViewById(R.id.listaChats);
        listaCa.setAdapter(aw);


        //array para los CONTACTOS.

        final Contacto[] contactos={
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Hector "),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Belen"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Antonio"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Raquel"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Linda"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Roberto"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Juan"),
                new Contacto(getDrawable(R.mipmap.ic_launcher_usuario),"Jose")


        };

        AdaptadorContactos ac=new AdaptadorContactos(this,contactos);
        listaCo=findViewById(R.id.listaCo);
        listaCo.setAdapter(ac);


        //ARRAY PARA LAS LLAMADAS

        final Llamada[] llamadas={
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Unai"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Maria"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Hector"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Amaia"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Maite"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Alfredo"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Nuno"),
                new Llamada(getDrawable(R.mipmap.ic_launcher_llamada),"Estefanopoulos")
        };

       AdaptadorLlamadas al=new AdaptadorLlamadas(this,llamadas);
        listaLlam=findViewById(R.id.listaLlam);
        listaLlam.setAdapter(al);



    }
//PARA QUE APAREZCAN LOS ICONOS Y EL OVERFLOW DEL MENU.
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }



//LO QUE APARECERA EN EL DESPLEGLABLE DEL MENU.
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
