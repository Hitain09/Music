package com.example.hitainsmac.music;

import android.view.View;
import android.widget.Toast;

public class allSongsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"list of all songs ",Toast.LENGTH_SHORT).show();
    }
}
