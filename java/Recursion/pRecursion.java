// import java.util.HashSet;
// import java.util.Scanner;

// public class pRecursion {
//     // public static void towerOfHanoi(int n, String src, String helper, String
//     // dest) {
//     // if (n == 1) {
//     // System.out.println("Move disk "+ n + " from "+src+" to "+dest);
//     // return;
//     // }
//     // towerOfHanoi(n-1, src, dest, helper);
//     // System.out.println("Move disk "+ n + " from "+src+" to "+dest);
//     // towerOfHanoi(n-1, helper, src, dest);
//     // }

//     // public static void printRev(String str, int idx) {
//     // if (idx == 0) {
//     // System.out.print(str.charAt(idx));
//     // return;
//     // }
//     // System.out.print(str.charAt(idx));
//     // printRev(str, idx-1);
//     // }

//     // public static int first = -1;
//     // public static int last = -1;

//     // public static void findOccurence(String str, int idx, char element) {
//     // if (idx == str.length()) {
//     // System.out.println(first);
//     // System.out.println(last);
//     // return;
//     // }
//     // char currChar = str.charAt(idx);
//     // if (currChar == element) {
//     // if (first == -1) {
//     // first = idx;
//     // } else {
//     // last = idx;
//     // }
//     // }
//     // findOccurence(str, idx + 1, element);
//     // }

//     // public static boolean isSorted(int arr[], int idx) {
//     // if (idx == arr.length - 1) {
//     // return true;
//     // }
//     // if (arr[idx] >= arr[idx + 1]) {
//     // // array is unsorted
//     // return false;
//     // }
//     // return isSorted(arr, idx + 1);
//     // }

//     // public static void moveAllX(String str, int idx, int count, String newString)
//     // {
//     // if (idx == str.length()) {
//     // for (int i = 0; i < count; i++) {
//     // newString += 'x';
//     // }
//     // System.out.println(newString);
//     // return;
//     // }
//     // char currChar = str.charAt(idx);
//     // if (currChar == 'x') {
//     // count++;
//     // moveAllX(str, idx+1, count, newString);
//     // } else {
//     // newString += currChar;
//     // moveAllX(str, idx+1, count, newString);
//     // }
//     // }

//     // public static boolean[] map = new boolean[26];

//     // public static void removeDuplicates(String str, int idx, String newString) {
//     // if (idx == str.length()) {
//     // System.out.println(newString);
//     // return;
//     // }
//     // char currChar = str.charAt(idx);
//     // if (map[currChar - 'a']) {
//     // removeDuplicates(str, idx + 1, newString);
//     // } else {
//     // newString += currChar;
//     // map[currChar - 'a'] = true;
//     // removeDuplicates(str, idx + 1, newString);
//     // }
//     // }

//     // public static void subsequences(String str, int idx, String newString) {
//     //     if (idx == str.length()) {
//     //         System.out.println(newString);
//     //         return;
//     //     }
//     //     char currChar = str.charAt(idx);
//     //     subsequences(str, idx + 1, newString + currChar);

//     //     subsequences(str, idx + 1, newString);
//     // }

//     // public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
//     //     if (idx == str.length()) {
//     //         if (set.contains(newString)) {
//     //             return;
//     //         } else {
//     //             System.out.println(newString);
//     //             set.add(newString);
//     //             return;
//     //         }
//     //     }
//     //     char currChar = str.charAt(idx);
//     //     subsequences(str, idx + 1, newString + currChar, set);
//     //     subsequences(str, idx + 1, newString, set);
//     // }

//     // public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//     // public static void printKeypad(String str, int idx, String combination) {
//     //     if (idx == str.length()) {
//     //         System.out.println(combination);
//     //         return;   
//     //     }
//     //     char currChar =  str.charAt(idx);
//     //     String key = keypad[currChar - '0'];
//     //     for (int i = 0; i < key.length(); i++) {
//     //         printKeypad(str, idx+1, combination+key.charAt(i));
//     //     }
//     // }

//     // public static void printPerm(String str, String Permutation) {
//     //     if (str.length() == 0) {
//     //         System.out.println(Permutation);
//     //         return;
//     //     }
//     //     for (int i = 0; i < str.length(); i++) {
//     //         char currChar = str.charAt(i);
//     //         String newStr = str.substring(0, i) + str.substring(i+1);
//     //         printPerm(newStr, Permutation + currChar);
//     //     }
//     // }



//     public static void main(String[] args) {
//         // Scanner input = new Scanner(System.in);
//         // int n = input.nextInt();
//         // towerOfHanoi(n, "Source", "Helper", "Destination");

//         // Scanner sc = new Scanner(System.in);
//         // String str = sc.nextLine();
//         // printRev(str, str.length()-1);

//         // Scanner oc = new Scanner(System.in);
//         // String str = oc.nextLine(); // abaacdaefaah
//         // findOccurence(str, 0, 'a');

//         // Scanner is = new Scanner(System.in);
//         // int n = is.nextInt();
//         // int arr[] = new int[n];
//         // for (int i = 0; i < n; i++) {
//         // arr[i] = is.nextInt();
//         // }
//         // System.out.println(isSorted(arr, 0));

//         // String str = "axbcxxd";
//         // moveAllX(str, 0, 0, "");

//         // String str = "abbccda";
//         // removeDuplicates(str, 0, "");

//         // String str = "abc";
//         // subsequences(str, 0, "");
        
//         // String str = "aaa";
//         // HashSet<String> set = new HashSet<>();
//         // subsequences(str, 0, "", set);
    
//         // String str = "23";
//         // printKeypad(str, 0, " ");

//         // String str = "abc";
//         // printPerm( str, "");
        
        
//     }
// }
