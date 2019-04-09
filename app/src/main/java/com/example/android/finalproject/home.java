package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

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
}
