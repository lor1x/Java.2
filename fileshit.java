import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileshit {
    public static void main(String[] args) {
        Scanner filz = new Scanner(System.in);
        String filenm = filz.next();
        try {
            // FileWriter fw = new FileWriter(filenm);
            // PrintWriter pw = new PrintWriter(fw);

            FileReader fr = new FileReader(filenm);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str + "\n");
            }

            /*
             * pw.println("Course: 30 credits"); pw.println("Year: 120 credits");
             * pw.println("Degree: 360 credits");
             */

            fr.close();
            br.close();
            // fw.close();
            // pw.close();
        } catch (IOException e) {
            System.out.println("ERROR!");
        }
        filz.close();
    }
}