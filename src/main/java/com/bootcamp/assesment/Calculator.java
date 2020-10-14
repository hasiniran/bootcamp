package com.bootcamp.assesment;

public class Calculator {

    private int num1;

    public Calculator(int num1){
        this.num1 = num1;
    }

    public int incrementBy(int x){
        return this.num1+x;
    }

}
