package com.example.calculatorandroiddev;


public class CalculaterBackEnd {
     public double result;
    public double addItems(int input1, int input2 ){

        this.result = input1 + input2;
        return this.result;

    }
    public double subtractItems(int input1, int  input2){
        this.result = input1 - input2;
        return  this.result;
    }
    public double multiplyItems(int input1, int  input2){
        this.result = input1 * input2;
        return  this.result;
    }
    public double divideItems(int input1, int  input2){
        this.result = input1 / input2;
        return  this.result;
    }
    public double squareRootItems(int input1){
        this.result = Math.sqrt(input1);
        return  this.result;
    }
}

