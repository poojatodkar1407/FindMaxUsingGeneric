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
    public void givanFloatsMaxNumber_WhenAtThirdPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(10.5f, 15.5f, 20.5f);
        Assert.assertEquals(20.5f,maximumNumber.getLargeNumber());
    }

    @Test
    public void givanFloatsMaxNumber_WhenAtSecondPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(10.0f, 88.5f, 12.4f);
        Assert.assertEquals(88.5f,maximumNumber.getLargeNumber());

    }

    @Test
    public void givanFloatsMaxNumber_WhenAtFirstPosition_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber(44.3f, 22.3f, 11.3f);
        Assert.assertEquals(44.3f,maximumNumber.getLargeNumber());
    }
}
