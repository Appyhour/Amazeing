package com.example.ruairi.amazeing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class Start extends ActionBarActivity {

    private ImageView doorStraight;

    private ImageView enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Intent intent = getIntent();

        doorStraight = (ImageView) findViewById(R.id.startStraight);
        enter = (ImageView) findViewById(R.id.startEnter);


        doorStraight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageStraight();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageStraight();
            }
        });


    }




    public void sendMessageStraight() {
        Intent intent = new Intent(this, Room1.class);
        startActivity(intent);
    }


    }

