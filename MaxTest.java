package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void intMax1() {
        Float actualValue = Maximum.getmaximum(1.2f,5.7f,10.8f);
        Assert.assertEquals(10.8,actualValue,0);
    }

    @Test
    public void intMax2() {
        Float actualValue = Maximum.getmaximum(77f,55f,60f);
        Assert.assertEquals(77,actualValue,0);
    }
    @Test
    public void intMax3() {
        Float actualValue = Maximum.getmaximum(4657f,5405f,1746f);
        Assert.assertEquals(5405,actualValue,0);
    }
}

