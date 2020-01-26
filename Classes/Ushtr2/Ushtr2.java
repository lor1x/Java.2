package Classes.Ushtr2;

import java.util.Scanner;

public class Ushtr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int quizN = sc.nextInt();
        Student st = new Student(name, quizN);

        int soc, i = 0;

        System.out.print("Vendosni piket    ");

        while (i < quizN) {
            soc = sc.nextInt();
            st.addQuiz(soc);
            i++;
        }

        System.out.println(
                "Name: " + st.getName() + " and score " + st.getTotalScore() + " and avg score " + st.getAvgScore());

        sc.close();
    }
}