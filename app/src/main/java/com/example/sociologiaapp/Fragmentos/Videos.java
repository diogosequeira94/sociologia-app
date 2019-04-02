package com.example.sociologiaapp.Fragmentos;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.sociologiaapp.Activity.MainActivity;
import com.example.sociologiaapp.InfiniteViewPager.MainPager;
import com.example.sociologiaapp.NewVideoList.VideoListaAutor;
import com.example.sociologiaapp.NewVideoList.VideoListaIntro;
import com.example.sociologiaapp.NewVideoList.VideoListaTed;
import com.example.sociologiaapp.NewVideoList.VideosLista;
import com.example.sociologiaapp.R;
import com.example.sociologiaapp.RecyclerConceitos.ExampleAdapter;
import com.example.sociologiaapp.RecyclerConceitos.ExampleItem;
import com.example.sociologiaapp.RecyclerConceitos.RecyclerItemClickListener;
import com.example.sociologiaapp.SplashScreen.SplashScreen;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * A simple {@link Fragment} subclass.
 */
public class Videos extends Fragment implements Serializable {

    private RecyclerView mRecycerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String arrayName[] = {"Facebook",
                        "Twitter",
            "Youtube",
            "Windows",
            "Drive"
            };



    public Videos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_videos, container, false);


        /*final ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.book3,"Como se define Sociologia?","Sociologia é a ciência que estuda as relações entre as pessoas que pertencem a uma comunidade ou aos diferentes grupos que formam a sociedade.\n\nÉ uma ciência que pertence ao grupo das ciências sociais e humanas. O objeto de estudo da sociologia engloba a análise dos fenômenos de interação entre os indivíduos, as formas internas de estrutura (as camadas sociais, a mobilidade social, os valores, as instituições, as normas, as leis), os conflitos e as formas de cooperação geradas através das relações sociais.\n\nA sociologia estuda as relações de formalidade presentes na vida e nas sociedades. Como é relativa aos fatos e à realidade, não determina regras dos estados sociais e das particularidades da conduta humana, porque esse é objetivo da filosofia e ética social. \n\nA palavra \"sociologia\" foi criada por A. Comte, mas o conceito surgiu através do pensamento social e filosófico do iluminismo (por exemplo: em Montesquieu e Hobbes) e no idealismo alemão (por exemplo: Hegel). \n\nA sociologia abrange várias áreas, existindo sociologia comunitária, sociologia econômica, sociologia financeira, sociologia política, sociologia jurídica, sociologia do trabalho, sociologia familiar, etc.Através das pesquisas sobre os fenômenos que se repetem nas interações sociais, os sociólogos observam os padrões comuns para formularem teorias sobre os fatos sociais. Os métodos de estudo da sociologia envolvem técnicas qualitativas (descrição detalhada de situações e comportamentos) e quantitativas (análise estatística).\n"));


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
                                ItemRecycler item = new ItemRecycler();
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

        );*/


        CircleMenu circleMenu = (CircleMenu)v.findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#3FA695"),R.drawable.ic_add_black_24dp,R.drawable.ic_close_black_24dp)
                .addSubMenu(Color.parseColor("#3FA695"),R.drawable.ic_school_black_24dp)
                .addSubMenu(Color.parseColor("#3FA695"),R.drawable.brain)
                .addSubMenu(Color.parseColor("#3FA695"),R.drawable.ted)
                .addSubMenu(Color.parseColor("#3FA695"),R.drawable.politics)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){

                            case 0:

                                Toast.makeText(getContext(),"Introdução", Toast.LENGTH_SHORT).show();
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i = new Intent(getContext(), VideoListaIntro.class);
                                        startActivity(i);

                                    }
                                }, 1200);
                                break;
                            case 1:
                                Toast.makeText(getContext(),"Autores", Toast.LENGTH_SHORT).show();
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i = new Intent(getContext(), VideoListaAutor.class);
                                        startActivity(i);

                                    }
                                }, 1200);


                                break;
                            case 2:
                                Toast.makeText(getContext(),"Ted Talks", Toast.LENGTH_SHORT).show();
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i = new Intent(getContext(), VideoListaTed.class);
                                        startActivity(i);

                                    }
                                }, 1200);
                                break;
                            case 3:

                                Toast.makeText(getContext(),"Política", Toast.LENGTH_SHORT).show();

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i = new Intent(getContext(), VideosLista.class);
                                        startActivity(i);

                                    }
                                }, 1200);


                                break;


                        }
                    }
                });




        return v;
    }



}






