package com.example.ruairi.amazeing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Room3 extends ActionBarActivity {

    private ImageView doorLeft;
    private ImageView doorRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room3);

        Intent intent = getIntent();

        doorLeft = (ImageView) findViewById(R.id.roomThreeLeft);
        doorRight = (ImageView) findViewById(R.id.roomThreeRight);


        doorLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageLeft();
            }
        });
        doorRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageRight();
            }
        });}


    public void sendMessageLeft() {
        Intent intent = new Intent(this, Room4.class);
        startActivity(intent);
    }
    public void sendMessageRight() {
        Intent intent = new Intent(this, Room4.class);
        startActivity(intent);

}}

