package Dynamic_Array;

public class Main {

	public static void main(String[] args) {
		DArray<String> arr = new DArray<>();
		arr.put("Hello");
		arr.put("Kairm");
		arr.put("Batul");
		arr.put("Hanin");
		arr.put("Rola");
		arr.put("Alex");
		arr.put("Gamze");
		System.out.println(arr.getSize());

		for (int i = 0; i < arr.getSize(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
