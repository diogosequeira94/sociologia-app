package com.example.sociologiaapp.InfiniteViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sociologiaapp.Activity.MainActivity;
import com.example.sociologiaapp.Fragmentos.AutoresF;
import com.example.sociologiaapp.Fragmentos.ItemRecycler;
import com.example.sociologiaapp.R;

import java.util.List;

public class MyAdapter extends PagerAdapter{

    Context context;
    List<Movie> movieList;


    public MyAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        //Inflate View
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);
        //View
        ImageView movie_image = (ImageView)view.findViewById(R.id.movie_image);
        TextView movie_title = (TextView)view.findViewById(R.id.movie_title);
        TextView movie_description = (TextView)view.findViewById(R.id.movie_description);
        Button btn_fav = (Button)view.findViewById(R.id.bnt_enter);

        //Set Data
        movie_image.setImageResource(movieList.get(position).getImage());
        movie_title.setText(movieList.get(position).getName());
        movie_description.setText(movieList.get(position).getDescription());

        //Set Event Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Click to view, here you can add startActivity
                Toast.makeText(context, "Clique abaixo para saber mais sobre "+movieList.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ItemAutor.class);
                Bundle teste = new Bundle();
                teste.putString("Nome", movieList.get(position).getName());
                teste.putString("Descricao", movieList.get(position).getBigdescription());
                intent.putExtras(teste);

                context.startActivity(intent);



            }
        });

        container.addView(view);
        return view;


    }
}
