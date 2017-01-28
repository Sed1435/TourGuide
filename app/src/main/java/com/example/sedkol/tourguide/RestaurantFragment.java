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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sightseeing_layout, container, false);

        ArrayList<Infos> restaurant = new ArrayList<>();
        restaurant.add(new Infos(R.raw.steirereck_im_stadtpark, "Steirereck Im Stadtpark",
                "Am Heumarkt 2A,\n1030 Vienna"));
        restaurant.add(new Infos(R.raw.restaurant_vestibuel, "Restaurant Vestibül",
                "Universitätsring 2,\n1010 Vienna"));
        restaurant.add(new Infos(R.raw.gasthaus_poeschl, "Gasthaus Pöschl",
                "Weihburggasse 17,\n1010 Vienna"));
        restaurant.add(new Infos(R.raw.motto_am_fluss, "Motto Am Fluss",
                "Schwedenplatz 2,\n1010 Vienna"));
        restaurant.add(new Infos(R.raw.zur_eisernen_zeit, "Zur Eisernen Zeit",
                "Naschmarkt 313-316,\n1040 Vienna"));
        restaurant.add(new Infos(R.raw.gmoa_keller, "Gmoa Keller",
                "Am Heumarkt 25,\n1030 Vienna"));
        restaurant.add(new Infos(R.raw.amadors_wirtshaus_und_greisslerei,
                "Amador's Wirtshaus & Greißlerei", "Grinzingerstraße 86,\n1190 Vienna"));
        restaurant.add(new Infos(R.raw.mraz_und_sohn, "Mraz & Sohn",
                "Wallensteinstraße 59,\n1200 Vienna"));
        restaurant.add(new Infos(R.raw.das_turm, "Das Turm",
                "Wienerbergstraße 7,\n1100 Vienna"));
        restaurant.add(new Infos(R.raw.restaurant_opus, "Restaurant Opus",
                "Kärntner Ring 16,\n1010 Vienna"));






        InfosArrayAdapter adapter = new InfosArrayAdapter(getActivity(), restaurant);
        ListView listView = (ListView) view.findViewById(R.id.sightseeing_listview);
        listView.setAdapter(adapter);


        return view;
    }

}
