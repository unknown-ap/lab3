import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  //mytest
  @Test
  public void testReverseInPlaceArray() {
    int[] input1 = {7, 4, 5, 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 5, 4, 7}, input1);
  }

  //mytest
  @Test
  public void testReverseInPlaceArray2() {
    int[] input1 = {4, -1, 5, 5, 0};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{0, 5, 5, -1, 4}, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //mytest
  @Test
  public void testReversedTwo() {
    int[] input1 = {50, 30, 5};
    assertArrayEquals(new int[]{5, 30, 50}, ArrayExamples.reversed(input1));
  }

  //mytest
  @Test
  public void testReversedFive() {
    int[] input1 = {50, 30, 5, 90, 7};
    assertArrayEquals(new int[]{7, 90, 5, 30, 50}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {8, -4, 10, 5.5, 4};
    double av = ArrayExamples.averageWithoutLowest(input);
    assertEquals(6.875, av, .00001);
  }

  @Test
  public void testAverageWithoutLowestTwo() {
    double[] input = {8, -4, 10, 5.5, -10};
    double av = ArrayExamples.averageWithoutLowest(input);
    assertEquals(4.875, av, .00001);
  }

  @Test
  public void testAverageWithoutLowestThree() {
    double[] input = {-5, -5, 10, 6, 4, 10};
    double av = ArrayExamples.averageWithoutLowest(input);
    assertEquals(7.5, av, .01);
  }

}
