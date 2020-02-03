package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = findViewById(R.id.lista);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                String val =(String) parent.getItemAtPosition(position);
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                intent.putExtra("item",val);
                startActivity(intent);


//                Toast toast = Toast.makeText(getApplicationContext(),val,Toast.LENGTH_SHORT);
//        toast.show();
            }
        });

    }

public void AbrirTela(View view){
    Intent intent = new Intent(this, Main2Activity.class);
    intent.putExtra("item","Botao Abrir");
    startActivity(intent);
}

    public void PreencherLista(View view){
        ListView lista = findViewById(R.id.lista);

        String[] itens = new String[100];


        for (int i = 0; i< 100; i++){

            itens[i] = "item " + i;

        }

//
//        Toast toast = Toast.makeText(getApplicationContext(),"Lista criada",Toast.LENGTH_SHORT);
//        toast.show();
        lista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, itens));

    }



    public void DesativarLista(View view) {
        ListView lista = findViewById(R.id.lista);
        if (lista.getVisibility() == View.VISIBLE) {
            lista.setVisibility(View.INVISIBLE);
            Toast toast = Toast.makeText(getApplicationContext(),"Lista invisivel",Toast.LENGTH_SHORT);
            toast.show();
        } else {
            lista.setVisibility(View.VISIBLE);
            Toast toast = Toast.makeText(getApplicationContext(),"Lista visivel",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

//    public void teste(){
//        ListView lista = findViewById(R.id.lista);
//
//        Object item = lista.getSelectedItem();
//        Toast toast = Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT);
//        toast.show();
//
//    }

}
