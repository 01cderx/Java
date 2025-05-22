// package pattern;

// import java.util.Scanner;

// public class patterns {
//     public static void main(String[] args) {
//         // // for solid rectangle
//         // // int n = 4;
//         // // int m = 5;
//         // // for (int i = 0; i <n; i++) {
//         // // for (int j = 0; j < m; j++) {
//         // // System.out.print("* ");
//         // // }
//         // // System.out.println();
//         // // }


//         // For hollow rectangle
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // int m = sc.nextInt();
//         // // outer loop
//         // for (int i = 1; i <= m; i++) {
//         //     // inner loop
//         //     for (int j = 1; j <= n; j++) {
//         //         if (i == 1 || i == m || j == 1 || j == n) {
//         //             System.out.print("* ");
//         //         } else {
//         //             System.out.print(" ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }


//         // // For right angle traingle
//         // int n = 4;
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j<= i; j++) { // row no. == no. of stars
//         // System.out.print("* "); 
//         // }
//         // System.out.println();
//         // }


//         // 1 \n 12 \n 123 \n 1234
//         // int n = 4;
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j<= i; j++) { // row no. == no. of stars
//         // System.out.print(j+" ");
//         // }
//         // System.out.println();
//         // }


//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j<= i; j++) { // row no. == no. of stars
//         // if (i%2 != 0) {
//         // System.out.print(j+" ");
//         // } else {
//         // System.out.print((char)(j+64)+" ");
//         // }
//         // }
//         // System.out.println();
//         // }


//         // for inverted right angle triangle means upside down
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // for (int i = n; i >= 1; i--) {
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print("* ");
//         // }
//         // System.out.println();
//         // }


//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // for (int i = n; i >= 1; i--) {
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(j+" ");
//         // }
//         // System.out.println();
//         // }


//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // for (int i = n; i >= 1; i--) {
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print((char)(j+64)+" ");
//         // }
//         // System.out.println();
//         // }


//         // // Inverted half pyramid (rotated by 180 degrees)
//         // // int n = 4;
//         // // for (int i = 1; i <= n; i++) {
//         // // // inner loop to print spaces
//         // // for(int j = 1; j <= n-i; j++) {
//         // // System.out.print(" ");
//         // // // inner loop to print stars
//         // // } for (int k = 1; k <= i; k++) {
//         // // System.out.print("*");
//         // // }
//         // // System.out.println();
//         // // }


//         // Scanner sc = new Scanner(System.in); // 1 13 135 1357 for n terms of odd
//         // numbers triangle
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(2*j-1+ " ");
//         // }
//         // System.out.println();
//         // }


//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // int a = 1;
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j <= i; j++) {
//         // System.out.print(a++ + " ");
//         // if (a < 10)
//         // System.out.print(" ");
//         // }
//         // System.out.println();
//         // }


//         // // Half pyramid using numbers
//         // // Scanner sc = new Scanner(System.in);
//         // // System.out.print("Enter a number:");
//         // // int n = sc.nextInt();
//         // // for (int i = 1; i <= n; i++) {
//         // // for (int j = 1; j <= i; j++) {
//         // // System.out.print(j+ " ");
//         // // }
//         // // System.out.println();
//         // // }


//         // // inverted half pyramid using numbers
//         // // Scanner sc = new Scanner(System.in);
//         // // System.out.print("Enter a number:");
//         // // int n = sc.nextInt();
//         // // for (int i = n; i >= 1; i--) {
//         // // for (int j = 1; j <= i; j++) {
//         // // System.out.print(j+ " ");
//         // // }
//         // // System.err.println();
//         // // }


//         // // Floyd's triangle
//         // // Scanner sc = new Scanner(System.in);
//         // // System.out.print("Enter a number:");
//         // // int n = sc.nextInt();
//         // // int count = 1;
//         // // for (int i = 1; i <= n; i++) {
//         // // for (int j = 1; j <= i; j++) {
//         // // System.out.print(count + " ");
//         // // count++;
//         // // }
//         // // System.out.println();
//         // // }


//         // // 0-1 triangle
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++ ) {
//         // for (int j = 1; j <= i; j++) {
//         // if ((i + j) % 2 == 0) {
//         // System.out.print("1 ");
//         // }
//         // else {
//         // System.out.print("0 ");
//         // }
//         // }
//         // System.out.println();
//         // }


//         // Star plus +
//         // *
//         // * * *
//         // *
//         // like above
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // int mid = n/2 + 1;
//         // for (int i = 1; i <= n; i++) {
//         // for (int j = 1; j <= n; j++) {
//         // if (i == mid || j == mid) {
//         // System.out.print("* "+ " ");
//         // } else {
//         // System.out.print(" "+ " ");
//         // }
//         // }
//         // System.out.println();
//         // }

        
//         // System.out.println(" * * * *");
//         // same thing using loops
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= n; j++) {
//         //         if ((i + j)>n) {
//         //             System.out.print("*"+ " ");
//         //         } else {
//         //             System.out.print(" "+ " ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }


//         // Method 2 // to print the same pattern like a right angle triangle
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= n-i; j++) { // for spaces
//         //         System.out.print(" "+ " ");
//         //     } 
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("*"+ " ");
//         //     }
//         //     System.out.println();
//         // }


//         // To print the number wala pattern like a right angle triangle 
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= n-i; j++) { // for spaces
//         //         System.out.print(" "+ " ");
//         //     } 
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print(j+ " ");
//         //         // System.out.print((char)(j+96)+ " ");
//         //         // System.out.print((char)(j+64)+ " ");
//         //     }
//         //     System.out.println();
//         // }
        

//     }
// }
