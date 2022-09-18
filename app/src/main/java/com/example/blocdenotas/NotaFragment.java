package com.example.blocdenotas;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class NotaFragment extends Fragment {
    RecyclerView recyclerView;
    MyNotaRecyclerViewAdapter adapterNotas;
    List<Nota> NotasLis;
    OnListFragmentInteractionListener mlistener = null;

    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;


    public NotaFragment() {
    }

    @SuppressWarnings("unused")
    public static NotaFragment newInstance(int columnCount) {
        NotaFragment fragment = new NotaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            NotasLis = new ArrayList<>();
            NotasLis.add(new Nota("Lista de la compra", "CComprar pan tostado", 0.00f));
            NotasLis.add(new Nota("Recordar", "He aparcado el coche en la calle frente a la concha", 1.00f));
            NotasLis.add(new Nota("Cumpleaños", "Cumpleaños de Karen", 1.00f));
            NotasLis.add(new Nota("comprar materiales", "Cemento, Arena, Piedrin", 0.00f));
            NotasLis.add(new Nota("Llenar album del mundial", "Comprar estampas", 0.00f));
            NotasLis.add(new Nota("Leer libro", "Padre Rico, Padre pobre", 1.00f));
            NotasLis.add(new Nota("Contraseñas", "*******, ***", 1.00f));

            OnListFragmentInteractionListener mlistener = null;
            adapterNotas = new MyNotaRecyclerViewAdapter(getContext() , NotasLis, mlistener);
            recyclerView.setAdapter(adapterNotas);
        }
        return view;
    }
    public interface OnListFragmentInteractionListener {
        void onListFragmentInteraction(Nota item);

    }
}