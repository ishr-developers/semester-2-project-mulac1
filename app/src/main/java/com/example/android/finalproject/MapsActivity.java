package com.example.android.finalproject;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mapquest.mapping.MapQuest;

public class MapsActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    private static final int REQUEST_LOCATION_PERMISSION = 1;
    String searchUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        MapQuest.start(getApplicationContext());

        //TODO: Get the data from the intent.

        //TODO: Build the URL and set the search.
        Intent intent = getIntent();

        searchUrl= intent.getStringExtra("URL");


        requestPermission();

        startLoader();

        Button list_button =(Button) findViewById(R.id.listButton);

        list_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), ListActivtiy.class));
            }
        });
    }


    //TODO: Create a function to search MapQuest




    public void requestPermission() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        } else {

        }
    }


    //This function will handle what to do when the user sets the permission. Don't touch it.
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_LOCATION_PERMISSION:
                // If the permission is granted, get the location,
                // otherwise, show a Toast
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getLastLocation();
                } else {
                    finish();
                }
                break;
        }
    }


    public void getLastLocation() {
        Toast.makeText(this, "Permission granted", Toast.LENGTH_LONG).show();
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int i, @Nullable Bundle bundle) {
        return new DataDownloader(this,searchUrl);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String s) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {

    }


    public  void  startLoader(){
        LoaderManager manager = getLoaderManager();
        manager.initLoader(1,null,this);
    }

}
