package com.example.dm2.ud04_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private TextView texto,textoSu,textoPo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final String[] paises={"Corea del Sur","España","Italia","Mongolia","Tailandia"};
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);

        lista=findViewById(R.id.li);
        lista.setAdapter(adaptador);

        texto=findViewById(R.id.texto);
        textoSu=findViewById(R.id.textoSu);
        textoPo=findViewById(R.id.textoPo);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
                String opcion= (String) a.getItemAtPosition(position);
                texto.setText("Seleccionado: "+opcion.toString());

                if(opcion.toString().equals("España")){
                    textoSu.setText("Superficie: 505.990 km²");
                    textoPo.setText("Población: 46.528.966 (1/01/2017)");
                }

                if(opcion.toString().equals("Corea del Sur")){
                    textoSu.setText("Superficie: 99 720 km²");
                    textoPo.setText("Población: 51,47 millones (2017)");
                }

                if(opcion.toString().equals("Italia")){
                    textoSu.setText("Superficie: 301.338 km²");
                    textoPo.setText("Población: 60,59 millones (2017)");
                }

                if(opcion.toString().equals("Tailandia")){
                    textoSu.setText("Superficie: 513.120 km²");
                    textoPo.setText("Población: 69.04 millones (2017)");
                }

                if(opcion.toString().equals("Mongolia")){
                    textoSu.setText("Superficie: 1,566 millones km²");
                    textoPo.setText("Población: 3,076 millones (2017)");
                }

            }
        });

    }


}
