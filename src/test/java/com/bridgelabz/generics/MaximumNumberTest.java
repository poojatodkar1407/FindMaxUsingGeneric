package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(95, 75, 45);
        Assert.assertEquals(95,maximumNumber.getLargeNumber());
    }

    @Test
    public void givanIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(10, 50, 30);
        Assert.assertEquals(50,maximumNumber.getLargeNumber());
    }

    @Test
    public void givanIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(60, 28, 91);
        Assert.assertEquals(91,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenFloatsMaxNumber_WhenAtThirdPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(10.5f, 15.5f, 20.5f);
        Assert.assertEquals(20.5f,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenFloatsMaxNumber_WhenAtSecondPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(10.0f, 88.5f, 12.4f);
        Assert.assertEquals(88.5f,maximumNumber.getLargeNumber());

    }

    @Test
    public void givenFloatsMaxNumber_WhenAtFirstPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(44.3f, 22.3f, 11.3f);
        Assert.assertEquals(44.3f,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenAtThirdPosition_ShouldReturnFirstString() {
        MaximumNumber maximumNumber = new MaximumNumber("Ajay","Shyam","Yogesh");
        Assert.assertEquals("Yogesh",maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenAtSecondPosition_ShouldReturnFirstString() {
        MaximumNumber maximumNumber = new MaximumNumber("Ram","Vishal","Chetan");
        Assert.assertEquals("Vishal",maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenAtFirstPosition_ShouldReturnFirstString() {
        MaximumNumber maximumNumber = new MaximumNumber("Tushar","Aman","Bhushan");
        Assert.assertEquals("Tushar",maximumNumber.getLargeNumber());
    }

    @Test
    public void givenMultipleIntegers_WhenIntegersIsMax_ShouldReturnMaxInteger() {
        Assert.assertSame(8,MaximumNumber.getLargeNumber(6,5,3,7,8));
    }

    @Test
    public void givenMultipleFloats_WhenFloatsIsMax_ShouldReturnMaxFloats() {
        Assert.assertSame(5.9f,MaximumNumber.getLargeNumber(1.2f,2.1f,4.2f,5.9f,4.4f));
    }

    @Test
    public void givenMultipleStrings_WhenStringIsMax_ShouldReturnMaxString() {
        Assert.assertSame("Vijay",MaximumNumber.getLargeNumber("Baban","Prince","Dinesh","Sachin","Vijay"));
    }
}
