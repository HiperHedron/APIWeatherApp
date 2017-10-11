package com.starfire.lux.apiweatherapp.common;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by Lux on 11.10.2017.
 */

public class Common {

    public static String API_KEY = "d3cae98f1c35936e6a86f3d9952afd6d";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String API_REQUEST(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        return sb.append(String.format("?lat=%s&lon=%s&units=metric",lat,lng,API_KEY)).toString();
    }

    public static String UNIX_TIMESTAMP_TO_DATE_TIME(double uts){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) uts * 1000);
    return dateFormat.format(date);
    }



}
