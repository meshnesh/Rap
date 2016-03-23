package com.example.tune.rap;

/**
 * Created by tune on 14/03/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class youtube extends YouTubeBaseActivity {
    //views required
    Button b;
    private YouTubePlayerView youTubePlayerView;

    //add listener that will allow to play, pause, queue...
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_player);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);

        //initialize listener

        onInitializedListener = new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadPlaylist("PLvp_9aKDQj2jPZvGZAqE8wOzie3xYYvl6");


            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                youTubePlayerView.initialize("AIzaSyAKnXHN_yesjxAUfhQ4iyPADeTa3T0olSI", onInitializedListener);
            }
        });

    }

}

