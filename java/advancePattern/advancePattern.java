// package advancePattern;

// import java.util.Scanner;

// public class advancePattern {
//     public static void main(String args[]) {
//         // Print Butterfly pattern
//         // int n = 4;
//         // // Upper half
//         // for (int i = 1; i <= n; i++) {
//         //     // Print stars
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     // Print spaces
//         //     for (int j = 1; j <= 2 * (n - i); j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }
//         // // Lower half
//         // for (int i = n; i >= 1; i--) {
//         //     // Print stars
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     // Print spaces
//         //     for (int j = 1; j <= 2 * (n - i); j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }


//         // Print Solid Rhombus pattern
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter a number:");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     // Print spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= n; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }


//         // Print Hollow Rhombus pattern
//         // int n = 5;
//         // for (int i = 1; i <= n; i++) {
//         //     // Print spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= n; j++) {
//         //         if (j == 1 || j == n || i == n) {
//         //             System.out.print("* ");
//         //         } else {
//         //             System.out.print("  ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }


//          // Print Inverted Half Pyramid pattern
//         // If you want to print the left arrow < like this: then you have to use both upper and lower half
//         // // Lower half
//         // for (int i = n; i >= 1; i--) {
//         //     // Print spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= n; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }


//         // Print Number Pyramid pattern 
//         // int n = 5; // Number of rows

//         // for (int i = 1; i <= n; i++) {
//         //     // Print leading spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print(" ");
//         //     }
            
//         //     // Print the number i, i times
//         //     for (int k = 1; k <= i; k++) {
//         //         System.out.print(i + " ");
//         //     }
            
//         //     // Move to the next line
//         //     System.out.println();
//         // }


//         // Print Pallindrome Number Pyramid pattern 1 212 321123
//         // int n = 5; // Number of rows
//         // for (int i = 1; i <= n; i++) {
//         //     // Print leading spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print(" ");
//         //     }

//         //     // Print the number i, i times
//         //     for (int k = i; k >= 1; k--) {
//         //         System.out.print(k);
//         //     }

//         //     // Print the number i, i times in reverse order
//         //     for (int k = 2; k <= i; k++) {
//         //         System.out.print(k);
//         //     }
//         //     // Move to the next line
//         //     System.out.println();
//         // }


//         // // Print Diamond pattern
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt(); // Number of rows
//         // // // Upper half
//         // for (int i = 1; i <= n; i++) {
//         //     // Print spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= 2 * i - 1; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }
//         // // Lower half
//         // for (int i = n - 1; i >= 1; i--) {
//         //     // Print spaces
//         //     for (int j = 1; j <= n - i; j++) {
//         //         System.out.print("  ");
//         //     }
//         //     // Print stars
//         //     for (int j = 1; j <= 2 * i - 1; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }

//         //  print pyramid pattern
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter n");
//         // int n = sc.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= n-i; j++) {
//         //         System.out.print(" "+" ");
//         //     }
//         //     for (int j = 1; j <= 2*i-1; j++) {
//         //         // System.out.print("*"+" ");
//         //         // System.out.print(j+" ");
//         //         System.out.print((char)(j+96)+" ");
//         //         // System.out.print((char)(j+64)+" ");

//         //     }
//         //     System.out.println();
//         // }
        


//     }
// }
