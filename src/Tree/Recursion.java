package Tree;

public class Recursion {

	public int calculateFactiral(int num) {

		if (num == 0) {
			return 1;

		} else if (num > 0) {

			return num * calculateFactiral(num - 1);
		}

		return 0;
	}

	public static void main(String[] args) {

		Recursion recursion = new Recursion();

		System.out.println(recursion.calculateFactiral(5));
		System.out.println(recursion.calculateFactiral(6));
		System.out.println(recursion.calculateFactiral(7));
		System.out.println(recursion.calculateFactiral(8));

	}

}
