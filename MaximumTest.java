package JavaGenerics;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void floatMax() {
        float assertValue = Maximum.getmaximum(20f,40f,10f);

        Assert.assertEquals(40,assertValue,0);
    }
    public void stringMax() {
        String assertValue = Maximum.getmaximum("abc","def","ghi");
        Assert.assertEquals("ghi",assertValue);
    }
    public void intMax() {
        int assertValue = Maximum.getmaximum(20,40,10);
        Assert.assertEquals(40,assertValue);
    }
}
