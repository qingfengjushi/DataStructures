package com.sort;

public class ArrayPar {
	private int[] array;
	
	public ArrayPar(int[] array) {
		this.array = array;
	}
	
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		
		while (true) {
			while (leftPtr < right && array[++leftPtr] < pivot);
			while (rightPtr > left && array[--rightPtr] > pivot);
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		return leftPtr;
	}
	
	private void swap(int left, int right) {
		int temp;
		temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {10, 8, 9, 22, 7, 6, 3, 33, 19, 18, 17} ;
		ArrayPar arrayPar = new ArrayPar(a);
		int index = arrayPar.partitionIt(0, a.length - 1, 20);
		for (int i : a) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.print("·Ö¸ôË÷Òý£º" + index);
	}
}
