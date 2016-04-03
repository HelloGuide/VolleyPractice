package com.example.androidchoi.volleyproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue request = Volley.newRequestQueue(MainActivity.this);
        request.add(new StringRequest(Request.Method.GET, "http://www.cha.go.kr/cha/SearchKindOpenapiDt.do?ccbaKdcd=11&ccbaCtcd=11&ccbaAsno=02240000",
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        // TODO Auto-generated method stub
                        Log.i("Resopnse", response);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub
                VolleyLog.d("Error", error.getMessage());
            }
        }));
    }
}
