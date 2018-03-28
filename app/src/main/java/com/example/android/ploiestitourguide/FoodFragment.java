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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.giulia_restaurant), getString(R.string.giulia_rest_description),
                getString(R.string.giulia_rest_address), R.drawable.giulia_restaurant));
        locations.add(new Location(getString(R.string.terraverde), getString(R.string.terraverde_description),
                getString(R.string.terraverde_address), R.drawable.terraverde));
        locations.add(new Location(getString(R.string.nabucco), getString(R.string.nabucco_description), getString(R.string.nabucco_address),
                R.drawable.nabucco_restaurant));
        locations.add(new Location(getString(R.string.antique_rest), getString(R.string.antique_rest_description),
                getString(R.string.antique_rest_address), R.drawable.antique_restaurant));
        locations.add(new Location(getString(R.string.trattoria_prestij), getString(R.string.trattoria_prestij_description),
                getString(R.string.trattoria_prestij_address), R.drawable.trattoria_prestij));
        locations.add(new Location(getString(R.string.yarus_restaurant), getString(R.string.yarus_rest_description),
                getString(R.string.yarus_rest_address), R.drawable.yarus_restaurant));

        // Create the LocationAdapter, whose data source is a list of locations. The adapter knows how to create list items for each item in the list
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_food_color);

        // Find the ListView object in the list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        // Make the listView to use the LocationAdapter we created above, so that the listView will display list items for each tour in the list
        listView.setAdapter(adapter);


        return rootView;

    }

}
