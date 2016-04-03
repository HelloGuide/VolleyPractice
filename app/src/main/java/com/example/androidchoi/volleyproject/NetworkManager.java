package com.example.androidchoi.volleyproject;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Choi on 2016-04-03.
 */
public class NetworkManager {
    private static NetworkManager instance;

    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }
        return instance;
    }

    public interface OnResultListener<T> {
        public void onSuccess(T result);

        public void onFail(int code);
    }

    public void getPlaceInfo(Context context, String ccbaKdcd, String ccbaCtcd, String ccbaAsno) {

        String url = String.format("http://www.cha.go.kr/cha/SearchKindOpenapiDt.do?ccbaKdcd=%s&ccbaCtcd=%s&ccbaAsno=%s", ccbaKdcd, ccbaCtcd, ccbaAsno);
        RequestQueue request = Volley.newRequestQueue(context);
        request.add(new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            // TODO Auto-generated method stub
                            Log.i("Resopnse", response);
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // TODO Auto-generated method stub
                            Log.i("Error", error.getMessage());
                        }
                    }));
    }


}
