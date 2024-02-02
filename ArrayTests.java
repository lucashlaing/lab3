import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3,5,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,5,3 }, input1);
	}
  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 3124,3,9,1234 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1234,9,3,3124 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed2() {
    int[] input1 = {3,6,1 };
    assertArrayEquals(new int[]{1, 6, 3 }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed3() {
    int[] input1 = {7,123 ,3 ,9 };
    assertArrayEquals(new int[]{ 9, 3, 123, 7}, ArrayExamples.reversed(input1));
  }
}
