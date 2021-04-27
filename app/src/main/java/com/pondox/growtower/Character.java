package com.pondox.growtower;

public class Character {
    public int health;
    public int x,y;
    protected boolean dead;
    int width = 200, height = 200;

    public Character(int health,int x,int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public String getHealth() {
        return String.valueOf(health);
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
