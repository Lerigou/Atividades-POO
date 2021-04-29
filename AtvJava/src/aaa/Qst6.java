package aaa;

/*
 480
 ---
 10

330
---
40
*/

public class Qst6 {

    public static void main(String[] args) {

        int t = 480;
        int b = 10;

        System.out.println(t);
        System.out.println("---");
        System.out.println(b + "\n");

        for (int i = 1; i <= 30; i++) {
            if (t > 0) {
                t = -t + 5;
            } else {
                t = -t - 5;
            }
            b = b + 1;

            System.out.println(t);
            System.out.println("---");
            System.out.println(b + "\n");
        }
    }
}
