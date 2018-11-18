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

public class MovieFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_showcase, container, false);

        final ArrayList<Place> movieTheaters = new ArrayList<>();

        movieTheaters.add(new Place(getString(R.string.placeTypeMovie), getString(R.string.movie1Title), getString(R.string.movie1Address), R.drawable.movies, getString(R.string.movie1Description)));
        movieTheaters.add(new Place(getString(R.string.placeTypeMovie), getString(R.string.movie2Title), getString(R.string.movie2Address), R.drawable.movies, getString(R.string.movie2Description)));
        movieTheaters.add(new Place(getString(R.string.placeTypeMovie), getString(R.string.movie3Title), getString(R.string.movie3Address), R.drawable.movies, getString(R.string.movie3Description)));
        movieTheaters.add(new Place(getString(R.string.placeTypeMovie), getString(R.string.movie4Title), getString(R.string.movie4Address), R.drawable.movies, getString(R.string.movie4Description)));
        movieTheaters.add(new Place(getString(R.string.placeTypeMovie), getString(R.string.movie5Title), getString(R.string.movie5Address), R.drawable.movies, getString(R.string.movie5Description)));

        ListView placesListView = (ListView) rootView.findViewById(R.id.places_list_view);
        PlaceAdapter movieAdapter = new PlaceAdapter(rootView.getContext(), movieTheaters);
        placesListView.setAdapter(movieAdapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Place placeToDisplay = movieTheaters.get(position);

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
