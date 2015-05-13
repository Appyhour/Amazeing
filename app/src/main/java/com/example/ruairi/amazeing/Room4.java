package com.example.ruairi.amazeing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Room4 extends ActionBarActivity {

    private ImageView exit;
    private ImageView doorStraight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room4);

        Intent intent = getIntent();

        doorStraight = (ImageView)findViewById(R.id.Straight);

        exit = (ImageView)findViewById(R.id.roomFourExit);

        doorStraight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageStraight();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageExit();
            }
        });
    }

    public void sendMessageStraight() {
        Intent intent = new Intent(this, outside.class);
        startActivity(intent);
    }

    public void sendMessageExit() {
        Intent intent = new Intent(this, outside.class);
        startActivity(intent);
    }

}
