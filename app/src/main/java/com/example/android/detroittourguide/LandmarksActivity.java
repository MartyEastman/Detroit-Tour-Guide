package com.example.android.detroittourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by eastm on 11/10/2017.
 */

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LandmarksFragment())
                .commit();
    }
}
