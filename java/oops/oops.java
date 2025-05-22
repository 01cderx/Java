package oops;

import java.util.Scanner;
import bank.Bank;


// class Pen {
//     String color;
//     String type; //ballpoint, gel, fountain

//     public void write() {
//         System.out.println("Writing something");
        
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     // Student(String name, int age) {
//     //     this.name = name;
//     //     this.age = age;
//     //     // System.out.println("constructor called");
//     // }
//     Student() {
//         // Default constructor
//     }

//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//         // System.out.println("constructor called");
//     }
// }


// Polymorphism
// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);   
//     }
//     public void printInfo(int age) {
//         System.out.println(age);
//     }
//     public void printInfo(String name, int age) {
//         System.out.println(name+" "+age);
//     }
// } 

// Inheritance

// class Shape {
//     String color;
// }

// class Traingle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(0.5*l*h);
//     }
// }

// class EquilateralTraingle extends Traingle {
//     public void are(int l) {
//         System.out.println(0.5*l*l);
//     }
// }

// class Circle extends Shape {
//     public void area(int r) {
//         System.out.println(3.14*r*r);
//     }
// }

// Encapsulation


// public class oops {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";

//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpoint";

//         pen1.printColor();
//         pen2.printColor();
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name and age");
//         String name = sc.next();
//         int age = sc.nextInt();
//         // Student s1 = new Student(name, age);
//         Student s1 = new Student();
//         s1.name = name;
//         s1.age = age;

//         Student s2 = new Student(s1);

        
//         // s1.name = "Aman";
//         // s1.age = 24;
//         s2.printInfo();
//     }
// }

// public class oops {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "aman";
//         s1.age = 24;
    
//         s1.printInfo(s1.name,s1.age);
//     }
// }


// public class oops {

//     public static void main(String[] args) {
//         Traingle t1 = new Traingle();
//         t1.color = "red";
        
//     }
// }
// abstract = khyal that can be created but not can be used 

abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("You are creating a new Animal");
    }
    public void eat() {
        System.out.println("eats food");
    }
}
class Horse extends Animal {
    Horse () {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

// inheritance  -  is a relationship - 
// encapsulation -  
// abstraction - 
// polymorphism - 

interface Anima {
    void walk();
    void eat();
}
class Horsy implements Anima {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class oops {

    public static void main(String[] args) {
        
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat(); 
    }
}
