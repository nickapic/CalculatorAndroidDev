package com.example.calculatorandroiddev;



class CalculatorBackEnd {

    public  static double result;

    public  static double addItems(double input1, double input2 ){

        result = input1 + input2;
        return result;

    }
    public static double subtractItems(double input1, double input2){
        result = input1 - input2;
        return  result;
    }
    public static double multiplyItems(double input1, double input2){
        result = input1 * input2;
        return  result;
    }
    public static double divideItems(double input1, double input2){
        result = input1 / input2;
        return  result;
    }
    public static double squareRootItems(double input1){
        result = Math.sqrt(input1);
        return  result;
    }
}

