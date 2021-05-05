package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
    int x,y;
    Bitmap background;

    Background(Resources res){
        background = BitmapFactory.decodeResource(res, R.drawable.bg);
        background = Bitmap.createScaledBitmap(background, 2160, 2220,false);
    }

    Bitmap getBackground(){
        return background;
    }

}
