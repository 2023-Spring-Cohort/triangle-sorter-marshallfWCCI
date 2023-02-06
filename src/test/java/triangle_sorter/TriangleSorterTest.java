package triangle_sorter;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleSorterTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        assertEquals("Equilateral", new TriangleSorter().analyze(3,3,3));
    }
    @Test
    public void test233() {
        assertEquals("Isosceles", new TriangleSorter().analyze(2,3,3));
    }
    @Test
    public void test323() {
        assertEquals("Isosceles", new TriangleSorter().analyze(3,2,3));
    }
    @Test
    public void test332() {
        assertEquals("Isosceles", new TriangleSorter().analyze(3,3,2));
    }
    @Test
    public void test345() {
        assertEquals("Right", new TriangleSorter().analyze(3,4,5));
    }
    @Test
    public void test354() {
        assertEquals("Right", new TriangleSorter().analyze(3,5,4));
    }
    @Test
    public void test543() {
        assertEquals("Right", new TriangleSorter().analyze(5,4,3));
    }
    @Test
    public void test234() {
        assertEquals("Scalene", new TriangleSorter().analyze(2,3,4));
    }
    @Test
    public void test235() {
        assertEquals("Impossible", new TriangleSorter().analyze(2,3,5));
    }
    @Test
    public void test236() {
        assertEquals("Impossible", new TriangleSorter().analyze(2,3,6));
    }

    @Test
    public void testRotations() {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j <= i; j++)
                for (int k = 0; k <= j; k++) {
                    assertEquals(
                            new TriangleSorter().analyze(i, j, k),
                            new TriangleSorter().analyze(k, i, j));
                    assertEquals(
                            new TriangleSorter().analyze(i, j, k),
                            new TriangleSorter().analyze(j, k, i));
                }
    }
}

