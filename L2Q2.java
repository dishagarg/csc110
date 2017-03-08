
public class L2Q2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int k = 3; k > i; k--) {
				System.out.print(" ");

			}
			for (int j = 0; j <= 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
