package com.example.android.ploiestitourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dolea on 24.03.2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    /**
     * @param colorResourceId is for the color of each view
     */
    private int colorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {

        super(context, 0, locations);
        this.colorResourceId = colorResourceId;

    }

    // Check if the existing view is being reused, otherwise inflate the view
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Location object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the Title TextView in the list_item.xml layout
        TextView titleTextView = listItemView.findViewById(R.id.attraction_title_item);

        // Get the location description from the currentLocation object and set this text on the attraction_title TextView
        titleTextView.setText(currentLocation.getTitle());

        // Find the Description TextView in the list_item.xml layout
        TextView descriptionTextView = listItemView.findViewById(R.id.attraction_description_item);

        // Get the location description from the currentLocation object and set this text on the attraction_description TextView
        descriptionTextView.setText(currentLocation.getDescription());

        // Find the Address TextView in the list_item.xml layout
        TextView addressTextView = listItemView.findViewById(R.id.attraction_address_item);

        // Get the location address from the currentLocation object and set this text on the attraction_address TextView
        addressTextView.setText(currentLocation.getAddress());

        // Find the ImageView in the list_item.xml layout
        ImageView iconView = listItemView.findViewById(R.id.image);

        // Display the provided image based on the resource ID
        iconView.setImageResource(currentLocation.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);

        //set the color for each view
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the list_item view
        return listItemView;
    }
}
