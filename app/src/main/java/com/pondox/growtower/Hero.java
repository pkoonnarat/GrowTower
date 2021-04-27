package com.pondox.growtower;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import static com.pondox.growtower.GameView.screenRatioX;
import static com.pondox.growtower.GameView.screenRatioY;

public class Hero extends Character{
    Bitmap hero;
    int width,height;
    public Hero(int health, Resources res,int x,int y) {
        super(health,x,y);
        System.out.println("Hero runs");
        hero = BitmapFactory.decodeResource(res, R.drawable.hero);

        width = 200;
        height = 200;
        hero = Bitmap.createScaledBitmap(hero,width,height,false);

    }


    Bitmap getHero(){

        return hero;
    }

    void fight(Character enemy){
        if(health>=enemy.health&&enemy.dead==false){
            this.health += enemy.health;
            this.x = enemy.x;
            this.y = enemy.y;
            enemy.dead = true;
        }
        else if(health<enemy.health){
            dead = true;
        }
    }

}
