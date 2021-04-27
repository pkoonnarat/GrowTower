package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.ThreadLocalRandom;

public class Enemy extends Character{
    Bitmap enemy;
    int width,height;
    public Enemy(Resources res,int x,int y) {
        super((int)(Math.random()*10)+1,x,y);

        enemy = BitmapFactory.decodeResource(res, R.drawable.enemy);

        width = 200;
        height = 200;
        enemy = Bitmap.createScaledBitmap(enemy,width,height,false);
    }

    Bitmap getEnemy(){
        return enemy;
    }

}
