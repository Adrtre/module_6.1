package com.kodilla.exception.io;

public class WeAreAPower {

    public static int calculatePower(int base , int exponet){
        int result = 1 ;
        if (base == 0) {
            return result = 1;
        }
        for ( int i = 0 ; i < exponet ; i ++){
            result = result * base;
        }
        return result;
    }


    public static void main(String[] args){

        int ressult1 = calculatePower(1 , 0);
        System.out.println(ressult1);
        int ressult2 = calculatePower(2 , 2);
        System.out.println(ressult2);
        int ressult3 = calculatePower(4 , 2);
        System.out.println(ressult3);
        int ressult4= calculatePower(8 , 2);
        System.out.println(ressult4);
    }


}
