package sort;

import java.util.Arrays;

public class selectSort {
	public static void main(String[] args) {
		int[] arr= {2345,657,6782,23,123};
		for (int i = 0; i < arr.length-1; i++) {// 数组长度为n需要排序n-1趟
			int k=i;
			for (int j = k+1; j < arr.length; j++) {// 每一趟排序找出最小值
				if (arr[j]<arr[k]) {
					k=j;// 用k记下本趟找到的最小值的下标
				}
			}
			if (i !=k) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
