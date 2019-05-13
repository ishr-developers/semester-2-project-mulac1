package com.example.android.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {

    double hannoverLatitude = 52.37052;
    double hannoverLongitude = 9.73322;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button search_button =(Button) findViewById(R.id.search_button);

        search_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });
    }


    //TODO: Get the search terms and pass them to the Maps Activity.

    void buildSearchUrl(){
        EditText editText = findViewById(R.id.search);
        String searchTerms = editText.getText().toString();


        String baseUrl = "https://www.mapquestapi.com/search/v4/place";

       Uri.Builder builder = new Uri.Builder();
       builder.scheme("https");
       builder.authority("www.mapquestapi.com");
       builder.appendPath("search");
       builder.appendPath("v4");
       builder.appendPath("place");

       String location = Double.toString(hannoverLatitude) + "," + Double.toString(hannoverLatitude);
       builder.appendQueryParameter("location", location );
       builder.appendQueryParameter("sort","relevance");
       builder.appendQueryParameter("key", "sZnXxNM0IP09xQEFmj0KECwhHxsqFjv9");
       builder.appendQueryParameter("q", searchTerms);

       String url = builder.build().toString();

       Intent intent = new Intent(this, MapsActivity.class);
       intent.putExtra("URL", url);
       startActivity(intent);



    }
    //TODO: Then start the Maps Activity.
}
