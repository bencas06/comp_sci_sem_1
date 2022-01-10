import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number 1 through 1000");
		int x = sc.nextInt();
		
		Random rand = new Random() ;
		int baka = rand.nextInt(1001);
		
		if (x==baka){
		System.out.println("Lucky guess");
		}
		else if (x!=baka){
		System.out.println("Unlucky guess");
		System.out.println("The correct answer was " + baka);
		}
		
		}
	}	
