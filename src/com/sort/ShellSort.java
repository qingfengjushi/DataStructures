package com.sort;

public class ShellSort extends StatisticsSort {
	private int[] sortDatas;
	private int h = 1;
	
	public ShellSort(int[] sortDatas) {
		this.sortDatas = sortDatas.clone();
	}
	
	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		int elems = sortDatas.length;
		int outer;
		int inner;
		int temp;
		while (h < elems / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (outer = h; outer < elems; outer++) {
				temp = sortDatas[outer];
				inner = outer;
				while (inner > h - 1 && temp < sortDatas[inner - h]) {
					sortDatas[inner] = sortDatas[inner - h];
					inner -= h;
				}
				sortDatas[inner] = temp;
			}
			h = (h - 1) / 3;
		}
		return sortDatas;
	}

}
