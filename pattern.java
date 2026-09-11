import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a no: ");
        // int n = sc.nextInt();

// 1. Solid square

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// 2. Solid Rectngle
        // int row = 3;
        // int col = 5;
        // for(int i = 1; i<=row; i++){

        //     for(int j = 1; j <= col; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// 3. Right Angle Triangle

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// Inverse Right Angle Triangle.
// int n = 5;
//         for(int i = 0; i<=n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print("* ");
//             }
            
//             System.out.println();
//         }

// Right SIde Right Angle Triangle.

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print("  ");
        //     }

        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


// Solid Rhombus.
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
        for(int k = 1; k <= n; k++){
            System.out.print("* ");
        }
            System.out.println();
        }
        // sc.close();

    }
}
