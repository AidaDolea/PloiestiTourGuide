package com.example.android.ploiestitourguide;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.class_hotel), getString(R.string.class_hotel_description), getString(R.string.class_hotel_address),
                R.drawable.class_hotel));
        locations.add(new Location(getString(R.string.forum_hotel), getString(R.string.forum_hotel_description),
                getString(R.string.forum_hotel_address), R.drawable.forum_hotel));
        locations.add(new Location(getString(R.string.mario_hotel), getString(R.string.mario_hotel_description),
                getString(R.string.mario_hotel_address), R.drawable.maryo_hotel));
        locations.add(new Location(getString(R.string.nord_hotel), getString(R.string.nord_hotel_description),
                getString(R.string.nord_hotel_address), R.drawable.nord_hotel));
        locations.add(new Location(getString(R.string.acapulco_hotel), getString(R.string.acapulco_hotel_description),
                getString(R.string.acapulco_hotel_address), R.drawable.acapulco_hotel));
        locations.add(new Location(getString(R.string.best_hotel), getString(R.string.best_hotel_description),
                getString(R.string.best_hotel_address), R.drawable.best_hotel));
        locations.add(new Location(getString(R.string.central_hotel), getString(R.string.central_hotel_description),
                getString(R.string.central_hotel_address), R.drawable.central_hotel));


        // Create the LocationAdapter, whose data source is a list of locations. The adapter knows how to create list items for each item in the list
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_hotels_color);

        // Find the ListView object in the list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);


        // Make the listView to use the LocationAdapter we created above, so that the listView will display list items for each tour in the list
        listView.setAdapter(adapter);

        return rootView;

    }

}
