package com.example.sedkol.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sightseeing_layout, container, false);

        ArrayList<Infos> museum = new ArrayList<>();
        museum.add(new Infos(R.raw.schoenbrunn, "Schönbrunn Palace",
                "Schönbrunner Schloßstraße 47,\n1130 Vienna"));
        museum.add(new Infos(R.raw.hofburg, "Imperial Palace",
                "Michaelerkuppel,\n1010 Vienna"));
        museum.add(new Infos(R.raw.belvedere, "Belvedere Palace",
                "Prinz Eugen-Straße 27,\n1030 Vienna"));
        museum.add(new Infos(R.raw.museumsquartier, "Museum Quartier",
                "Museumsplatz 1,\n1070 Vienna"));
        museum.add(new Infos(R.raw.kunsthistorisches_museum, "Art History Museum",
                "Maria-Theresien-Platz,\n1010 Vienna"));
        museum.add(new Infos(R.raw.naturhistorisches_museum, "Natural History Museum",
                "Maria-Theresien-Platz,\n1010 Vienna"));
        museum.add(new Infos(R.raw.spanische_hofreitschule, "Spanish Riding School",
                "Michaelerplatz 1,\n1010 Vienna"));
        museum.add(new Infos(R.raw.kaisergruft, "Imperial Burial Vault",
                "Tegetthoffstraße 2,\n1010 Vienna"));
        museum.add(new Infos(R.raw.kunst_haus_wien, "Kunst Haus Wien",
                "Untere Weißgerberstraße 13,\n1030 Vienna"));
        museum.add(new Infos(R.raw.mak, "Museum For Applied Arts",
                "Stubenring 5,1010 Vienna"));


        InfosArrayAdapter adapter = new InfosArrayAdapter(getActivity(), museum);
        ListView listView = (ListView) view.findViewById(R.id.sightseeing_listview);
        listView.setAdapter(adapter);


        return view;
    }

}
