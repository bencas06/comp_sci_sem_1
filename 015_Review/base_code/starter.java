import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String boi = sc.nextLine();
		
		System.out.println("What is your title");
		String boi2 = sc.nextLine();
	
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
		else if(!name.equals(uwu) && !name.equals(bakugo) && !name.equals(eren)){
		System.out.print("Please put a correct input");
		}
		
		int points=(25);
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int strength = (0);
		
		while(true){
		System.out.println("strength 1-10");
		strength = sc.nextInt();
		if(strength > 10 || points-strength<0){
			System.out.println("You don't have enough points, choose again");
		}
		else{points = points-strength;
			break;
		}
		}
		
		int dexterity = (0);
		
		while(true){
		System.out.println("dexterity 1-10");
		dexterity = sc.nextInt();
		if(dexterity > 10 || points-strength<0){
			System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-dexterity;
			break;
		}
		}
		
		int intelligence = (0);
		
		while(true){
		System.out.println("intelligence 1-10");
		intelligence = sc.nextInt();
		if(intelligence > 10 || points-intelligence<0){
			System.out.println("You don't have enough points, choose again");
		}
		else{points = points-intelligence;
			break;
		}
		}
		
		int constitution = (0);
		
		while(true){
		System.out.println("constitution 1-10");
		constitution = sc.nextInt();
		if(constitution > 10 || points-constitution<0){
			System.out.println("You don't have enough points, choose again");
		}
		else{points = points-constitution;
			break;
		}
		}
		
			int charisma = (0);
		
		while(true){
		System.out.println("charisma 1-10");
		charisma = sc.nextInt();
		if(charisma > 10 || points-charisma<0){
			System.out.println("You don't have enough points, choose again");
		}
		else{points = points-charisma;
			break;
		}
		}
		
		System.out.println("Your name is " + boi);
		System.out.println("The Great " + boi2);
		System.out.println("Your Strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your constitution is " + constitution);
		System.out.println("Your charisma is " + charisma);
	}
}		
		