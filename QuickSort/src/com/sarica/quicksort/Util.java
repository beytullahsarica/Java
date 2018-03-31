package com.sarica.quicksort;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {

	private static Util instance = null;

	public static Util getInstance() {
		if (null == instance) {
			instance = new Util();
		}
		return instance;
	}

	public <T> T[] concatAllArrays(T[] first, T[]... rest) {
		int totalLength = first.length;
		for (T[] array : rest) {
			totalLength += array.length;
		}
		T[] result = Arrays.copyOf(first, totalLength);
		int offset = first.length;
		for (T[] array : rest) {
			System.arraycopy(array, 0, result, offset, array.length);
			offset += array.length;
		}
		return result;
	}

	public <C, T extends C> C[] toArray(Class<C> componentType, List<T> list) {
		@SuppressWarnings("unchecked")
		C[] array = (C[]) Array.newInstance(componentType, list.size());
		return list.toArray(array);
	}

	public int[] generateRandomIntArray(int size) {
		int[] a = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {

			a[i] = random.nextInt();
		}
		return a;
	}

	public void verifyArrayIsInNondecreasingOrder(Integer[] array) {
		int lastValue = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			System.out.println("before last value: " + lastValue);
			if (array[i] < lastValue) {
				System.out.println("hatalı deper: " + array[i]);
			//	fail("Array element " + i + " is not in order. Value: " + array[i] + " last value was: " + lastValue);
			}

			lastValue = array[i];
		}
		System.out.println("after last value: " + lastValue);
	}

	public Integer[] removeNegativeNumbers(Integer[] num) {
		int k = 0;
		List<Integer> retVal = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				num[k++] = num[i];
				retVal.add(num[i]);
			}
		}
		return toArray(Integer.class, retVal);
	}
}
