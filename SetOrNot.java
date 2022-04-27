import java.util.Scanner;

public class SetOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, pos;
        int r = 0;
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Enter the position of bit");
        pos = sc.nextInt();
        sc.close();
        for (int j = 1; j <= pos; j++) {
            r = n % 2;
            n = n / 2;
        }
        if (r == 1) {
            System.out.println("set");
        } else {
            System.out.println("Not Set");
        }
    }
}