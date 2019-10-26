package com.example.calculatorandroiddev;


import android.view.View;
import android.widget.Button;

class CalculaterBackEnd {

    public double result;

    public double addItems(double input1, double input2 ){

        this.result = input1 + input2;
        return this.result;

    }
    public double subtractItems(double input1, double input2){
        this.result = input1 - input2;
        return  this.result;
    }
    public double multiplyItems(double input1, double input2){
        this.result = input1 * input2;
        return  this.result;
    }
    public double divideItems(double input1, double input2){
        this.result = input1 / input2;
        return  this.result;
    }
    public double squareRootItems(double input1){
        this.result = Math.sqrt(input1);
        return  this.result;
    }
}

