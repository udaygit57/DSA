import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of a and b is: " + sum);
        sc.close();

    }
}