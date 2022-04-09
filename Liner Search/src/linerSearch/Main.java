package linerSearch;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 54, 23, 22, 76 };
		System.out.println(linerSearch(arr, 1));
	}

	public static int linerSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
