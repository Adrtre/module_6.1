package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new MyException("test 1 ");
        }
        return "Done!";
    }


}