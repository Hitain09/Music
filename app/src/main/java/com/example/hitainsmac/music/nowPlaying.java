package com.example.hitainsmac.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        allSongsClickListener clickListener = new allSongsClickListener();
        TextView allsongs = (TextView)findViewById(R.id.nowPlaying);
        allsongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent allsongs = new Intent(nowPlaying.this,allSongs.class);
                startActivity(allsongs);
            }

        });
    }
}
