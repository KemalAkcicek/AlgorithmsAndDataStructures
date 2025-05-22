package SortingAlgorithms;

import SortingAlgorithmQuestions.KClosestPointToOrigin;

public class SortingAlgorithmsTest {

	public static void main(String[] args) {

		/*
		 * SelectionSort selectionSort = new SelectionSort();
		 * 
		 * int array[] = { 10, 3, 5, 7, 11, 8 };
		 * 
		 * selectionSort.selectionSort(array);
		 */

		KClosestPointToOrigin kClosestPointToOrigin = new KClosestPointToOrigin();

		int points[][] = { { 3, 3 }, { -2, 4 } };

		System.out.println(kClosestPointToOrigin.kClosest(points, 1));
	}

}
