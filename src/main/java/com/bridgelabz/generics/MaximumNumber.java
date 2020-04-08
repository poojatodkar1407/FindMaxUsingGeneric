package com.bridgelabz.generics;

public class MaximumNumber<T extends Comparable> {
        T number1;
        T number2;
        T number3;

    public MaximumNumber(T number1, T number2, T number3) {
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
    }

    public T getLargeNumber() {
        return getLargeNumber(number1,number2,number3);

    }

    private <T extends Comparable> T getLargeNumber(T number1, T number2, T number3) {
        T max=number1;
        if (number2.compareTo(max)>0){
            max = number2;
        }
        if (number3.compareTo(max)>0) {
            max = number3;
        }
        return max;
        }
}
