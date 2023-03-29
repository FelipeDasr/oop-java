class Arrays {
	
	public int[] arr;
	
	public Arrays(int size) {
		this.arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			this.arr[i] = -1;
		}
	}
	
	public Arrays(int size, int value) {
		this.arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			this.arr[i] = value;
		}
	}
	
	public void resetaArray() {
		for(int i = 0; i < this.arr.length; i++) {
			this.arr[i] = 0;
		}
	}
	
	public int somaValores() {
		int total = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			total += this.arr[i];
		}
		
		return total;
	}
}

public class Main {
	public static void main(String[] args) {
		Arrays arr = new Arrays(10, 2);
		System.out.println(arr.somaValores());
	}
}