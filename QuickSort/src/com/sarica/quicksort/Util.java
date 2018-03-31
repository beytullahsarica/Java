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
}