package com.example.priya.practice_app;
import android.support.v7.app.AppCompatActivity;
        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;

import com.example.priya.practice_app.R;

/**
 * Created by Priya on 3/7/2016.
 */
public class Take_A_Ride extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_a_ride);
        View backgroundimage = findViewById(R.id.back);
        Drawable background = backgroundimage.getBackground();
        background.setAlpha(80);
    }
}


