package com.example.administrator.test;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class SharePreference {

    public static final String SHOU = "shou";
    public static final String tt = "tt";
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    /**
     * save imageview pics to preference
     */
    public static void setInt(Context context, String key, int value) {
// get SharedPreferences
        SharedPreferences preferences = context.getSharedPreferences(
                "p", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    //save titles
    public static void setString(Context context, String key, List<String> values, String value) {

        SharedPreferences preferences = context.getSharedPreferences(
                "p", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        String regularEx = "#";
        String str = "";
        if (values.size() > 0) {
            String[] titles = values.toArray(new String[values.size()]);
            for (String title : titles) {
                value += regularEx;
                value += title;
            }
        }
        editor.putString(key, value);
        editor.commit();
    }


    //get titels data from Preference
    public static List getString(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(
                "p", Context.MODE_PRIVATE);
        String regularEx = "#";
        List<String> titles = new ArrayList<String>();
        String[] str = null;
//default
        String values = preferences.getString(key, "");
        str = values.split(regularEx);
        for (int i = 0; i < str.length; i++) {
            titles.add(str[i]);
        }
        return titles;
    }

    /**
     * save datalist
     * @param tag
     * @param datalist
     */


}
