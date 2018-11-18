package io.codecrook.mycitytour.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import io.codecrook.mycitytour.R;

public class DetailsActivity extends AppCompatActivity {

    ImageView placeImage;
    TextView placeTitle, placeAddress, placeDescription;

    String placeTitleText, placeAddressText, placeDescriptionText;
    int placeImageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        placeImageID = getIntent().getExtras().getInt("placeImage");
        placeTitleText = getIntent().getExtras().getString("placeTitle");
        placeAddressText = getIntent().getExtras().getString("placeAddress");
        placeDescriptionText = getIntent().getExtras().getString("placeDescription");

        placeImage = findViewById(R.id.details_place_image);
        placeImage.setImageResource(placeImageID);

        placeTitle = findViewById(R.id.details_place_title);
        placeTitle.setText(placeTitleText);

        placeAddress = findViewById(R.id.details_place_address);
        placeAddress.setText(placeAddressText);

        placeDescription = findViewById(R.id.details_place_description);
        placeDescription.setText(placeDescriptionText);


    }
}
