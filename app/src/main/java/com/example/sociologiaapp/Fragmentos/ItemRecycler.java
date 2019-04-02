package com.example.sociologiaapp.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sociologiaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemRecycler extends Fragment {


    public ItemRecycler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;

        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_item_recycler, container, false);


        TextView title = v.findViewById(R.id.titulo_autor);
        TextView description = v.findViewById(R.id.textoDescri);

        String textDescri = getArguments().getString("Descricao");
        description.setText(textDescri);

        String textTitulo = getArguments().getString("Titulo");
        title.setText(textTitulo);


        return v;

    }



}



