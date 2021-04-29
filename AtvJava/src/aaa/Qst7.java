package aaa;

/*
 2
 -
 1

to

20
--
10
 */
public class Qst7 {

    public static void main(String[] args) {

        int t = 2;
        int b = 1;

        int totalT = 0;
        int totalB = 0;

        System.out.println(t);
        System.out.println("---");
        System.out.println(b + "\n");

        for (int i = 1; i < 10; i++) {
            if (t > 0) {
                t = -t - 2;
            } else {
                t = -t + 2;
            }
            b = b + 1;

            System.out.println(t);
            System.out.println("---");
            System.out.println(b + "\n");

            totalT += t;
            totalB += b;
        }
        
        System.out.println("S = ");
        System.out.println(totalT);
        System.out.println("---");
        System.out.println(totalB);

    }
}
