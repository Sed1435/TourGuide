package com.example.sedkol.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NatureContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_container);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.nature_container, new NatureFragment()).commit();
    }
}
