package com.example.sociologiaapp.InfiniteViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sociologiaapp.R;

public class ItemAutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_autor);
        getSupportActionBar().hide();


        Bundle teste = getIntent().getExtras();


        TextView titulo = findViewById(R.id.titulo_autor);
        TextView descricao = findViewById(R.id.descriAutor);

        String textDescri = teste.getString("Descricao");
        descricao.setText(textDescri);

        String textTitulo = teste.getString("Nome");
        titulo.setText(textTitulo);
    }
}
