import java.io.Console;

public class Main{
	public static void main(String[] args) {
		Console console = System.console();
		
		String ageAsString = console.readLine("How old are you lol? ");
		int age = Integer.parseInt(ageAsString);
		

		if(age < 13){
			//insert Code
			console.printf("Sorry, you must be at least 13 to access this part of the program.\n");
			System.exit(0);
		}

		String name = console.readLine("Enter your name:   ");
		String adjective = console.readLine("Enter an adjective:   ");
		String noun = console.readLine("Enter a noun:   ");
		if(noun.equalsIgnoreCase("dork")){
			console.printf("Fak you. Exiting...");
			System.exit(0);
		}
		String adverb = console.readLine("Enter an adverb:   ");
		String verb = console.readLine("Enter a verb:   ");
		console.printf("Your TreeStory:\n---------------\n");
		console.printf("%s is a(n) %s %s.\t", name, adjective, noun);
		console.printf("They're always %s %s\n", adverb, verb);
	}
}