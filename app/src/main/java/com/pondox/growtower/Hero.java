package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import static com.pondox.growtower.GameView.screenRatioX;
import static com.pondox.growtower.GameView.screenRatioY;

public class Hero extends Character{
    Bitmap hero;
    int x,y,width,height;
    public Hero(int health, Resources res) {
        super(health);
        System.out.println("Hero runs");
        hero = BitmapFactory.decodeResource(res, R.drawable.hero);

        width = 200;
        height = 200;
        hero = Bitmap.createScaledBitmap(hero,width,height,false);

    }


    Bitmap getHero(){

        return hero;
    }

}
