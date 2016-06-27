package com.breakstuff.myrestaurants;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//use the following layout file
        mLocationEditText = (EditText) findViewById(R.id.editText);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton); // recreate button

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() { //add click listener

           @Override
            public void onClick(View v) {
               String location = mLocationEditText.getText().toString();
               Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
               intent.putExtra("location", location);
               startActivity(intent);
           }
        });
    }
}
