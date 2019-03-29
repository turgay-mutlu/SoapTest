package com.mutlu.turgay.soaptest.api;

import com.mutlu.turgay.soaptest.request.RequestBody;
import com.mutlu.turgay.soaptest.request.RequestEnvelope;
import com.mutlu.turgay.soaptest.response.ResponseEnvelope;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface Service {

    @Headers({
            "Content-Type: application/soap+xml",
            "Accept-Charset: utf-8"
    })
    @POST("/calculator.asmx?op=Add")
    Call<ResponseEnvelope> add(@Body RequestEnvelope body);
}
