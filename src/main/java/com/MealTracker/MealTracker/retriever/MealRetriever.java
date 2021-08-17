/*package com.MealTracker.MealTracker.retriever;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class MealRetriever {
    public static double getCurrentResponse(String foodType) throws IOException {
    try {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://calorieninjas.p.rapidapi.com/v1/nutrition?query=" + foodType)
                .get()
                .addHeader("x-rapidapi-key", "0c7592829fmshed1a438c1a02fd5p1bacabjsn5fda5ab91104")
                .addHeader("x-rapidapi-host", "calorieninjas.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();



}*/


