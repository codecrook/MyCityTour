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

public class ParkFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_showcase, container, false);

        final ArrayList<Place> parks = new ArrayList<>();
        parks.add(new Place(getString(R.string.placeTypePark), getString(R.string.park1Title), getString(R.string.park1Address), R.drawable.park, getString(R.string.park1Description)));
        parks.add(new Place(getString(R.string.placeTypePark), getString(R.string.park2Title), getString(R.string.park2Address), R.drawable.park, getString(R.string.park2Description)));
        parks.add(new Place(getString(R.string.placeTypePark), getString(R.string.park3Title), getString(R.string.park3Address), R.drawable.park, getString(R.string.park3Description)));
        parks.add(new Place(getString(R.string.placeTypePark), getString(R.string.park4Title), getString(R.string.park4Address), R.drawable.park, getString(R.string.park4Description)));


        ListView placesListView = (ListView) rootView.findViewById(R.id.places_list_view);
        PlaceAdapter parkAdapter = new PlaceAdapter(rootView.getContext(), parks);
        placesListView.setAdapter(parkAdapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Place placeToDisplay = parks.get(position);

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
