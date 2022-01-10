import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// statements execute only
		// if boolean is true
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your first number");
		int x = sc.nextInt();
		
		System.out.println("Please input your second number");
		int y = sc.nextInt();
		
		if (x!=y) {
			System.out.println("These integers are not the same");
			
		}
	}
}
//statement execute always