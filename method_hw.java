public class method_hw {
    // 1. CREATE A METHOD PRINTWELCOMEMESSAGE() THAT PRINT A GREETING
    // public static void greet() {
    // System.out.println("Hello, someone!");
    // }

    // 2. CREATE A METHOD ADD(INT A, INT B) THAT RETURN THE SUM.
    // public static int add(int a, int b) {
    // System.out.println(a + b);
    // return a + b;
    // }

    // 3. CREATE A METHOD ISEVEN(INT N) THAT RETURN TRUE IF NUMBER IS EVEN.

    // public static int isEven(int n) {
    // if (n % 2 == 0) {
    // System.out.println("True");
    // return 1;
    // } else {
    // System.out.println("False");
    // return 0;
    // }
    // }

    // 4. CREATE A METHOD GETMAX(INT A, INT B) THAT RETURN THE LARGER NO.
    // public static int largerNo(int a, int b) {
    // if (a >= b) {
    // System.out.println("a is greater than b, i.e: " + a);
    // return a;
    // } else {
    // System.out.println("b is greater than a, i.e: : " + b);
    // return b;
    // }
    // }

    // 5. CREATE A METHOD CALCULATEPERCENTAGE(INT OBTAINED, INT TOTAL).

    // public static float calculatePercentage(float obtained, float total) {
    // float percentage = (obtained * 100) / total;
    // System.out.println(percentage);
    // return percentage;
    // }

    // 6. CREATE AN OVERLOADED METHOD DISPLAY() WITH ONE INT PARAMETER OR ONE
    // STRING.

    public static int display(int a) {
        System.out.println("int: " + a);
        return a;
    }

    public static void display(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        // greet();
        // add(5, 10);
        // isEven(8);
        // largerNo(5, 1);
        // calculatePercentage(483, 500);
        display("satyam");

    }
}
