using System;

namespace Algorithms_and_DataStructions
{
	public class BinarySearch
	{
		public static object bSearch(int[] array, int n){
			int min = 1; int max = array.Length;
			//object res = bSearchIter (array, n, min, max);
			object res = bSearchRec(array, n, min, max);		
			return res;
		}


		public static object bSearchIter(int[] array, int n, int min, int max){
			while (min <= max) {
				int mid = (min + max)/2;
				if (array [mid] == n)
					return mid;
				else if (array [mid] > n)
					max = mid - 1;
				else
					min = mid + 1;
			}
			return "Not Found";
		}

		public static object bSearchRec(int[] array, int n, int min, int max){
			if (min > max)
				return "Not Found";
			else {
				int mid = (min + max)/2;
				if (array [mid] == n)
					return mid;
				else if (array [mid] > n)
					return bSearchRec (array, n, min, mid - 1);
				else
					return bSearchRec(array, n, mid+1, max);
			}
		}
	}
}

