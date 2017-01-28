package com.example.sedkol.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button touristAttractionBtn;
    private Button restaurantBtn;
    private Button nightlifeBtn;
    private Button natureBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        touristAttractionBtn = (Button) findViewById(R.id.museum_btn);


       touristAttractionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SightseeingContainerActivity.class);
                startActivity(intent);
            }
        });

        restaurantBtn = (Button) findViewById(R.id.restaurant_btn);


        restaurantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RestaurantContainerActivity.class);
                startActivity(intent);
            }
        });

        nightlifeBtn = (Button) findViewById(R.id.nightlife_btn);
        nightlifeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NightlifeContainerActivity.class);
                startActivity(intent);
            }
        });

        natureBtn = (Button) findViewById(R.id.nature_btn);
        natureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NatureContainerActivity.class);
                startActivity(intent);
            }
        });


    }
}
