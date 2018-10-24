package asgn03;

import static org.junit.Assert.*;
import org.junit.Test;

public class Arrays_TESTS {
	
	//Tests of Sum Method

	@Test
	// assert that Arrays.sum returns 15 when passed 4 5 6
	//covers cases in which no numbers repeat, none are 0, all are positive, and the numbers are in order. Most Regular Case
	public void ListOf456ReturnsSum15() {
		int[] arr = { 4, 5, 6 };
		assertEquals(15, Arrays.sum(arr));
	}
	
	@Test
	//assert that Arrays.sum returns 1 when passed -3 2 1
	//this test will see if method behaves properly when passed negative number
	public void ListofNeg321ReturnsSum1() {
		int [] arr = {-3, 2, 2};
		assertEquals(1, Arrays.sum(arr));
	}
	
	@Test(expected=EmptyArrayNoNumbers.class)
	//assert that Arrays.sum throws emptyarray excpetion when empty array is passed
	
	public void SumOfEmptThrowsException() {
		int[] arr = {};
		Arrays.sum(arr);
	}
	

	//Tests of Max method
	
	@Test
	// assert that Arrays.max returns 6 when we pass it 4 5 6
	public void ListOf456ReturnsMax6() {
		int[] arr = { 4, 5, 6 };

		assertEquals(6, Arrays.max(arr));
	}
	
	@Test
	//asserts that method can select correct max even when there is a negative int with a greater absolute value than pos int
	public void ListOfNeg645ReturnsMax5(){
	int [] arr = {-6, 4,5};
	assertEquals(5, Arrays.max(arr));
	}
	
	@Test
	//asserts that Max returns greatest num even when array is not in ascending order
	public void ListOf645ReturnsMax6() {
		int[] arr = { 4, 5, 6 };

		assertEquals(6, Arrays.max(arr));
	}
	
	//Tests of Min Method

	@Test
	// assert that Arrays.min returns 4 when passed 4 5 6
	public void ListOf456ReturnsMin4() {
		int[] arr = { 4, 5, 6 };
		assertEquals(4, Arrays.min(arr));
	}
	
	@Test (expected=EmptyArrayNoNumbers.class)
	//make sure an exception is thrown when empty array is passed
	public void EmptyThrowsExceptionNoMin() {
		int[] arr = {};
		Arrays.min(arr);
	}
	
	//assert that Arrays.min returns correct minimum 
	//this case will pass a neg int with an absolute value greater than pos.
	@Test
	public void ListOf4Neg5ReurnsMinNeg5() {
		int[] arr = {4, -5};
		assertEquals(-5,Arrays.min(arr));
	}
	
	
	
	//Tests of Range method
	
	@Test
	// assert that Arrays.range returns 3 when passed 4 5 6
	public void ListOf456ReturnsRange3() {
		int[] arr = { 4, 5, 6 };
		assertEquals(3, Arrays.range(arr));
	}
	
	@Test
	//assert that range returns correct range even when all numbers are negative
	public void ListOfNeg4Neg5Neg6ReturnsRange3() {
		int [] arr = {-4, -5, -6};
		assertEquals(3, Arrays.range(arr));
	}
	
	@Test
	//assert that when a single number is passed in the range is one
	public void ListOf4ReturnsRange1() {
		int [] arr = {4};
		assertEquals(1, Arrays.range(arr));
		
	}
}
