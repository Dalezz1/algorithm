package sort;

import java.util.Arrays;

public class selectSort {
	public static void main(String[] args) {
		int[] arr= {2345,657,6782,23,123};
		for (int i = 0; i < arr.length-1; i++) {// ���鳤��Ϊn��Ҫ����n-1��
			int k=i;
			for (int j = k+1; j < arr.length; j++) {// ÿһ�������ҳ���Сֵ
				if (arr[j]<arr[k]) {
					k=j;// ��k���±����ҵ�����Сֵ���±�
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
