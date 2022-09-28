import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(3, Week4.max2Int(1, 3));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(15, Week4.max2Int(15, 12));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(22, Week4.max2Int(19, 22));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(20, Week4.max2Int(1, 20));
    }

    @Test
    public void testMinArray1() {
        int[] a = {1, 2, 3, 4, 6677, 12, 12, 56, 5, 2, 23, 8};
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray2() {
        int[] a = {2, 234, 3, 4, 6677, 12, 12, 56, 5, 26, 23, 8};
        assertEquals(2, Week4.minArray(a));
    }

    @Test
    public void testMinArray3() {
        int[] a = {56, 5, 2, 23, 8};
        assertEquals(2, Week4.minArray(a));
    }

    @Test
    public void testMinArray4() {
        int[] a = {6677, 12, 1};
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray5() {
        int[] a = {1, 2, 3, 4, 6677, 12, 12, 56, 5, 2, 23, 8};
        assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thừa cân", Week4.calculateBMI(65, 1.68));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Béo phì", Week4.calculateBMI(60, 1.5));

    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(65, 1.68));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Thừa cân", Week4.calculateBMI(65, 1.68));

    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Thừa cân", Week4.calculateBMI(65, 1.68));

    }
} 