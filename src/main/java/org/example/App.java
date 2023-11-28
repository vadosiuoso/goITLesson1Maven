package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App
{
    public static void main( String[] args )
    {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(new MyName("Vadym", "Lapynin"));
        System.out.println(json);
    }
}
