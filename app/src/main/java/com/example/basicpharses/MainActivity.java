package com.example.basicpharses;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonTapped(View view){
        int id = view.getId();
        String outId = "";
        outId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(outId, " raw", "com.example.basicpharses");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
        Log.i("button tapped", outId);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}