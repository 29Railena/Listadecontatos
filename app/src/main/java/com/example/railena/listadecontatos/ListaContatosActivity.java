package com.example.railena.listadecontatos;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaContatosActivity extends AppCompatActivity {
    ListView lista_contatos;
    //railena albuquerque

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);
        lista_contatos =(ListView) findViewById(R.id.Lista_Contatos);
        lista_contatos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome=((TextView) view).getText().toString();
                AlertDialog.Builder dialogo= new AlertDialog.Builder(ListaContatosActivity.this);
                dialogo.setTitle("contato");
                dialogo.setMessage("contato selecionado"  +nome);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();





            }




                                              }





        );



    }
}
