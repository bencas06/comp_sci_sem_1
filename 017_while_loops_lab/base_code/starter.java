import java.util.Scanner;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times would you like to print it");
	int amt = sc.nextInt();
	while(amt>0){
		System.out.println(name);
		amt = amt-1;
	}
	
	


		
	}
}
