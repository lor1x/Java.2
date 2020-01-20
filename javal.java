import java.io.Console;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class javal {
  public static void main(String[] args) {
    // Console console = System.console();
    String name;
    Scanner keyboard = new Scanner(System.in);
    // console.printf("What is your name?\n");
    System.out.println("What's your name?");
    name = keyboard.nextLine();
    keyboard.close();
    /* name = console.readLine("What's your name bitch?  "); */

    // console.printf("First name is: %s", name);12:27 PM
    JOptionPane.showMessageDialog(null, "Hello " + name);
    System.exit(0);
  }
}