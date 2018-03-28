package com.example.android.ploiestitourguide;


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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.clock_museum), getString(R.string.clock_museum_description),
                getString(R.string.clock_museum_address), R.drawable.clock_museum));
        locations.add(new Location(getString(R.string.history_acrcheology_museum), getString(R.string.history_archeology_museum_description),
                getString(R.string.history_archeology_museum_address), R.drawable.history_and_archeology_museum));
        locations.add(new Location(getString(R.string.i_l_caragiale_museum), getString(R.string.i_l_caragiale_description),
                getString(R.string.i_l_caragiale_address), R.drawable.ion_luca_caragiale_museum));
        locations.add(new Location(getString(R.string.natural_science_museum), getString(R.string.natural_science_museum_description),
                getString(R.string.natural_science_museum_address), R.drawable.natural_science_museum));
        locations.add(new Location(getString(R.string.national_oil_museum), getString(R.string.national_oil_museum_description),
                getString(R.string.national_oil_museum_address), R.drawable.national_oil_museum));

        // Create the LocationAdapter, whose data source is a list of locations. The adapter knows how to create list items for each item in the list
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_museums_color);

        // Find the ListView object in the list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);


        // Make the listView to use the LocationAdapter we created above, so that the listView will display list items for each tour in the list
        listView.setAdapter(adapter);

        return rootView;

    }

}
