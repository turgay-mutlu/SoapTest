package com.mutlu.turgay.soaptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mutlu.turgay.soaptest.api.Network;
import com.mutlu.turgay.soaptest.request.RequestBody;
import com.mutlu.turgay.soaptest.request.RequestData;
import com.mutlu.turgay.soaptest.request.RequestEnvelope;
import com.mutlu.turgay.soaptest.response.ResponseEnvelope;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestEnvelope requestEnvelope = new RequestEnvelope();
        RequestBody requestBody = new RequestBody();
        RequestData requestData = new RequestData();

        requestData.setIntA(5);
        requestData.setIntB(10);

        requestBody.setAdd(requestData);
        requestEnvelope.setBody(requestBody);

        Network.getInstance().getService().add(requestEnvelope).enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                Log.e(TAG, "onResponse: "  + response.body().getBody().getAddResponse().getAddResult());
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                Log.e(TAG, "onFailure: " );
            }
        });
    }
}
