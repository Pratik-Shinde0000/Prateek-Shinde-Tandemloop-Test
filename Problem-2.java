import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        
        int count = 0, num = 1;
        while (count < x) {
            System.out.print(num);
            if (count != x - 1) System.out.print(", ");
            num += 2;
            count++;
        }

        sc.close();
    }
}
