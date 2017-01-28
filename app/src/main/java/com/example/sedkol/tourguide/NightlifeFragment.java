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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sightseeing_layout, container, false);


        ArrayList<Infos> nightlife = new ArrayList<>();
        nightlife.add(new Infos(R.raw.travel_shack, "Travel Shack",
                "Mariahilfer Gürtel 21,\n1150 Vienna"));
        nightlife.add(new Infos(R.raw.sass_club, "Sass Club",
                "Karlsplatz 1,\n1010 Vienna"));
        nightlife.add(new Infos(R.raw.volksgarten_pavillon, "Volksgarten Pavillon",
                "Burgring 1,\n1010 Vienna"));
        nightlife.add(new Infos(R.raw.fuenfzehn_sechzehn, "1516",
                "Krugerstrasse 18,\n1010 Vienna"));
        nightlife.add(new Infos(R.raw.zehn_neunzehn_jazzclub, "1019 Jazz Club",
                "Althanstraße 12,\n1090 Vienna"));
        nightlife.add(new Infos(R.raw.bettel_alm, "Bettel Alm",
                "Johannesgasse 12,\n1010 Vienna"));
        nightlife.add(new Infos(R.raw.charlie_ps_irish_pub, "Charlie P's Irish Pub",
                "Währinger Str. 3,\n1090 Vienna"));
        nightlife.add(new Infos(R.raw.donau, "Donau",
                "Karl Schweighofer Gasse 10,\n1070 Vienna"));
        nightlife.add(new Infos(R.raw.flex, "Flex",
                "Augartenbrücke 1,\n1090 Vienna"));
        nightlife.add(new Infos(R.raw.prater_dome, "Prater Dome",
                "Riesenradplatz 7,\n1020 Vienna"));

        InfosArrayAdapter adapter = new InfosArrayAdapter(getActivity(), nightlife);

        ListView listView = (ListView) view.findViewById(R.id.sightseeing_listview);

        listView.setAdapter(adapter);




        return view;
    }

}
