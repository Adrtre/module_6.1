package com.kodilla.rps;

public class HumanPlayer implements Player{
private String name;
    private int point ;
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
        return IOInterface.getPlayerMove();
    }

    public void setName (String name){
        this.name= name;
    }

}
