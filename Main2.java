import java.io.Console;
import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
      Console console = System.console();
      Scanner keyboard = new Scanner(System.in);
      //int nr = keyboard.nextInt();
      //nr = Math.abs(nr);
      //String name1, name2, name3;
      String input, inputr = "";
      //String grade = keyboard.nextLine();


      /* if (nr < 0) {
         console.printf("The number given is negative%n");
      }
      else if (nr == 0) {
         console.printf("The number give is 0\n");
      }
      else
         console.printf("The number given is positive");*/

      System.out.println("Fusni nje numer per ta kontrolluar nese eshte palindrome   ");
      input = keyboard.next();
      int length = input.length();
      for (int i = length - 1; i >= 0; i--)
         inputr = inputr + input.charAt(i);

      if (input.equals(inputr))
         System.out.println("Numri eshte palindrome.\n");

      else
         System.out.println("Numri nuk eshte palindrome.\n");
      
      /*System.out.print("Please enter the first name:  ");
        name1=keyboard.nextLine();
     System.out.print("Please enter second name:  ");
        name2=keyboard.nextLine();
      System.out.print("Please enter third name:  ");
        name3=keyboard.nextLine();

      if ((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0)) {
         System.out.println(name1);
         if (name2.compareTo(name3) < 0) {
            System.out.println(name2);
            System.out.println(name3);
         } else {
            System.out.println(name3);
            System.out.println(name2);
         }
      } else if ((name1.compareTo(name2) > 0) && (name2.compareTo(name3) < 0)) {
         System.out.println(name2);
         if (name1.compareTo(name3) < 0) {
            System.out.println(name1);
            System.out.println(name3);
         } else {
            System.out.println(name3);
            System.out.println(name1);
         }
      } else {
         System.out.println(name3);
         if (name1.compareTo(name2) < 0) {
            System.out.println(name1);
            System.out.println(name2);
         } else {
            System.out.println(name2);
            System.out.println(name1);
         }
      }*/

      

      //console.printf("This nubmer has %d digits%n", digits(nr));

      keyboard.close();
      
   }

   static int digits(int num) {
      int count = 0;
      for (; num != 0; num = num / 10, count++)
         ;
      return count;
   }
}