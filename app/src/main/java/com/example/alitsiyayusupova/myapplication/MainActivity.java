package com.example.alitsiyayusupova.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void stockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void buildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void makeYourAppMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void goUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void capstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone project";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
