package com.example.hitainsmac.music;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new nowPlayingClickListener();
        ImageView now = (ImageView)findViewById(R.id.nowPlayingView);
        now.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playing = new Intent(MainActivity.this,nowPlaying.class);
                startActivity(playing);
            }

        });

        new allSongsClickListener();
        ImageView allsongs = (ImageView)findViewById(R.id.allsongsView);
        allsongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent allsongs = new Intent(MainActivity.this,allSongs.class);
                startActivity(allsongs);
            }

        });

        new artistsClickListener();
        ImageView artist = (ImageView)findViewById(R.id.artistView);
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artist = new Intent(MainActivity.this,artists.class);
                startActivity(artist);
            }
        });

        new favouritesClickListener();
        ImageView favr = (ImageView)findViewById(R.id.favView);
        favr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent favourites = new Intent(MainActivity.this,Favourites.class);
                startActivity(favourites);
            }
        });

        ImageView you = (ImageView) findViewById(R.id.onlineView);
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://youtube.com/";
                Uri webpage = Uri.parse(url);
                Intent youtube = new Intent(Intent.ACTION_VIEW, webpage);
                if (youtube.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(youtube);
                }
            }
        });



        new playlistsClickListener();
        ImageView play = (ImageView)findViewById(R.id.playlists );
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playlists = new Intent(MainActivity.this,Playlists.class);
                startActivity(playlists);
            }
        });

        ImageView playButton =(ImageView) findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener()
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