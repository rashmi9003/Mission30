package dataStructures.arrays.sorting;

public class InsertionSort {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[i] ) {
					swap(arr,i,j);
				}
			}
		}
		return arr;
		
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;		
	}
}
