package io.codecrook.mycitytour.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.codecrook.mycitytour.R;

public class MainActivity extends AppCompatActivity {

    Button startAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startAppButton = findViewById(R.id.start_app_button);
        startAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startAppIntent = new Intent(MainActivity.this, ShowcaseActivity.class);
                startActivity(startAppIntent);
                finish();
            }
        });
    }
}
