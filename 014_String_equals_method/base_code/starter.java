import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a wizard, warrior, or rogue");
		String name = sc.nextLine();
		String uwu = ("wizard");
		String bakugo = ("warrior");
		String eren = ("rogue");
		
		if (name.equals(uwu)){
		System.out.println("You are a wizard Harry");
		}
		if (name.equals(bakugo)){
		System.out.println("You are a warrior");
		}
		if (name.equals(eren)){
		System.out.println("You are a rogue");
		}
		else if(!name.equals(uwu) && !name.equals(bakugo) && !name.equals(eren))
		System.out.print("Please put a correct input");
		}
		}	
	