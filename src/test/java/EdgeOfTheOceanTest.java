import org.junit.Assert;
import org.junit.Test;

public class EdgeOfTheOceanTest {

    @Test
    public void adjacentElementsProductTest() {
        EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();
        int[] matrix = {-23, 4, -3, 8, -12};
        Assert.assertEquals(-12, edgeOfTheOcean.adjacentElementsProduct(matrix));
    }

    @Test
    public void shapeAreaTest() {
        EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();
        Assert.assertEquals(41, edgeOfTheOcean.shapeArea(5));
    }

    @Test
    public void makeArrayConsecutiveTest() {
        EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();
        int[] matrix = {6, 3};
        Assert.assertEquals(2, edgeOfTheOcean.makeArrayConsecutive2(matrix));
    }

    @Test
    public void almostIncreasingSequence() {
        EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();
        int[] matrix = {5384, 12, 34, 54, 48};
        Assert.assertFalse(edgeOfTheOcean.almostIncreasingSequence(matrix));
    }

    @Test
    public void matrixElementsSum() {
        EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();
        int[][] matrix = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Assert.assertEquals(18, edgeOfTheOcean.matrixElementsSum(matrix));

    }
}