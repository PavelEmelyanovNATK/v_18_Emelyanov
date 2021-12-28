package com.emelyanovpa.emelyanov_v_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void goToSong(View v){
        Intent goToSong = new Intent(this, SongActivity.class);
        startActivity(goToSong);
    }
}