import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraL {
    public static void main(String[] args) {
        arraLL1();
    }

    static void arraLL1() {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> user = new ArrayList<Integer>();
        int ent, i1 = scan.nextInt(), i2 = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            ent = scan.nextInt();
            user.add(ent);
        }
        System.out.println("Before: " + user);

        if (i1 < user.size() && i2 < user.size()) {
            if (i1 < i2) {
                user.subList(i1, i2).clear();
            } else {
                user.subList(i2, i1).clear();
            }
        }
        System.out.println("Afer: " + user);

        scan.close();
    }

    static void arraL2() {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<String>();
        String stor, sent = "0";

        System.out.println("If you want to end press -1");
        while (sent != "-1") {
            if (scan.hasNextLine()) {
                stor = scan.nextLine();
                str.add(stor);
                str.sort(String::compareToIgnoreCase);
                if (scan.hasNext("-1")) {
                    sent = "-1";
                }
                System.out.println(str);
            }
        }

        scan.close();
    }

    static void arraL3() {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        String stor1, stor2, sent = "0";

        System.out.println("When done filling first list press -1");
        while (sent != "-1") {
            if (scan.hasNextLine()) {
                stor1 = scan.nextLine();
                str1.add(stor1);
                if (scan.hasNext("-1")) {
                    sent = "-1";
                    break;
                }
            }
        }

        sent = "0";
        System.out.println("When done filling second list press -1");
        while (sent != "-1") {
            if (scan2.hasNextLine()) {
                stor2 = scan2.nextLine();
                str2.add(stor2);
                if (scan2.hasNext("-1")) {
                    sent = "-1";
                }
            }
        }

        System.out.println(str2);
        System.out.println(mergA(str1, str2));
        scan.close();
        scan2.close();
    }

    static void arraL4() {
        ArrayList<Integer> str1 = new ArrayList<Integer>();
        ArrayList<Integer> str2 = new ArrayList<Integer>();
        ArrayList<Integer> mA = new ArrayList<Integer>();

        str1.add(1);
        str1.add(4);
        str1.add(9);
        str1.add(16);

        str2.add(9);
        str2.add(7);
        str2.add(4);
        str2.add(9);
        str2.add(11);

        // str1.addAll(str2);

        int gjat;
        if (str1.size() < str2.size()) {
            gjat = str1.size();
        } else
            gjat = str2.size();

        for (int i = 0; i < gjat; i++) {
            mA.add(str1.get(i));
            mA.add(str2.get(i));
        }

        if (str1.size() == gjat) {
            for (int i = 0; i < Math.abs(str1.size() - str2.size()); i++) {
                mA.add(str2.get(gjat + i));
            }
        } else {
            for (int i = 0; i < Math.abs(str1.size() - str2.size()); i++) {
                mA.add(str1.get(gjat + i));
            }
        }
        // Collections.sort(str1);

        System.out.println(mA);
    }

    static void arraL5() {
        ArrayList<Integer> ontt = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            ontt.add(i + 1);
        }

        Collections.shuffle(ontt);

        System.out.println(ontt);
    }

    static void arraL6() {
        ArrayList<String> test = new ArrayList<String>();
        test.add("Lool");
        test.add("lool");
        test.add("kot");
        test.add("Test");
        test.add("YEES");

        System.out.println(test);

        int n = test.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (Character.isUpperCase(test.get(j).charAt(0))) {
                    String a = test.get(j);
                    test.set(j, test.get(j + 1));
                    test.set(j + 1, a);
                }
            }
        }

        System.out.println(test);
    }

    static ArrayList<String> mergA(ArrayList<String> str1, ArrayList<String> str2) {
        str1.addAll(str2);
        return str1;
    }
}