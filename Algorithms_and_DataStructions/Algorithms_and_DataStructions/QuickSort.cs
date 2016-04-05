using System;

namespace Algorithms_and_DataStructions
{
	public class QuickSort
	{
		public static void Sort(IComparable[] array){
			int left = 0, right = array.Length - 1;
			quickSort (array, left, right);		
		}

		static void quickSort(IComparable[] array, int left, int right){
			int i = left, j = right;
			IComparable mid = array [(left + right) / 2];

			while (i <= j) {
				while (array [i].CompareTo (mid) < 0)
					i++;
				while (array [j].CompareTo (mid) > 0)
					j--;

				if (i <= j) {
					IComparable tmp = array [i];
					array [i] = array [j];
					array [j] = tmp;
					i++;
					j--;
				}
			}

			if (left < j)
				quickSort (array, left, j);
			if (i < right)
				quickSort (array, i, right);
		}
	}
}

