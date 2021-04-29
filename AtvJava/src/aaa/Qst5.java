package aaa;

public class Qst5 {

    public static void main(String[] args) {

        int[] num;
        num = new int[20];

        int total = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                num[i - 1] = (i * 5);
                System.out.print(num[i - 1] + ", ");
            } else {
                num[i - 1] = (i * -5);
                System.out.print(num[i - 1] + ", ");
            }
        }

        for (int r = 0; r < num.length; r++) {
            total += num[r];
        }

        System.out.println("\n\nTotal: " + total);
    }
}
