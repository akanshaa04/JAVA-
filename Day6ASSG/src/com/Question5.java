package com;

import java.util.Arrays;

public class Question5 {

	
	public int getSecondSmallest(int arr[]) {
		
		Arrays.sort(arr);
		
		return arr[arr.length - 2 ];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9,7,2,8,4,1,5};
		Question5 q = new Question5();
		System.out.print(q.getSecondSmallest(arr));
	}

}
