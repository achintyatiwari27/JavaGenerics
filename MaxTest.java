package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void StringMax1() {
        String  actualValue = Maximum.getmaximum("a","b","c");
        Assert.assertEquals("c",actualValue);
    }

    @Test
    public void StringMax2() {
        String  actualValue = Maximum.getmaximum("USA","INDIA","ROME");
        Assert.assertEquals("INDIA",actualValue);
    }
    @Test
    public void StringMax()  {
        String  actualValue = Maximum.getmaximum("Table","Chair","Laptop");
        Assert.assertEquals("Table",actualValue);
    }
}


