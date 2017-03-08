
public class L3Q2 {

	public static void main(String[] args) {
		String student1 = "V00123456";
		String student2 = new String("V00123456");
		String student3 = new String("V00234567");
		System.out.println(student1==student2);
		System.out.println(student1==student3);
		System.out.println(student2==student3);
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student2.equals(student3));
		System.out.println(student1.compareTo(student2));
		System.out.println(student2.compareTo(student3));
		System.out.println(student1.compareTo(student3));
		System.out.println(student1.length());
		System.out.println(student1.charAt(0));
		student1 = "v00123456";
		System.out.println(student1.equals(student2));
		System.out.println(student1.equalsIgnoreCase(student2));
		
	}
}
