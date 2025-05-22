// package Recursion;

// import java.util.Scanner;

// public class recursion {
//     // public static void printNumb(int n) {
//     // if (n == 0) {
//     // return;
//     // }
//     // System.out.println(n);
//     // printNumb(n-1);
//     // }

//     // public static int sum(int n) {
//     // if (n == 0) {
//     // return 0;
//     // }
//     // return n + sum(n - 1);
//     // }

//     // public static void calcFactorial(int n, int fact) {
//     // if (n == 0) {
//     // System.out.println(fact);
//     // return;

//     // }
//     // fact = fact * n;
//     // calcFactorial(n - 1, fact);
//     // }

//     // public static void printFibonacci(int n, int a, int b) {
//     //     if (n == 0) {
//     //         return;
//     //     }
//     //     System.out.println(a);
//     //     int c = a + b;
//     //     a = b;
//     //     b = c;
//     //     printFibonacci(n - 1, a, b);
//     // }

//     // public static int power(int x, int n) {
//     //     if (n == 0) {
//     //         return 1;
//     //     }
//     //     return x * power(x, n - 1);
//     // }

//     // public static int calcPower(int x, int n) {
//     //     if (n ==0) {
//     //         return 1;
//     //     }
//     //     if (x == 0) {
//     //         return 0;  
//     //     }
//     //     // if n is even
//     //     if (n%2 == 0) {
//     //         return calcPower(x, n/2) * calcPower(x, n/2);
//     //     } else {
//     //         return calcPower(x, n/2) * calcPower(x, n/2) * x;
//     //     }

//     // }
    

//     public static void main(String[] args) {
//         // a function calls itself whie the condition is true
//         // int n = 5;
//         // printNumb(n);
//         // print sum of first n natural number using recursion
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int n = sc.nextInt();
//         // int sum = sum(n);
//         // System.out.println("Sum of first " + n + " natural numbers is: " + sum);

//         // print factorial of a number using recursion
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int n = sc.nextInt();
//         // calcFactorial(n, 1);

//         // print fibonacci series using recursion
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int n = sc.nextInt();
//         // int a = 0;
//         // int b = 1;
//         // printFibonacci(n - 2, a, b);
        
//         // print x^n using recursion
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int x = sc.nextInt();
//         // System.out.println("Enter the power");
//         // int n = sc.nextInt();
//         // power(x, n);
//         // System.out.println("The power of " + x + " to the " + n + " is: " + power(x, n));

//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int x = sc.nextInt();
//         // System.out.println("Enter the power");
//         // int n = sc.nextInt();
//         // int result = calcPower(x, n);
//         // System.out.println("The power of " + x + " to the " + n + " is: " + result);

//     }
// }