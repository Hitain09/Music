package com.example.hitainsmac.music;

import android.view.View;
import android.widget.Toast;

public class favouritesClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"list of Favourite Songs",Toast.LENGTH_SHORT).show();
    }
}
