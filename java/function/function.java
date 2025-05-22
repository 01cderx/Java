package function;
// import java.util.Scanner;

// public class function {
//     // public static void printMyName(String name) {
//     //     System.out.println("My name is " + name);
//     //     return;
//     // }
//     // public static int calcSum(int a, int b) {
//     //     int sum = a + b;
//     //     return sum;
//     // }

//     // public static int calcProduct(int a, int b) {
//     //     return  a * b;
//     // }

//     public static void printFactorial(int n) {
//         if (n < 0 ) {
//             System.out.println("invalid number");
//             return;
//         }
//         int fact = 1;
//         for (int i = n; i >= 1; i--) {
//             fact = fact * i;
//         }
//         System.out.println("The factorial of " + n + " is: " + fact);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // int a = sc.nextInt();
//         // int b = sc.nextInt();

//         // System.out.println("Enter your name: ");
//         // String name = sc.nextLine();
//         // printMyName(name);
//         // int sum = calcSum(a, b);

//         // System.out.println("The sum is: " + sum);    
//         // System.out.println("The product is: " + calcProduct(a, b));
//         System.out.println("Enter a number to find its factorial: ");
//         // int n = sc.nextInt();
//         printFactorial(n);

//     }
// }