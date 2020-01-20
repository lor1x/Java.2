class Ushtrime4_3 {
    int U4_3(int a, int b) {
        int s = 0, i;

        if (a > b) {
            i = b + 1;
            while (i > b && i < a) {
                if (i % 2 == 1) {
                    s += i;
                }
                i++;
            }
        }

        else {
            i = a + 1;
            while (i < b && i > a) {
                if (i % 2 == 1) {
                    s += i;
                }
                i++;
            }
        }
        return s;
    }
}