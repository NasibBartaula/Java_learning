<<<<<<< HEAD
//First program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q: Print Hello World
        System.out.println("Hello World");
    

//Take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    
//Add two numbers
  System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

 //Even or Odd checker

     System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
        }

//Simple Calculator
       System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (op == '+') {
            System.out.println("Result = " + (a + b));
        } else if (op == '-') {
            System.out.println("Result = " + (a - b));
        } else if (op == '*') {
            System.out.println("Result = " + (a * b));
        } else if (op == '/') {
            System.out.println("Result = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }

    }

=======
//First program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q: Print Hello World
        System.out.println("Hello World");
    

//Take Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    
//Add two numbers
  System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

 //Even or Odd checker

     System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
        }

//Simple Calculator
       System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (op == '+') {
            System.out.println("Result = " + (a + b));
        } else if (op == '-') {
            System.out.println("Result = " + (a - b));
        } else if (op == '*') {
            System.out.println("Result = " + (a * b));
        } else if (op == '/') {
            System.out.println("Result = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }

    }

>>>>>>> bf9b2ca (Java basics)
}