package com.example.androidchoi.volleyproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mTextPlaceName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextPlaceName = (TextView)findViewById(R.id.text_place_name);

        String ccbaKdcd = "11";
        String ccbaCtcd = "11";
        String ccbaAsno = "02240000";

        NetworkManager.getInstance().getPlaceInfo(MainActivity.this, ccbaKdcd, ccbaCtcd, ccbaAsno,
                new NetworkManager.OnResultListener<PlaceLab>() {
                    @Override
                    public void onSuccess(PlaceLab result) {
                        mTextPlaceName.setText(result.getPlaceData().getName());
                    }

                    @Override
                    public void onFail(String error) {
                        Toast.makeText(MainActivity.this, "데이터를 불러올 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
