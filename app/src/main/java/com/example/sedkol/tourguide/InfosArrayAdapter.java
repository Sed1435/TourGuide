package com.example.sedkol.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ulrich D. on 12.01.17.
 */

public class InfosArrayAdapter extends ArrayAdapter<Infos> {

//    private TextView name;
//    private TextView address;
//    private ImageView image;


    public InfosArrayAdapter(Context context, ArrayList<Infos> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_view_layout, parent, false);
        }

        Infos infos = getItem(position);

        TextView name = (TextView) view.findViewById(R.id.sightseeing_name);
        name.setText(infos.getName());

        TextView address = (TextView) view.findViewById(R.id.sightseeing_infos);
        address.setText(infos.getInformations());

        ImageView image = (ImageView) view.findViewById(R.id.sightseeing_foto);
        image.setImageResource(infos.getImageResourceId());




        return view;
    }
}
