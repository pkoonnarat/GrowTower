package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Enemy extends Character{
    Bitmap enemy;
    int x,y,width,height;
    public Enemy(Resources res) {
        super((int)(Math.random()*20));

        enemy = BitmapFactory.decodeResource(res, R.drawable.enemy);

        width = 200;
        height = 200;
        enemy = Bitmap.createScaledBitmap(enemy,width,height,false);
    }

    Bitmap getEnemy(){
        return enemy;
    }

}
