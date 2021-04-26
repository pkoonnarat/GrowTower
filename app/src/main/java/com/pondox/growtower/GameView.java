package com.pondox.growtower;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;

import java.util.ArrayList;

public class GameView extends SurfaceView implements Runnable {
    private Thread thread;
    private boolean isPlaying;
    private int screenX,screenY;
    private Background background;
    public static float screenRatioX, screenRatioY;
    private Paint paint;
    ArrayList<Character> row1 = new ArrayList<Character>();
    Hero hero;
    Paint textPaint;
    Enemy enemy1;


    public GameView(Context context,int screenX, int screenY) {
        super(context);
        this.screenX = 1080;
        this.screenY = 1920;
        background = new Background(getResources());
        paint = new Paint();
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setStyle(Paint.Style.FILL);


        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(75);

        enemy1 = new Enemy(getResources());
        hero = new Hero(5,getResources());
    }

    @Override
    public void run() {
        while(isPlaying){
            update();
            draw();
            sleep();
        }

    }

    private void draw(){
        if (getHolder().getSurface().isValid()){
            Canvas canvas = getHolder().lockCanvas();
            canvas.drawPaint(textPaint);

            canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bg),0,0,null);
            canvas.drawText(String.valueOf(enemy1.getHealth()), 100, 250, textPaint);
            canvas.drawBitmap(hero.getHero(),500,500,paint);
            canvas.drawBitmap(enemy1.getEnemy(),0,0,paint);

            getHolder().unlockCanvasAndPost(canvas);
        }

    }

    private void update() {
        background.x = screenX;

    }

    private void sleep() {
        try {
            thread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void resume() {
        isPlaying = true;
        thread = new Thread(this);
        thread.start();
    }

    public void pause() {
        try {
            isPlaying = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
