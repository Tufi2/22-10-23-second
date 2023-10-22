package practice1;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };

		// int[] arr1 = { 12, 11, 13, 5, 6, 7,6 };

		// System.out.println("updated array array:");
		// printArray(arr1);

		System.out.println("Original array:");
		printArray(arr);

		mergeSort(arr);

		System.out.println("\nSorted array:");
		printArray(arr);
	}

	public static void mergeSort(int[] arr) {
		int n = arr.length;

		if (n > 1) {
			int mid = n / 2;
			int[] left = new int[mid];
			int[] right = new int[n - mid];

			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}
			for (int i = mid; i < n; i++) {
				right[i - mid] = arr[i];
			}

			mergeSort(left);
			mergeSort(right);

			merge(arr, left, right);
		}
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;

		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
//to commit