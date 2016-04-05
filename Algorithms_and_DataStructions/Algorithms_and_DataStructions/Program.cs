using System;

namespace Algorithms_and_DataStructions
{
	class MainClass
	{
		public static void Main(string[] args){

			// BinarySearch
			//int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
			//Console.WriteLine (BinarySearch.bSearch(array, 10));

			IComparable[] array = new IComparable[10];
			Random rd = new Random ();
			for (int i = 0; i < array.Length; i++)
				array [i] = rd.Next (1, 11);
			//Array before sortnig
			foreach (int x in array)
				System.Console.Write (x + " ");
			Console.WriteLine ();


			//MergeSort			
//			array = MergeSort.mergeSort (array);
//			//Array after sorting
//			foreach (int x in array)
//				System.Console.Write (x + " ");


			//QuickSort
			QuickSort.Sort(array);
			foreach (int x in array)
				System.Console.Write (x + " ");




		}

	}


}
