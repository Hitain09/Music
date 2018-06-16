package com.example.hitainsmac.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class nowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        new allSongsClickListener();
        ImageView allsongs = (ImageView)findViewById(R.id.allsongsView);
        allsongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artist = new Intent(nowPlaying.this,allSongs.class);
                startActivity(artist);
            }
        });

        new artistsClickListener();
        ImageView artist = (ImageView)findViewById(R.id.artistView);
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artist = new Intent(nowPlaying.this,artists.class);
                startActivity(artist);
            }
        });

        new favouritesClickListener();
        ImageView favr = (ImageView)findViewById(R.id.favView);
        favr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent favourites = new Intent(nowPlaying.this,Favourites.class);
                startActivity(favourites);
            }
        });


        ImageView play =(ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener()
        {
            int no_of_clicks = 0;
            public void onClick(View view) {
                no_of_clicks++;

                if (no_of_clicks % 2 == 0) {
                    ImageView p = (ImageView) findViewById(R.id.play);
                    p.setImageResource(R.drawable.play);

                }
                else
                {
                    ImageView p = (ImageView) findViewById(R.id.play);
                    p.setImageResource(R.drawable.pause);
                }
            }
        });
    }
}
