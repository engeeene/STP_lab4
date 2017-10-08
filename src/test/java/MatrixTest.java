import lab2.*;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class MatrixTest {
    private Matrix matrix = new Matrix(new int[][] {{10, 31, 1, 3}, {8, 10, 13, 18}, {9, 7, 15, 19}, {11, 21, 14, 5}});
    private int[][] binMatrix = new int[][] {{0, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}};

    @Test
    public void testRowSums() {
        int[] res = matrix.rowSums();
        Assert.assertEquals("Above sum test", 63, res[0]);
        Assert.assertEquals("On sum test", 40, res[1]);
        Assert.assertEquals("Below sum test", 29, res[2]);
    }

    @Test
    public void testBinariMatrix() {
        int[][] res = matrix.binariMatrix();
        for (int i=0; i < matrix.getN(); i++) {
            Assert.assertArrayEquals("row " + i + " test", res[i], binMatrix[i]);
        }
    }
}
