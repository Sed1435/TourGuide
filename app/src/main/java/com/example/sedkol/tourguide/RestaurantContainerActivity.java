package com.example.sedkol.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestaurantContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_container_layout);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.restaurant_container, new RestaurantFragment()).commit();
    }
}
