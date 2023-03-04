package com.bendmaryland.learnspringframework.game;

public class PacManGame implements  GamingConsole{
    public void up() {
        System.out.println("go up ");
    }

    public void down() {
        System.out.println("go down");
    }

    public void left() {
        System.out.println("Flee");
    }

    public void right() {
        System.out.println("Wompa Wompa ");
    }
}
