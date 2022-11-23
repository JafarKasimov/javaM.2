package com.company;

public class One {

    private int hp;
    private String four;
    private String five;
    private Gus gus;
    private ColorOfGus colorOfGus;

    public One(int hp, String four, String five, Gus gus, ColorOfGus colorOfGus) {
        this.hp = hp;
        this.four = four;
        this.five = five;
        this.gus = gus;
        this.colorOfGus = colorOfGus;
    }

    public Gus getGus() {
        return gus;
    }

    public ColorOfGus getColorOfGus() {
        return colorOfGus;
    }

    public int getHp() {
        return hp;
    }

    public String getFour() {
        return four;
    }

    public String getFive() {
        return five;
    }
}