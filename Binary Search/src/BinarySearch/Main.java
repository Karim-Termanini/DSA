package BinarySearch;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 170, 110, 30, 40, 120, 20, 60, 130, 10, 3, 65, 23 };

		System.out.println("Original Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("\n");
		System.out.println("Sorted Array: ");
		sorting(arr);
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println("\n");
		System.out.println(binarySearch(arr, 40));
	}

	public static void sorting(int[] arr) {
		int temp;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (arr[i] >= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static int binarySearch(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == value) {
				System.out.println("The Element " + arr[mid] + " is in index: ");
				return mid;
			} else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;
	}
}
