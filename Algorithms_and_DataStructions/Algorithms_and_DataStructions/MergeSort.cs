using System;
using System.Linq;

namespace Algorithms_and_DataStructions
{
	public class MergeSort
	{
		public static IComparable[] mergeSort(IComparable[] array){
			if (array.Length == 1)
				return array;
			int mid = array.Length / 2;
			return Merge (mergeSort (array.Take (mid).ToArray ()), mergeSort (array.Skip (mid).ToArray ()));
		}

		static IComparable[] Merge(IComparable[] array1, IComparable[] array2){
			int a = 0, b = 0;
			IComparable[] merged = new IComparable[array1.Length + array2.Length];

			for (int i = 0; i < array1.Length + array2.Length; i++) {
				if (b.CompareTo (array2.Length) < 0 && a.CompareTo (array1.Length) < 0) 
					if (array1 [a].CompareTo (array2 [b]) > 0)
						merged [i] = array2 [b++];
					else
						merged [i] = array1 [a++];
				 else 
					if (b < array2.Length)
						merged [i] = array2 [b++];
					else
						merged [i] = array1 [a++];
								
			}
			return merged;
		}		
	}
}

