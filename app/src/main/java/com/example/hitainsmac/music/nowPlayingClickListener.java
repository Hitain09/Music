package com.example.hitainsmac.music;

import android.view.View;
import android.widget.Toast;

public class nowPlayingClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"Song Currently Playing",Toast.LENGTH_SHORT).show();
    }
}
