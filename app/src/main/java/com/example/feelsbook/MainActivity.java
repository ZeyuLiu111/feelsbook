package com.example.feelsbook;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button love;
    public Button joy;
    public Button surprise;
    public Button anger;
    public Button sadness;
    public Button fear;
    public Button history;
    public Button detail;
    String mood = "";
    int love_count = 0;
    int joy_count = 0;
    int surprise_count = 0;
    int anger_count = 0;
    int sadness_count = 0;
    int fear_count = 0;


    public void init() {
        love = (Button) findViewById(R.id.love);
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "love";
                love_count = love_count+1;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                toy.putExtra("count",love_count);
                startActivity(toy);
            }
        });
        joy = (Button) findViewById(R.id.joy);
        joy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "joy";
                joy_count = joy_count+1;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                toy.putExtra("count",joy_count);
                startActivity(toy);
            }
        });
        surprise = (Button) findViewById(R.id.surprise);
        surprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "surprise";
                surprise_count = surprise_count+1;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                toy.putExtra("count",surprise_count);
                startActivity(toy);
            }
        });
        anger = (Button) findViewById(R.id.anger);
        anger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "anger";
                anger_count = anger_count+1 ;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                toy.putExtra("count",anger_count);
                startActivity(toy);
            }
        });
        sadness = (Button) findViewById(R.id.sadness);
        sadness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "sadness";
                sadness_count = sadness_count+1;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                detail.putExtra("count", sadness_count);
                startActivity(toy);
            }
        });
        fear = (Button) findViewById(R.id.fear);
        fear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood = "fear";
                fear_count = fear_count+1;
                Intent toy = new Intent(MainActivity.this, content.class);
                toy.putExtra("mood",mood);
                Intent detail = new Intent(MainActivity.this,detail.class);
                toy.putExtra("count",fear_count);
                startActivity(toy);
            }
        });
        history = (Button) findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, history.class);
                startActivity(toy);
            }
        });
        detail = (Button) findViewById(R.id.detail);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, detail.class);
                startActivity(toy);
            }
        });

    }


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

}
