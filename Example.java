import java.io.Console;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.String;

public class Example {
	public static void main(String[] args) {
		// Your amazing code goes here ...
		System.out.println("We are making a new PEZ Dispenser…");
		System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser\n", PezDispenser.MAX_PEZ);
		PezDispenser dispenser = new PezDispenser("Iron Man");
		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

		if(dispenser.isEmpty()){
			System.out.println("Dispenser is empty.");
			System.exit(0);
		}
		System.out.println("Flling the dispencer with delicious Pez...");
		dispenser.fill();

		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is full.");
			System.exit(0);
		}
	}
}
