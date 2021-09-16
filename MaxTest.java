package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void intMax1() {
        int actualValue = Maximum.getmaximum(1,5,10);
        Assert.assertEquals(10,actualValue);
    }

    @Test
    public void intMax2() {
        int actualValue = Maximum.getmaximum(77,55,60);
        Assert.assertEquals(77,actualValue);
    }
    @Test
    public void intMax3() {
        int actualValue = Maximum.getmaximum(4657,5405,1746);
        Assert.assertEquals(5405,actualValue);
    }
}

