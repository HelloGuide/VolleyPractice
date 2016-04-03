package com.example.androidchoi.volleyproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ccbaKdcd = "11";
        String ccbaCtcd = "11";
        String ccbaAsno = "02240000";

        NetworkManager.getInstance().getPlaceInfo(MainActivity.this, ccbaKdcd, ccbaCtcd, ccbaAsno);
    }
}
