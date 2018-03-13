package com.a611solutions.emergencynumbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {


    Button mAfButton;
    Button mAsButton;
    Button mEuButton;
    Button mNaButton;
    Button mOcButton;
    Button mSaButton;
    ImageButton mInfoButton;
    ImageButton mCompasButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Declarations of the various buttons on the home page / MainActivity
        mAfButton = (Button) findViewById(R.id.afButton);
        mAsButton = (Button) findViewById(R.id.asButton);
        mEuButton = (Button) findViewById(R.id.euButton);
        mNaButton = (Button) findViewById(R.id.naButton);
        mOcButton = (Button) findViewById(R.id.ocButton);
        mSaButton = (Button) findViewById(R.id.saButton);
        mInfoButton = (ImageButton) findViewById(R.id.personInfoButton);
        mCompasButton = (ImageButton) findViewById(R.id.compasButton);

// Setting an on click listener for each of the buttons to change to their respective activities
        mAfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AfricaActivity.class);
                startActivity(intent);
            }
        });

// setting onclick listener to switch at asia activity
        mAsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AsiaActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener to switch to the europe activity
        mEuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EuropeActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener to switch to the north america activity
        mNaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NorthAmericaActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener to switch to the oceania activity
        mOcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OceaniaActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener to switch to the south america activity
        mSaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SouthAmericaActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener for the information page
        mInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PersonalInfoActivity.class);
                startActivity(intent);
            }
        });

//setting the onclick listener to show the webview that locates the user
        mCompasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
            }
        });
    }
}
