package com.example.sociologiaapp.RecyclerConceitos;

public class ExampleItem {

    private int mImageResource;
    private String mText;
    private String mDescricao;


    public ExampleItem(int imageResource, String text, String descricao){

        mImageResource = imageResource;
        mText = text;
        mDescricao = descricao;



    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getmText(){
        return mText;
    }

    public String getmDescricao(){return mDescricao;}


    }

