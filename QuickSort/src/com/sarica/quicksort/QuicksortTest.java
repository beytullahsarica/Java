package com.sarica.quicksort;

import java.util.Arrays;

public class QuicksortTest {
	public static void main(String[] args) {
		Integer[] t1 = { 3, 6, 8, 10, 1, 2, 1 };
		Integer[] t2 = { 3, 6, 8, 10, 1, 2, 1, 78, 343, 23, 234, 23, 6, 9 };
		Integer[] t3 = { 63, 1025, 652, 10, 1, 20, 1, 1, 40, 63, 240, 78, 343, 23, 234, 23, 6, 9 };
		System.out.println(Arrays.toString(Quicksort.sort(t1)));
		System.out.println(Arrays.toString(Quicksort.sort(t2)));
		System.out.println(Arrays.toString(Quicksort.sort(t3)));
	}
}
