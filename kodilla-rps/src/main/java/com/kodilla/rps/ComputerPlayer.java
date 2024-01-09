package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
private Random random = new Random();
    private int point;
    private String name;

    @Override
    public int getPoints() {
        return this.point;
    }

    @Override
    public void addPoint() {
        this.point++;
    }

    @Override
    public char getMove() {
       return (char) ((char) random.nextInt(3)+1);
    }
    @Override
    public void setName(String name) {
    }
}
