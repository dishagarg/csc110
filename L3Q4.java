
public class L3Q4 {
	static int n = 10; // class-level variable
	//static int n;

	public static void main(String[] args) {
		// int n = 6;
		System.out.println(isEven(n));
		System.out.println("\nInside main: " + n);
	}

	static boolean isEven(int n) {
		// n = 3; // local variable
		System.out.println("Inside method: " + n);
		if (n % 2 == 0)
			return true;
		return false;
	}
}
