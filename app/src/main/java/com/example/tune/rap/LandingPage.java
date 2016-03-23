package com.example.tune.rap;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        addListeneronButton1();
        addListeneronButton2();
    }
    public void addListeneronButton1()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.video);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, youtube.class);
                startActivity(intent);

            }
        });
    }
    public void addListeneronButton2()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.sound);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, SoundActivity.class);
                startActivity(intent);

            }
        });
    }
}

