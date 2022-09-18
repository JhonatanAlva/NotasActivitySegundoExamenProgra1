package com.example.blocdenotas;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;




import java.util.List;

public class MyNotaRecyclerViewAdapter extends RecyclerView.Adapter<MyNotaRecyclerViewAdapter.ViewHolder> {

    private Context ctx;
    private final List<Nota> mValues;
    private final NotaFragment.OnListFragmentInteractionListener mListener;
    public MyNotaRecyclerViewAdapter(Context context , List<Nota> items, NotaFragment.OnListFragmentInteractionListener mListener) {
        ctx = context;
        mValues = items;
        this.mListener = mListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewTitulo.setText(holder.mItem.getTituloNota());
        holder.textViewContenido.setText(holder.mItem.getTextoNota());
        holder.ratingBarValoracion.setRating(holder.mItem.getFavorita());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {public final View mView;
        public final TextView textViewTitulo;
        public final TextView textViewContenido;
        public final RatingBar ratingBarValoracion;
        public Nota mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewTitulo = view.findViewById(R.id.textViewTitulo);
            textViewContenido = view.findViewById(R.id.textViewContenido);
            ratingBarValoracion = view.findViewById(R.id.ratingBarValoracion);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewContenido.getText() + "'";
        }
    }

}