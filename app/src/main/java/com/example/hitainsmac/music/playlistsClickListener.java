package com.example.hitainsmac.music;

import android.view.View;
import android.widget.Toast;

public class playlistsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"Your Playlists",Toast.LENGTH_SHORT).show();
    }
}
