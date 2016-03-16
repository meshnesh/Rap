package com.example.tune.rap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

    }

    public void onButtonClick(View v) {
        switch (v.getId()) {

            case R.id.video:
                Intent intent = new Intent(this, youtube.class);
                startActivity(intent);
                break;
            case R.id.sound:
                Intent intent1 = new Intent(this, SoundActivity.class);
                startActivity(intent1);
                break;
            default:
                //default intent
                break;


        }
    }
}

