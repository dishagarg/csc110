import java.util.Scanner;

public class L3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = sc.next();
		System.out.println("Hi, "+name+"!");
		System.out.print("Enter a natural number: ");
		int number = sc.nextInt();
		if(number%2==0) System.out.println(number+" is an even number.");
		else System.out.println(number+" is an odd number.");
	}

}
