package com.lepus.dnf.comm;

public class ArrayUtils {

	public static int search(int[] arr, int key) {
		if (arr == null || arr.length == 0)
			return -1;
		int find = -1;
		for (int i = 0, len = arr.length; i < len; i++) {
			if (arr[i] == key) {
				find = i;
				break;
			}
		}
		return find;
	}

}
