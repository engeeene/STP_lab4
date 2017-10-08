import lab2.*;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ArrayTest {
    private Array arr = new Array(new int[] {0, 10, 56, -65, 41, 8, -10});

    @Test
    public void testMeanOfPairedArrayElements() {
        double mean = arr.geometricMeanOfPairedArrayElements();
        Assert.assertEquals("Mean test", 3.0540758099773514046388328820575, mean, 0.000001);
    }

    @Test
    public void testMaxModuleElement() {
        int max = arr.maxModuleElement();
        Assert.assertEquals("MaxModule test", 65, max);
    }

    @Test
    public void testMaxPairedElement() {
        int max = arr.maxPairedElement();
        Assert.assertEquals("MaxPaired test", 56, max);
    }

    @Test
    public void testMinModuleElement() {
        int min = arr.minModuleElement();
        Assert.assertEquals("MinModule test", 0, min);
    }

    @Test
    public void testSumOfFirst() {
        int max = arr.sumOfFirst(3);
        Assert.assertEquals("SumOf3 test", 66, max);
    }
}
