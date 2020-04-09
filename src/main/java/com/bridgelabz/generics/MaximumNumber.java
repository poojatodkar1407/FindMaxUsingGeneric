package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber<T extends Comparable> {
    T number1;
    T number2;
    T number3;

    public MaximumNumber(T number1, T number2, T number3) {
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
    }

    public MaximumNumber() {

    }

    public static <T extends Comparable> T getLargeNumber( T number1,T number2,T number3,T ...option) {
        T max=number1;//4
        if (number2.compareTo(max)>0){//2 4
            max = number2;
        }
        //4
        if (number3.compareTo(max)>0) {//5 4
            max = number3;
        }
        //5
        if(option.length !=0){
            Arrays.sort(option, Collections.reverseOrder());
            if (max.compareTo(option[0])<0){
                max=option[0];
            }
        }
        printMaxNumber(max);
        return max;
    }

    private static <T extends Comparable> void printMaxNumber(T max) {
        System.out.println(max );
    }

    public T getLargeNumber() {
        return getLargeNumber(number1,number2,number3);
    }

}
