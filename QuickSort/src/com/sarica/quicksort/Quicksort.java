package com.sarica.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {

	public static Integer[] sort(Integer[] arr) {
		int len = arr.length;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> middle = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		int midVal = len / 2;
		if (len < 1) {
			return arr;
		}
		int pivot = arr[midVal];
		for (int i = 0; i < len; i++) {
			if (arr[i] < pivot) {// less
				left.add(arr[i]);
			} else if (arr[i] > pivot) {// greater
				right.add(arr[i]);
			} else {// equal
				middle.add(arr[i]);
			}
		}
		Integer[] leftFinal = Util.getInstance().toArray(Integer.class, left);
		Integer[] rightFinal = Util.getInstance().toArray(Integer.class, right);
		Integer[] middleFinal = Util.getInstance().toArray(Integer.class, middle);
		Integer[] retVal = Util.getInstance().concatAllArrays(sort(leftFinal), middleFinal, sort(rightFinal));
		return retVal;
	}

	public static void main(String[] args) {
		// Integer[] arr = { 3, 6, 8, 10, 1, 2, 1};
		Integer[] arr = { 3, 6, 8, 10, 1, 2, 1, 78, 343, 23, 234, 23, 6, 9 };
		System.out.println(Arrays.toString(Quicksort.sort(arr)));
	}

}