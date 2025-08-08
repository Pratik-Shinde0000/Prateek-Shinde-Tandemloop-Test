import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        int count = 0, num = 1;
        while (num <= x) {
            System.out.print(num);
            num += 2;
            count++;
            if (num <= x) System.out.print(", ");
        }

        sc.close();
    }
}
