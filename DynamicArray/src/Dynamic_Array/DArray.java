package Dynamic_Array;

import java.util.Arrays;

public class DArray<T> {
	Object[] arr;
	int size;

	public DArray() {
		size = 0;
		arr = new Object[1];
	}

	public T get(int index) {
		return (T) arr[index];
	}

	public int getSize() {
		return arr.length;
	}

	public void put(Object element) {
		ensurCapacity(size + 1);
		arr[size++] = element;
	}

	public void ensurCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity + 1;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			arr = Arrays.copyOf(arr, newCapacity);
		}
	}
}
