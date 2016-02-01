package com.sort;

public class MergeSort implements Sort {
	private int[] sortDatas;
	private int[] workspace;
	
	public MergeSort(int[] sortDatas) {
		this.sortDatas = sortDatas;
		workspace = new int[sortDatas.length];
	}
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		doSort(0, sortDatas.length - 1);
	}
	
	private void doSort(int lower, int higher) {
		if (lower == higher) return;
		int mid = (lower + higher) / 2;
		doSort(lower, mid);
		doSort(mid + 1, higher);
		merge(lower, mid, higher);
	}
	
	private void merge(int lower, int mid, int higher) {
		int m = mid + 1;
		int j = 0;
		int count = higher - lower;
		int lowBound = lower;
				
		while (lower <= mid && m <= higher) {
			if (sortDatas[lower] > sortDatas[m]) {
				workspace[j++] =  sortDatas[m++];
			} else {
				workspace[j++] =  sortDatas[lower++];
			}
		}
		while (lower <= mid) {
			workspace[j++] = sortDatas[lower++];
		}
		while (m <= higher) {
			workspace[j++] =  sortDatas[m++];
		}
		for (j = 0; j <= count; j++) {
			sortDatas[lowBound + j] = workspace[j];
		}
	}
}
