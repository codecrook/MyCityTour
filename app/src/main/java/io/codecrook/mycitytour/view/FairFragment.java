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
import io.codecrook.mycitytour.model.Place;
import io.codecrook.mycitytour.model.PlaceAdapter;

public class FairFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_showcase, container, false);

        final ArrayList<Place> fairs = new ArrayList<>();
        fairs.add(new Place(getString(R.string.placeTypeFare), getString(R.string.fair1Title), getString(R.string.fair1Address), R.drawable.fairs, getString(R.string.fair1Description)));
        fairs.add(new Place(getString(R.string.placeTypeFare), getString(R.string.fair2Title), getString(R.string.fair2Address), R.drawable.fairs, getString(R.string.fair2Description)));
        fairs.add(new Place(getString(R.string.placeTypeFare), getString(R.string.fair3Title), getString(R.string.fair3Address), R.drawable.fairs, getString(R.string.fair3Description)));
        fairs.add(new Place(getString(R.string.placeTypeFare), getString(R.string.fair4Title), getString(R.string.fair4Address), R.drawable.fairs, getString(R.string.fair4Description)));


        ListView placesListView = (ListView) rootView.findViewById(R.id.places_list_view);
        PlaceAdapter fairAdapter = new PlaceAdapter(rootView.getContext(), fairs);
        placesListView.setAdapter(fairAdapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Place placeToDisplay = fairs.get(position);

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
