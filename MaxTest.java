package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void intMax() {
        int actualValue = Maximum.testMaximum(77,55,60);
        Assert.assertEquals(77, actualValue);
    }

    @Test
    public void floatMax() {
        float actualValue = Maximum.testMaximum(77f,55f,60f);
        Assert.assertEquals(77,actualValue,0);
    }

    @Test
    public void stringMax() {
        String actualValue = Maximum.testMaximum("USA","INDIA","ROME");
        Assert.assertEquals("INDIA",actualValue);
    }
}


