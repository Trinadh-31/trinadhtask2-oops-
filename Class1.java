package example1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;

        // creating object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.next();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your weight: ");
        weight = input.nextFloat();

        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
    }
}