package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void givenValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        int actualResult = Maximum.testMaximum(1, 6, 2);
        Assert.assertEquals(6, actualResult);
    }

    @Test
    public void givenValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        int actualResult = Maximum.testMaximum(50, 57, 78);
        Assert.assertEquals(78, actualResult);
    }

    @Test
    public void givenValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        int actualResult = Maximum.testMaximum(7821,4567, 2222);
        Assert.assertEquals(7821, actualResult);
    }
    @Test
    public void givenValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        int actualResult = Maximum.testMaximum(1, 6, 50, 57, 78,7821,4567, 2222);
        Assert.assertEquals(7821, actualResult);
    }
    @Test
    public void givenfloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        float actualResult = Maximum.testMaximum(2.2f, 1.1f, 2.8f);
        Assert.assertEquals(2.8, actualResult ,0);
    }

    @Test
    public void givenfloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        float actualResult = Maximum.testMaximum(56.9f, 88.1f, 64.9F);
        Assert.assertEquals(88.1, actualResult,0);
    }

    @Test
    public void givenflaotValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        float actualResult = Maximum.testMaximum(675.3f, 555.1f,123.5f);
        Assert.assertEquals(675.3f, actualResult,0);
    }

    @Test
    public void givenfloatValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        float actualResult = Maximum.testMaximum(2.2f, 1.1f, 2.8f,56.9f, 88.1f, 64.9f, 675.3f, 555.1f,123.5f);
        Assert.assertEquals(675.3f, actualResult,0);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        String actualResult = Maximum.testMaximum("He", "And", "That");
        Assert.assertEquals("That", actualResult);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        String  actualResult = Maximum.testMaximum("USA", "INDIA", "ROME");
        Assert.assertEquals("INDIA", actualResult);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        String actualResult = Maximum.testMaximum("Laptop", "Computer", "Mouse");
        Assert.assertEquals("Computer", actualResult);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        String actualResult = Maximum.testMaximum("He", "And", "That", "USA", "INDIA", "ROME","Laptop", "Computer");
        Assert.assertEquals("Computer", actualResult);
    }
}





