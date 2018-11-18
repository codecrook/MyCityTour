package io.codecrook.mycitytour.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import io.codecrook.mycitytour.R;
import io.codecrook.mycitytour.controller.ShowcaseActivity;
import io.codecrook.mycitytour.model.Place;
import io.codecrook.mycitytour.model.PlaceAdapter;

public class RestaurantFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_showcase, container, false);

        final ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(getString(R.string.placeTypeRest), getString(R.string.rest1Title), getString(R.string.rest1Address), R.drawable.food, getString(R.string.rest1Description)));
        restaurants.add(new Place(getString(R.string.placeTypeRest), getString(R.string.rest2Title), getString(R.string.rest2Address), R.drawable.food, getString(R.string.rest2Description)));
        restaurants.add(new Place(getString(R.string.placeTypeRest), getString(R.string.rest3Title), getString(R.string.rest3Address), R.drawable.food, getString(R.string.rest3Description)));
        restaurants.add(new Place(getString(R.string.placeTypeRest), getString(R.string.rest4Title), getString(R.string.rest4Address), R.drawable.food, getString(R.string.rest4Description)));
        restaurants.add(new Place(getString(R.string.placeTypeRest), getString(R.string.rest5Title), getString(R.string.rest5Address), R.drawable.food, getString(R.string.rest5Description)));


        ListView placesListView = (ListView) rootView.findViewById(R.id.places_list_view);
        PlaceAdapter restaurantAdapter = new PlaceAdapter(rootView.getContext(), restaurants);
        placesListView.setAdapter(restaurantAdapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Place placeToDisplay = restaurants.get(position);

                Intent detailDisplayIntent = new Intent(rootView.getContext(), DetailsActivity.class);
                detailDisplayIntent.putExtra("placeTitle", placeToDisplay.getmName());
                detailDisplayIntent.putExtra("placeAddress", placeToDisplay.getmLocation());
                detailDisplayIntent.putExtra("placeDescription", placeToDisplay.getmDescription());
                detailDisplayIntent.putExtra("placeImage", placeToDisplay.getmPhotoResID());

                startActivity(detailDisplayIntent);
            }
        });

        return rootView;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
