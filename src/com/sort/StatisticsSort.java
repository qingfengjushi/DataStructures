package com.sort;

import java.util.Date;

public abstract class StatisticsSort implements Sort {
	public void statisticsSort(String type, boolean isPrint) {
		Date lastDate = new Date();
		int[] sortDatas = sort();
		Date currentDate = new Date();
		System.out.println(type + " Spent time: " + (currentDate.getTime() - lastDate.getTime()) + "ms");
		if (isPrint) {
			printDatas(type, sortDatas);
		}
	}
	
	private void printDatas(String type, int[] sortDatas) {
		String out = "";
		for (int data : sortDatas) {
			out += data + ",";
		}
		System.out.println(type + "打印排序后数组：" + out);
	}
}
