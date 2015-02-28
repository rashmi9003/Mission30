package dataStructures.arrays.sorting;


import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
@Test
public void testHappyCase() {
	int [] arr = {1,4,2,5};
	int [] exp = {1,2,4,5};
	InsertionSort.sort(arr);
	Assert.assertArrayEquals(exp, arr);
}

@Test
public void testEdgeCase() {
	int [] arr = {1};
	int [] exp = {1};
	InsertionSort.sort(arr);
	Assert.assertArrayEquals(exp, arr);
}

@Test
public void testEmptyCase() {
	int [] arr = {};
	int [] exp = {};
	InsertionSort.sort(arr);
	Assert.assertArrayEquals(exp, arr);
}


@Test
public void testNullCase() {
	int [] arr = null;
	int [] exp = null;
	InsertionSort.sort(arr);
	Assert.assertArrayEquals(exp, arr);
}
@Test
public void testDescendingArrayCase() {
	int [] arr = {5,4,3,2,1};
	int [] exp = {1,2,3,4,5};
	InsertionSort.sort(arr);
	Assert.assertArrayEquals(exp, arr);
}
}
