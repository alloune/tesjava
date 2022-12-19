package org.example;

public class Calculator {

    public int add(int x, int y){
        return x + y;
    }
    public int minus(int x, int y){
        return x - y;
    }
    public int multiplied(int x, int y){
        return x * y;
    }
    public float divided(float x, float y){
        if(y == 0){
            throw new ArithmeticException("Impossible de diviser par 0 mon Coco");
        }

        return x / y;
    }

}
