package com.sort;

public class QuickSort extends StatisticsSort {
	private int[] arrays;
	
	public QuickSort(int[] arrays) {
		this.arrays = arrays.clone();
	}
	
	private void doSort(int left, int right) {
		if (right - left <= 0) return;
		int partionInt = partion(left, right);
		doSort(left, partionInt - 1);
		doSort(partionInt + 1, right);
	}
	
	private int partion(int left, int right) {
		int leftPtr = left - 1;
		int rightPtr = right;
		int p = this.arrays[right];
		while (true) {
			while (arrays[++leftPtr] < p);
			while (rightPtr > 0 && arrays[--rightPtr] > p);
			if (leftPtr >= rightPtr) break;
			swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
	}
	
	private void swap(int left, int right) {
		int temp = arrays[left];
		arrays[left] = arrays[right];
		arrays[right] = temp;
	}

	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		doSort(0, arrays.length - 1);
		return arrays;
	}
}
