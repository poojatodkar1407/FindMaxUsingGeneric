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

}
