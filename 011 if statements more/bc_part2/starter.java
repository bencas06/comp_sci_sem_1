import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please inout your first number");
	
		int x = sc.nextInt();
		
		System.out.println("Please input your second number");
		int y = sc.nextInt();
		
		System.out.println("Please input your last number");
		int z = sc.nextInt();
		if((x>y)&&(x>z))
		{
		System.out.println("Your first number is the largest");
		}
		if((y>x)&&(y>z))
		{
		System.out.println("Your second number is the largest");
		}
		if((z>y)&&(z>x))
		{
		System.out.println("Your third number is the largest");
		}
		if((x<y)&&(x<z))
		{
		System.out.println("Your first number is the smallest");
		}
		if((x>y)&&(x>z))
		{
		System.out.println("Your second number is the smallest");
		}
		if((y<x)&&(y<z))
		{
		System.out.println("Your third number is the smallest");
		}
		
		
	}
}
