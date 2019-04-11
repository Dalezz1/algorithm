package sort;

import java.util.Arrays;

public class insertSort {
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j=i;
			int waitInsert=arr[i];
			while(j>0&&waitInsert<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=waitInsert;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {2134,12,345,3,563};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
