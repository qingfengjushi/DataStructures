package com.sort;

public class SortTest {
	public static void main(String[] args) {
		StatisticsSort sort;
		int[] sortDatas;
		// ѡ������
		sortDatas = getSortDatas();
		sort = new InsertSort(sortDatas);
		sort.statisticsSort("ѡ������", true);
		
		// �鲢����
		sort = new MergeSort(sortDatas);
		sort.statisticsSort("�鲢����", false);
		
		// ϣ������
		sort = new ShellSort(sortDatas);
		sort.statisticsSort("ϣ������", false);
		
		// ��������
		sort = new QuickSort(sortDatas);
		sort.statisticsSort("��������", false);
		
		// �������������Ż���
		sort = new QuickSortNew(sortDatas);
		sort.statisticsSort("�������������Ż���", true);
	}
	
	private static int[] getSortDatas() {
		int sortDatas[] = new int[5000];
		for (int i = 0; i < 5000; i++) {
			sortDatas[i] = (int) (Math.random() * 50000);
		}
		return sortDatas;
	}
}
