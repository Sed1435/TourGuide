package com.example.sedkol.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sightseeing_layout, container, false);

        ArrayList<Infos> nature = new ArrayList<>();
        nature.add(new Infos(R.raw.prater, "Prater",
                "1020 Vienna"));
        nature.add(new Infos(R.raw.sigmund_freud_park, "Sigmund Freud Park",
                "1090 Vienna"));
        nature.add(new Infos(R.raw.rathauspark, "Rathauspark",
                "1010 Vienna"));
        nature.add(new Infos(R.raw.stadtpark, "Stadtpark",
                "1030 Vienna"));
        nature.add(new Infos(R.raw.burggarten, "Burggarten",
                "1010 Vienna"));
        nature.add(new Infos(R.raw.schoenbrunn_garten, "Schönbrunn Garden",
                "1130 Vienna"));
        nature.add(new Infos(R.raw.belvederegarten, "Belvederegarten",
                "1030 Vienna"));
        nature.add(new Infos(R.raw.danube_park, "Danube Park",
                "1220 Vienna"));
        nature.add(new Infos(R.raw.lainzer_tiergarten, "Lainzer Tiergarten",
                "1130 Vienna"));
        nature.add(new Infos(R.raw.volksgarten, "Volksgarten",
                "1010 Vienna"));



        InfosArrayAdapter adapter = new InfosArrayAdapter(getActivity(), nature);

        ListView listView = (ListView) view.findViewById(R.id.sightseeing_listview);

        listView.setAdapter(adapter);



        return view;
    }

}
