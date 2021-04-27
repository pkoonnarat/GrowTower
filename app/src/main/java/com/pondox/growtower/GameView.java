package com.pondox.growtower;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;

import java.util.ArrayList;

public class GameView extends SurfaceView implements Runnable {
    private Thread thread;
    private boolean isPlaying;
    private int screenX,screenY;
    private Background background;
    public static float screenRatioX, screenRatioY;
    private Paint paint;
    Character hero,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,pos10,pos11,pos12,pos13,pos14,pos15;

    Paint textPaint,announcePaint;
    Enemy enemy1,enemy2,enemy3,enemy4;


    public GameView(Context context,int screenX, int screenY) {
        super(context);
        this.screenX = 1080;
        this.screenY = 1920;
        background = new Background(getResources());
        paint = new Paint();
        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(75);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStrokeWidth(10);
        announcePaint = new Paint();
        announcePaint.setColor(Color.RED);
        announcePaint.setStyle(Paint.Style.FILL);
        announcePaint.setTextSize(200);
        announcePaint.setTextAlign(Paint.Align.CENTER);



        //hero = new Hero(5,getResources(),100,1620);
        hero = new Hero(5,getResources(),100,1620);
        pos2 = new Enemy(getResources(),100,1320);
        pos3 = new Enemy(getResources(),100,1020);
        pos4 = new Enemy(getResources(),100,720);
        pos5 = new Enemy(getResources(),100,420);
        
        pos6 = new Enemy(getResources(),400,1620);
        pos7 = new Enemy(getResources(),400,1320);
        pos8 = new Enemy(getResources(),400,1020);
        pos9 = new Enemy(getResources(),400,720);
        pos10 = new Enemy(getResources(),400,420);

        pos11 = new Enemy(getResources(),700,1620);
        pos12 = new Enemy(getResources(),700,1320);
        pos13 = new Enemy(getResources(),700,1020);
        pos14 = new Enemy(getResources(),700,720);
        pos15 = new Enemy(getResources(),700,420);
        

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

            //canvas.drawBitmap(hero.getHero(),100,1820,paint);
            if(hero.dead == false){
                canvas.drawBitmap(((Hero)hero).getHero(),hero.x,hero.y,paint);
                canvas.drawText(hero.getHealth(),hero.x+50,hero.y+260,textPaint);
            }
            if(pos2.dead == false){
                canvas.drawBitmap(((Enemy)pos2).getEnemy(),pos2.x,pos2.y,paint);
                canvas.drawText(pos2.getHealth(),pos2.x+50,pos2.y+260,textPaint);
            }
            if(pos3.dead == false){
                canvas.drawBitmap(((Enemy)pos3).getEnemy(),pos3.x,pos3.y,paint);
                canvas.drawText(pos3.getHealth(),pos3.x+50,pos3.y+260,textPaint);
            }
            if(pos4.dead == false){
                canvas.drawBitmap(((Enemy)pos4).getEnemy(),pos4.x,pos4.y,paint);
                canvas.drawText(pos4.getHealth(),pos4.x+50,pos4.y+260,textPaint);
            }
            if(pos5.dead == false){
                canvas.drawBitmap(((Enemy)pos5).getEnemy(),pos5.x,pos5.y,paint);
                canvas.drawText(pos5.getHealth(),pos5.x+50,pos5.y+260,textPaint);
            }

            if(pos6.dead == false){
                canvas.drawBitmap(((Enemy)pos6).getEnemy(),pos6.x,pos6.y,paint);
                canvas.drawText(pos6.getHealth(),pos6.x+50,pos6.y+260,textPaint);
            }
            if(pos7.dead == false){
                canvas.drawBitmap(((Enemy)pos7).getEnemy(),pos7.x,pos7.y,paint);
                canvas.drawText(pos7.getHealth(),pos7.x+50,pos7.y+260,textPaint);
            }
            if(pos8.dead == false){
                canvas.drawBitmap(((Enemy)pos8).getEnemy(),pos8.x,pos8.y,paint);
                canvas.drawText(pos8.getHealth(),pos8.x+50,pos8.y+260,textPaint);
            }
            if(pos9.dead == false){
                canvas.drawBitmap(((Enemy)pos9).getEnemy(),pos9.x,pos9.y,paint);
                canvas.drawText(pos9.getHealth(),pos9.x+50,pos9.y+260,textPaint);
            }
            if(pos10.dead == false){
                canvas.drawBitmap(((Enemy)pos10).getEnemy(),pos10.x,pos10.y,paint);
                canvas.drawText(pos10.getHealth(),pos10.x+50,pos10.y+260,textPaint);
            }
            if(pos11.dead == false){
                canvas.drawBitmap(((Enemy)pos11).getEnemy(),pos11.x,pos11.y,paint);
                canvas.drawText(pos11.getHealth(),pos11.x+50,pos11.y+260,textPaint);
            }
            if(pos12.dead == false){
                canvas.drawBitmap(((Enemy)pos12).getEnemy(),pos12.x,pos12.y,paint);
                canvas.drawText(pos12.getHealth(),pos12.x+50,pos12.y+260,textPaint);
            }
            if(pos13.dead == false){
                canvas.drawBitmap(((Enemy)pos13).getEnemy(),pos13.x,pos13.y,paint);
                canvas.drawText(pos13.getHealth(),pos13.x+50,pos13.y+260,textPaint);
            }
            if(pos14.dead == false){
                canvas.drawBitmap(((Enemy)pos14).getEnemy(),pos14.x,pos14.y,paint);
                canvas.drawText(pos14.getHealth(),pos14.x+50,pos14.y+260,textPaint);
            }
            if(pos15.dead == false){
                canvas.drawBitmap(((Enemy)pos15).getEnemy(),pos15.x,pos15.y,paint);
                canvas.drawText(pos15.getHealth(),pos15.x+50,pos15.y+260,textPaint);
            }
            
            
            
            if(hero.dead == true){
                int xPos = (canvas.getWidth() / 2);
                int yPos = (int) ((canvas.getHeight() / 2) - ((textPaint.descent() + textPaint.ascent()) / 2)) ;
                //((textPaint.descent() + textPaint.ascent()) / 2) is the distance from the baseline to the center.

                canvas.drawText("Game Over!", xPos, yPos, announcePaint);
            }

            if(pos2.dead==true && pos3.dead==true && pos4.dead==true && pos5.dead==true && pos6.dead==true && pos7.dead==true && pos8.dead==true && pos9.dead==true && pos10.dead==true && pos11.dead==true && pos12.dead==true && pos13.dead==true && pos14.dead==true && pos15.dead==true){
                int xPos = (canvas.getWidth() / 2);
                int yPos = (int) ((canvas.getHeight() / 2) - ((textPaint.descent() + textPaint.ascent()) / 2)) ;
                //((textPaint.descent() + textPaint.ascent()) / 2) is the distance from the baseline to the center.

                canvas.drawText("You Win!", xPos, yPos, announcePaint);
            }
            //canvas.drawBitmap(    ((Enemy)(row1.get(1))).getEnemy()    , row1.get(1).x  ,row1.get(1).y,paint);
            //canvas.drawText(String.valueOf(((Enemy)(row1.get(1))).getHealth()), 160, 1680, textPaint);


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

    public boolean onTouchEvent(MotionEvent event)
    {
        float x = event.getX();
        float y = event.getY();
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                //Check if the x and y position of the touch is inside the bitmap
                if( x > hero.x && x < hero.x + hero.width && y > hero.y && y < hero.y + hero.height )
                {
                    //Bitmap touched

                    System.out.println("1 was clicked!!");
                }
                if( x > pos2.x && x < pos2.x + pos2.width && y > pos2.y && y < pos2.y + pos2.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos2);

                }
                if( x > pos3.x && x < pos3.x + pos3.width && y > pos3.y && y < pos3.y + pos3.height )
                {
                    //Bitmap touched

                    System.out.println("3 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos3);

                }
                if( x > pos4.x && x < pos4.x + pos4.width && y > pos4.y && y < pos4.y + pos4.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos4);

                }
                if( x > pos5.x && x < pos5.x + pos5.width && y > pos5.y && y < pos5.y + pos5.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos5);

                }
                if( x > pos6.x && x < pos6.x + pos6.width && y > pos6.y && y < pos6.y + pos6.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos6);

                }
                if( x > pos7.x && x < pos7.x + pos7.width && y > pos7.y && y < pos7.y + pos7.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos7);

                }
                if( x > pos8.x && x < pos8.x + pos8.width && y > pos8.y && y < pos8.y + pos8.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos8);

                }
                if( x > pos9.x && x < pos9.x + pos9.width && y > pos9.y && y < pos9.y + pos9.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos9);

                }
                if( x > pos10.x && x < pos10.x + pos10.width && y > pos10.y && y < pos10.y + pos10.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos10);

                }
                if( x > pos11.x && x < pos11.x + pos11.width && y > pos11.y && y < pos11.y + pos11.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos11);

                }
                if( x > pos12.x && x < pos12.x + pos12.width && y > pos12.y && y < pos12.y + pos12.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos12);

                }
                if( x > pos13.x && x < pos13.x + pos13.width && y > pos13.y && y < pos13.y + pos13.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos13);

                }
                if( x > pos14.x && x < pos14.x + pos14.width && y > pos14.y && y < pos14.y + pos14.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos14);

                }
                if( x > pos15.x && x < pos15.x + pos15.width && y > pos15.y && y < pos15.y + pos15.height )
                {
                    //Bitmap touched

                    System.out.println("2 was clicked!!");

                    System.out.println(hero.getClass());
                    ((Hero)hero).fight(pos15);

                }
                return true;
        }
        return false;
    }

}
