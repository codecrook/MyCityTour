package io.codecrook.mycitytour.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import io.codecrook.mycitytour.R;
import io.codecrook.mycitytour.model.Place;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.placelist_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeTitleTextView = (TextView) listItemView.findViewById(R.id.placeItem_title);
        placeTitleTextView.setText(currentPlace.getmName());


        TextView placeLocationTextView = (TextView) listItemView.findViewById(R.id.placeItem_location);
        placeLocationTextView.setText(currentPlace.getmLocation());

        ImageView placeIconImageView = (ImageView) listItemView.findViewById(R.id.place_icon);

        switch (currentPlace.getmType()) {
            case "park":
                placeIconImageView.setImageResource(R.drawable.park);
                break;
            case "restaurant":
                placeIconImageView.setImageResource(R.drawable.food);
                break;
            case "fair":
                placeIconImageView.setImageResource(R.drawable.fairs);
                break;
            case "movie":
                placeIconImageView.setImageResource(R.drawable.movies);
                break;
        }


        return listItemView;
    }
}
