package com.example.sociologiaapp.InfiniteViewPager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sociologiaapp.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainPager extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_main);


        getSupportActionBar().hide();

        initData();
        viewPager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_pager);
        MyAdapter adapter = new MyAdapter(this,movieList);
        viewPager.setAdapter(adapter);


    }

    private void initData(){

        movieList.add(new Movie("Auguste Comte","Isidore Auguste Marie François Xavier Comte foi um filósofo francês, fundador da Sociologia e do Positivismo, que trabalhou intensamente na criação de uma filosofia positiva. ",R.drawable.comte,getString(R.string.comte)));
        movieList.add(new Movie("Emile Durkheim","David Émile Durkheim foi um sociólogo, antropólogo, cientista político, psicólogo social e filósofo francês. Formalmente, criou a disciplina acadêmica da sociologia e, com Karl Marx e Max Weber, é comumente citado como o principal arquiteto da ciência social.",R.drawable.durk,getString(R.string.durk)));
        movieList.add(new Movie("Erving Goffman","Erving Goffman foi um cientista social, antropólogo, sociólogo e escritor canadense. Foi considerado \"o sociólogo norte-americano mais influente do século XX\".",R.drawable.goffman,getString(R.string.goff)));
        movieList.add(new Movie("Florestan Fernandes","Florestan Fernandes foi um sociólogo e político brasileiro. Foi deputado federal pelo Partido dos Trabalhadores, tendo participado da Assembleia Nacional Constituinte. Recebeu o Prémio Jabuti em 1964, e em 1996 com o Prémio Anísio Teixeira.",R.drawable.florestan,getString(R.string.flores)));
        movieList.add(new Movie("Friedrich Engels","Friedrich Engels foi um empresário industrial e teórico revolucionário prussiano, nascido na atual Alemanha, que junto com Karl Marx fundou o chamado socialismo científico ou marxismo. Seu pai era dono de uma grande indústria têxtil em Salford, Inglaterra.",R.drawable.engels,getString(R.string.engels)));
        movieList.add(new Movie("Herbert Spencer","Herbert Spencer foi um filósofo, biólogo e antropólogo inglês, bem como um dos representantes do liberalismo clássico. Spencer foi um profundo admirador da obra de Charles Darwin. É dele a expressão \"sobrevivência do mais apto\". ",R.drawable.spencer,getString(R.string.herbert)));
        movieList.add(new Movie("Karl Marx","Karl Marx foi um filósofo, sociólogo, jornalista e revolucionário socialista. Nascido na Prússia, mais tarde se tornou apátrida e passou grande parte de sua vida em Londres, no Reino Unido.",R.drawable.marx,getString(R.string.marx)));
        movieList.add(new Movie("Max Weber","Maximilian Karl Emil Weber foi um intelectual, jurista e economista alemão considerado um dos fundadores da Sociologia. Seu irmão foi o também famoso sociólogo e economista Alfred Weber",R.drawable.weber,getString(R.string.weber)));
        movieList.add(new Movie("Pierre Bordieu","Pierre Félix Bourdieu foi um sociólogo francês. De origem campesina, filósofo de formação, foi docente na École de Sociologie du Collège de France.",R.drawable.bourdieu,getString(R.string.pierre)));






    }
}
