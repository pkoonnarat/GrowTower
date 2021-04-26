package com.pondox.growtower;

import android.widget.ImageView;

public class Character {
    public int health;
    private int x,y;

    public Character(int health) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
