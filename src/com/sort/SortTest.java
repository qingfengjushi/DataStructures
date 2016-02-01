package com.sort;

public class SortTest {
	public static void main(String[] args) {
		int[] sortDatas = new int[] {8, 2, 1, 5, 7, 10};
		Sort sort = new MergeSort(sortDatas);
		sort.sort();
		String out = "";
		for (int data : sortDatas) {
			out += data + ",";
		}
		System.out.println(out.substring(0, out.length() - 1));
	}
}
