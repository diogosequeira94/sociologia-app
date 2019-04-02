package com.example.sociologiaapp.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;

import com.example.sociologiaapp.R;
import com.example.sociologiaapp.RecyclerConceitos.ExampleAdapter;
import com.example.sociologiaapp.RecyclerConceitos.ExampleItem;
import com.example.sociologiaapp.RecyclerConceitos.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * A simple {@link Fragment} subclass.
 */
public class Conceitos2F extends Fragment {

    private RecyclerView mRecycerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;


    public Conceitos2F() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_conceitos2, container, false);

        final ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.book,"Grupos Sociais",getString(R.string.grupososcial)));
        exampleList.add(new ExampleItem(R.drawable.book,"Caracteristicas de um Grupo Social",getString(R.string.cara)));
        exampleList.add(new ExampleItem(R.drawable.book,"Grupo Primario",getString(R.string.grupopri)));
        exampleList.add(new ExampleItem(R.drawable.book,"Grupo Secundario",getString(R.string.gruposecun)));
        exampleList.add(new ExampleItem(R.drawable.book,"Grupos de Referencia",getString(R.string.gruporeferencia)));
        exampleList.add(new ExampleItem(R.drawable.book,"Agregado Social",getString(R.string.Agregado)));
        exampleList.add(new ExampleItem(R.drawable.book,"Significado e Natureza de Status",getString(R.string.status)));
        exampleList.add(new ExampleItem(R.drawable.book,"Significado de Papel Social",getString(R.string.papelsoci)));
        exampleList.add(new ExampleItem(R.drawable.book,"Normas Sociais",getString(R.string.normas)));
        exampleList.add(new ExampleItem(R.drawable.book,"Sanções",getString(R.string.sancao)));
        exampleList.add(new ExampleItem(R.drawable.book,"Público e Massa",getString(R.string.publico)));
        exampleList.add(new ExampleItem(R.drawable.book,"Valores Sociais",getString(R.string.valores)));




        Collections.sort(exampleList, new Comparator<ExampleItem>() {
            @Override
            public int compare(ExampleItem exampleItem, ExampleItem t1) {
                return exampleItem.getmText().compareTo(t1.getmText());
            }
        });



        //RecyclerView Config
        mRecycerView = v.findViewById(R.id.recyclerView1);
        mRecycerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(exampleList);

        mRecycerView.setLayoutManager(mLayoutManager);
        mRecycerView.setAdapter(mAdapter);

        //OnClick Event
        mRecycerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getContext(),
                        mRecycerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {


                                ExampleItem exampleItem = exampleList.get(position);


                                FragmentTransaction fragmentTransaction5 = getActivity().getSupportFragmentManager().beginTransaction();
                                fragmentTransaction5.addToBackStack(null);
                                com.example.sociologiaapp.Fragmentos.ItemRecycler item = new ItemRecycler();
                                Bundle saco = new Bundle();
                                saco.putString("Titulo", exampleItem.getmText());
                                saco.putString("Descricao", exampleItem.getmDescricao());
                                item.setArguments(saco);
                                fragmentTransaction5.replace(R.id.main_container, item);
                                fragmentTransaction5.commit();

                                //Intent to start new Fragment

                                //Intent intent = new Intent(getContext(), ItemRecycler.class);

                                //intent.putExtra("Titulo", exampleItem.getmText());
                                //intent.putExtra("Descricao", exampleItem.getmDescricao());





                                //startActivity(intent);



                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )

        );

        return v;

    }}


