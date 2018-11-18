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

public class tab4 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        ArrayList<String> tourItems = new ArrayList<>();
        tourItems.add("ek");
        tourItems.add("do");
        tourItems.add("tin");
        tourItems.add("char");
        tourItems.add("panch");
        tourItems.add("cha");
        tourItems.add("saat");
        tourItems.add("ath");

        ListView lv = (ListView) rootView.findViewById(R.id.playlist_list_view);
        ArrayAdapter<String> arrlvv = new ArrayAdapter<>(rootView.getContext(), android.R.layout.simple_list_item_1, tourItems);
        lv.setAdapter(arrlvv);

        return rootView;
    }
}
