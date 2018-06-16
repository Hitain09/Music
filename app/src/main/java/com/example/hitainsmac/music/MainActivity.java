package com.example.hitainsmac.music;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new nowPlayingClickListener();
        TextView now = (TextView)findViewById(R.id.nowPlayingView);
        now.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playing = new Intent(MainActivity.this,nowPlaying.class);
                startActivity(playing);
            }

        });

        new allSongsClickListener();
        TextView allsongs = (TextView)findViewById(R.id.allsongs_view);
        allsongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent allsongs = new Intent(MainActivity.this,allSongs.class);
                startActivity(allsongs);
            }

        });

        new artistsClickListener();
        TextView artist = (TextView)findViewById(R.id.artistView);
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artist = new Intent(MainActivity.this,artists.class);
                startActivity(artist);
            }
        });

        new favouritesClickListener();
        TextView favr = (TextView)findViewById(R.id.fav_view);
        favr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent favourites = new Intent(MainActivity.this,Favourites.class);
                startActivity(favourites);
            }
        });

        TextView you = (TextView) findViewById(R.id.onlineView);
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
        TextView play = (TextView)findViewById(R.id.playlists );
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playlists = new Intent(MainActivity.this,Playlists.class);
                startActivity(playlists);
            }
        });
    }
}