package com.example.sociologiaapp.Fragmentos;


import android.content.Intent;
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
public class ConceitosF extends Fragment {

    private RecyclerView mRecycerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public ConceitosF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_conceitos, container, false);

        //Array of ExampleItems

        final ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.book3,"Como se define Sociologia?","Sociologia é a ciência que estuda as relações entre as pessoas que pertencem a uma comunidade ou aos diferentes grupos que formam a sociedade.\n\nÉ uma ciência que pertence ao grupo das ciências sociais e humanas. O objeto de estudo da sociologia engloba a análise dos fenômenos de interação entre os indivíduos, as formas internas de estrutura (as camadas sociais, a mobilidade social, os valores, as instituições, as normas, as leis), os conflitos e as formas de cooperação geradas através das relações sociais.\n\nA sociologia estuda as relações de formalidade presentes na vida e nas sociedades. Como é relativa aos fatos e à realidade, não determina regras dos estados sociais e das particularidades da conduta humana, porque esse é objetivo da filosofia e ética social. \n\nA palavra \"sociologia\" foi criada por A. Comte, mas o conceito surgiu através do pensamento social e filosófico do iluminismo (por exemplo: em Montesquieu e Hobbes) e no idealismo alemão (por exemplo: Hegel). \n\nA sociologia abrange várias áreas, existindo sociologia comunitária, sociologia econômica, sociologia financeira, sociologia política, sociologia jurídica, sociologia do trabalho, sociologia familiar, etc.Através das pesquisas sobre os fenômenos que se repetem nas interações sociais, os sociólogos observam os padrões comuns para formularem teorias sobre os fatos sociais. Os métodos de estudo da sociologia envolvem técnicas qualitativas (descrição detalhada de situações e comportamentos) e quantitativas (análise estatística).\n"));
        exampleList.add(new ExampleItem(R.drawable.book3,"Elementos de uma Sociedade",getString(R.string.Elementos)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Tipos de Sociedade",getString(R.string.tipos)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Sociedade",getString(R.string.sociedade)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Comunidade",getString(R.string.comunidade)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Cultura",getString(R.string.cultura)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Acção Social",getString(R.string.AccaoSocial)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Diferença entre Comunidade e Sociedade",getString(R.string.dif)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Facto Social",getString(R.string.ASocial)));
        exampleList.add(new ExampleItem(R.drawable.book3,"Etnocentrismo e relativismo cultural","O relativismo cultural é uma corrente de pensamento ou doutrina que tem como objetivo entender as diferenças culturais e estudar o porquê das diferenças entre culturas distintas. Enquanto o etnocentrismo tem uma vertente de confronto, o relativismo aborda as diferenças de uma forma apaziguadora.\n\nÉ importante destacar que o relativismo cultural é uma ideologia que defende que os valores, princípios morais, o certo e o errado, o bem e o mal, são convenções sociais intrínsecas a cada cultura. Um ato considerado errado em uma cultura não significa que o seja também quando praticado por povos de diferente cultura."));

        exampleList.add(new ExampleItem(R.drawable.book3,"Etnocentrismo Cultural","Etnocentrismo é um conceito da Antropologia definido como a visão demonstrada por alguém que considera o seu grupo étnico ou cultura o centro de tudo, portanto, num plano mais importante que as outras culturas e sociedades.\n\nO termo é formado pela justaposição da palavra de origem grega \"ethnos\" que significa \"nação, tribo ou pessoas que vivem juntas\" e centrismo que indica o centro.\n\nUm indivíduo etnocêntrico considera as normas e valores da sua própria cultura melhores do que as das outras culturas. Isso pode representar um problema, porque frequentemente dá origem a preconceitos e ideias infundamentadas.\n\nUma visão etnocêntrica demonstra, por vezes, desconhecimento dos diferentes hábitos culturais, levando ao desrespeito, depreciação e intolerância por quem é diferente, originando em seus casos mais extremos, atitudes preconceituosas, radicais e xenófobas.Este fenômeno universal pode atingir proporções drásticas, quando culturas tecnicamente mais frágeis entram em contato com culturas mais dominantes e avançadas.Alguns exemplos de etnocentrismo estão relacionados ao vestuário. Um deles é o hábito indígena de vestir pouca ou nenhuma roupa; outro caso é o uso do kilt (uma típica saia) pelos escoceses. São duas situações que podem ser tratadas com alguma hostilidade ou estranheza por quem não pertence àquelas culturas."));

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
