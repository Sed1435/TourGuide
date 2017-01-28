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
public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sightseeing_layout, container, false);


        ArrayList<Infos> churches = new ArrayList<>();
        churches.add(new Infos(R.raw.stephansdom, "St Stephen's Cathedral",
                "Stephansplatz 3,\n1010 Vienna"));
        churches.add(new Infos(R.raw.st_michael, "St Michael’s Church",
                "Habsburgergasse 12,\n1010 Vienna"));
        churches.add(new Infos(R.raw.griechenkirche_zur_heiligen_dreifaltigkeit,
                "Greek Church to the Holy Trinity", "Fleischmarkt 13,\n1010 Vienna"));
        churches.add(new Infos(R.raw.kirche_am_steinhof, "The Church at Steinhof",
                "Baumgartner Höhe 1,\n1140 Vienna"));
        churches.add(new Infos(R.raw.minoritenkirche, "Minorites Church",
                "Minoritenplatz 2A,\n1010 Vienna"));
        churches.add(new Infos(R.raw.karl_borromaeus_kirche, "Karl Borromäus Church",
                "Simmeringer Hauptstraße 234,\n1110 Vienna"));
        churches.add(new Infos(R.raw.votivkirche, "Votive Church",
                "Rooseveltplatz,\n1090 Vienna"));
        churches.add(new Infos(R.raw.karlskirche, "St. Charles’ Church",
                "Kreuzherrengasse 1,\n1040 Vienna"));
        churches.add(new Infos(R.raw.st_nikolaus, "St Nicholas’s Church",
                "Jauresgasse 2,\n1030 Vienna"));
        churches.add(new Infos(R.raw.peterskirche, "St Peter’s Church",
                "Petersplatz 1,\n1010 Vienna"));


        InfosArrayAdapter adapter = new InfosArrayAdapter(getActivity(), churches);
        ListView listView = (ListView) view.findViewById(R.id.sightseeing_listview);
        listView.setAdapter(adapter);




        return view;
    }

}
