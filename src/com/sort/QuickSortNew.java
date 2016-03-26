package com.sort;

public class QuickSortNew extends StatisticsSort {
	private int[] sortDatas;
	
	public QuickSortNew(int[] sortDatas) {
		this.sortDatas = sortDatas.clone();
	}
	
	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		doSort(0, sortDatas.length - 1);
		return sortDatas;
	}
	
	private void doSort(int left, int right) {
		int size = right - left + 1;
		if (size <= 9) {
			insertSort(left, right);
		} else {
			int middleVal = getPrior(left, right);
			int middle = partIt(left, right, middleVal);
			doSort(left, middle - 1);
			doSort(middle + 1, right);
		}
	}
	
	private int partIt(int left, int right, int middleVal) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			while (sortDatas[++leftPtr] < middleVal);
			while (sortDatas[--rightPtr] > middleVal);
			if (leftPtr >= rightPtr) break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right - 1);
		return leftPtr;
	}
	
	private int getPrior(int left, int right) {
		int center = (left + right) / 2;
		if (sortDatas[left] > sortDatas[right]) {
			swap(left, right);
		}
		if (sortDatas[left] > sortDatas[center]) {
			swap(left, center);
		}
		if (sortDatas[center] > sortDatas[right]) {
			swap(center, right);
		}
		swap(center, right - 1);
		return sortDatas[right - 1];
	}
	
	private void insertSort(int start, int end) {
		for (int i = start; i <= end; i++) {
			int temp = sortDatas[i];
			int out = i;
			while (out > start && sortDatas[out - 1] > temp) {
				sortDatas[out] = sortDatas[out - 1];
				out--;
			}
			sortDatas[out] = temp;
		}
	}
	
	private void swap(int a, int b) {
		int temp = sortDatas[a];
		sortDatas[a] = sortDatas[b];
		sortDatas[b] = temp;
	}
}
