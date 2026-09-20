// static void table() {
//     for (int i = 1; i <= 10; i++) {
//         System.out.println("-> " + 2 * i);
//     }
// }

// Parameterized Function
// static int sum(int a, int b) {
// System.out.println("Sum is = " + (a + b));
// return a + b;
// }

// static int solve(int a, int b) {
//     int pro = a * b;
//     System.out.println(pro);
//     ans(5, 8);
//     return pro;
// }

// static int ans(int x, int y) {
//     System.out.println("gupta");
//     int sum = x + y;
//     System.out.println(sum);
//     return sum;
// }

//  -----------------> Method Overloading <-----------------------

// static int add(int a, int b) {
//     int sum = a + b;
//     return sum;
// }

// static int add(int a, int b, int c) {
//     int sum = a + b + c;
//     return sum;
// }
// ------------------ > Call by Value <-----------------------

static void solve(int num) {

    System.out.println(num);
    int nums = num * 10;
    System.out.println(nums);
}

public static void main(String[] args) {
    // table();
    // int ans = sum(5, 10);
    // System.out.println("Answer is: " + ans);

    // System.out.println("uday");
    // solve(2, 5);
    // System.out.println("All are executed!");

    // -------------------> Method Overloading <-----------------------

    // int ans = add(5, 10, 5);
    // System.out.println("Answer is: " + ans);

    // -------------------> Call by Value <-----------------------

    int num = 5;
    System.out.println(num);
    solve(num);

    System.out.println(num);

}
