package com.example.sociologiaapp.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public class AutoresF extends Fragment {

    private RecyclerView mRecycerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public AutoresF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_autores, container, false);

        //Array of ExampleItems

        final ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.brain,"Karl Marx",getString(R.string.marx)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Émile Durkheim",getString(R.string.durk)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Max Weber",getString(R.string.weber)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Friedrich Engels",getString(R.string.engels)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Auguste Comte",getString(R.string.comte)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Pierre Bordieu",getString(R.string.pierre)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Erving Goffman ",getString(R.string.goff)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Florestan Fernandes ",getString(R.string.flores)));
        exampleList.add(new ExampleItem(R.drawable.brain,"Herbet Spencer",getString(R.string.herbert)));


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
                                //saco.putInt("Imagem", exampleItem.getmImagemAutor());
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
    }

}
