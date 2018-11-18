package io.codecrook.mycitytour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class tab1 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab1, container, false);

        ArrayList<Place> tourItems = new ArrayList<>();
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));
        tourItems.add(new Place("park", "IG Park", "Bapuji Nagar", R.drawable.park, "abc"));

        ListView lv = (ListView) rootView.findViewById(R.id.playlist_list_view);
        PlaceAdapter arrlvv = new PlaceAdapter(rootView.getContext(), tourItems);
        lv.setAdapter(arrlvv);

        return rootView;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
