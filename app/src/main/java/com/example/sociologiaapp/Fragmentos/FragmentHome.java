package com.example.sociologiaapp.Fragmentos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sociologiaapp.InfiniteViewPager.MainPager;
import com.example.sociologiaapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentHome.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FragmentHome extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_home, container, false);




        ImageView image1 = v.findViewById(R.id.image1);
        ImageView image2 = v.findViewById(R.id.image2);
        ImageView image3 = v.findViewById(R.id.image3);
        ImageView image4 = v.findViewById(R.id.image4);
        ImageView image5 = v.findViewById(R.id.image5);
        ImageView image6 = v.findViewById(R.id.image6);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);



        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image1:

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.main_container, new Intro());
                fragmentTransaction.commit();


                break;
            case R.id.image2:

                FragmentTransaction fragmentTransaction3 = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.replace(R.id.main_container, new ConceitosF());
                fragmentTransaction3.commit();

                break;
            case R.id.image3:

                FragmentTransaction fragmentTransaction5 = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction5.addToBackStack(null);
                fragmentTransaction5.replace(R.id.main_container, new Conceitos2F());
                fragmentTransaction5.commit();



                break;


                case R.id.image4:

                    startActivity(new Intent(getContext(), MainPager.class));

                break;


            case R.id.image5:
                FragmentTransaction fragmentTransaction1 = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.replace(R.id.main_container, new relacoes());
                fragmentTransaction1.commit();
                break;
            case R.id.image6:
                FragmentTransaction fragmentTransaction2 = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.replace(R.id.main_container, new Videos());
                fragmentTransaction2.commit();
                break;
        }

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
