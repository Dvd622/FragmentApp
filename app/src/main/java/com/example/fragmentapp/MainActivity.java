package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button imageOneButton = findViewById(R.id.imageOneButton);
        Button imageTwoButton = findViewById(R.id.imageTwoButton);

        imageOneButton.setOnClickListener(this::imageOneButtonClick);
        imageTwoButton.setOnClickListener(this::imageTwoButtonClick);
    }

    public void imageOneButtonClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainerView, ImageFragment.class, null);
        fragmentTransaction.commit();
    }
    public void imageTwoButtonClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainerView, Image2Fragment.class, null);
        fragmentTransaction.addToBackStack("App");
        fragmentTransaction.commit();
    }
}