package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Boss extends Character {
    Bitmap boss;
    int width,height;
    public Boss(Resources res, int x, int y) {
        super((int)(Math.random()*30)+60,x,y);

        boss = BitmapFactory.decodeResource(res, R.drawable.boss);

        width = 200;
        height = 200;
        boss = Bitmap.createScaledBitmap(boss,width,height,false);
    }

    Bitmap getBoss(){
        return boss;
    }
}
