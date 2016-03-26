package com.sort;

public class SortTest {
	public static void main(String[] args) {
		StatisticsSort sort;
		int[] sortDatas;
		// 选择排序
		sortDatas = getSortDatas();
		sort = new InsertSort(sortDatas);
		sort.statisticsSort("选择排序", true);
		
		// 归并排序
		sort = new MergeSort(sortDatas);
		sort.statisticsSort("归并排序", false);
		
		// 希尔排序
		sort = new ShellSort(sortDatas);
		sort.statisticsSort("希尔排序", false);
		
		// 快速排序
		sort = new QuickSort(sortDatas);
		sort.statisticsSort("快速排序", false);
		
		// 快速排序（中枢优化）
		sort = new QuickSortNew(sortDatas);
		sort.statisticsSort("快速排序（中枢优化）", true);
	}
	
	private static int[] getSortDatas() {
		int sortDatas[] = new int[5000];
		for (int i = 0; i < 5000; i++) {
			sortDatas[i] = (int) (Math.random() * 50000);
		}
		return sortDatas;
	}
}
