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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.afi_palace_mall), getString(R.string.afi_palace_description),
                getString(R.string.afi_palace_address), R.drawable.afi_palace_mall));
        locations.add(new Location(getString(R.string.ploiesti_shopping_center_mall), getString(R.string.ploiesti_shopping_center_description),
                getString(R.string.ploiesti_shopping_center_address), R.drawable.ploiesti_shopping_center_ploiesti));
        locations.add(new Location(getString(R.string.ploiesti_shopping_city_mall), getString(R.string.ploiesti_shopping_city_description),
                getString(R.string.ploiesti_shopping_city_address), R.drawable.ploiesti_shopping_city));
        locations.add(new Location(getString(R.string.west_mall), getString(R.string.west_mall_description),
                getString(R.string.west_mall_address), R.drawable.west_mall));
        locations.add(new Location(getString(R.string.winmarkt_mall), getString(R.string.winmarkt_description),
                getString(R.string.winmarkt_address), R.drawable.winmarkt_ploiesti));

        // Create the LocationAdapter, whose data source is a list of locations. The adapter knows how to create list items for each item in the list
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_malls_color);

        // Find the ListView object in the list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        // Make the listView to use the LocationAdapter we created above, so that the listView will display list items for each tour in the list
        listView.setAdapter(adapter);

        return rootView;

    }

}
