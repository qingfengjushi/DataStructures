package com.sort;

public class InsertSort implements Sort {
	private int[] sortDatas;
	
	public InsertSort(int[] sortDatas) {
		this.sortDatas = sortDatas;
	}
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int out;
		int in = 0;
		int temp;
		for (out = 1; out < sortDatas.length; out++) {
			temp = sortDatas[out];
			in = out;
			while (in > 0 && sortDatas[in - 1] > temp) {
				sortDatas[in] = sortDatas[in - 1];
				in--;
			}
			sortDatas[in] = temp;
		}
	}
}
