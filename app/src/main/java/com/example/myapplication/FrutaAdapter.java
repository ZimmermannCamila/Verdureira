package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class FrutaAdapter extends ArrayAdapter {

    Context mcontext;
    int mresources;

    public FrutaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        mcontext = context;
        mresources = resource;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mcontext);

        convertView = inflater.inflate(mresources, parent, false);


        TextView tvNome = convertView.findViewById(R.id.tvNome);
        TextView tvCodigo = convertView.findViewById(R.id.tvCodigo);
        TextView tvPreco = convertView.findViewById(R.id.tvPreco);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        NumberFormat format = new DecimalFormat("#,###.00");


        Fruta f = (Fruta) getItem(position);


        tvNome.setText(f.getNome());
        tvCodigo.setText(Integer.toString(f.getCodigo()));
        tvPreco.setText(format.format(f.getPreco()));

        imageView.setImageResource(f.getImagem());



        return convertView;
    }
}
