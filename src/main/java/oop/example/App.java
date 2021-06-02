package oop.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.print("What is the input string? ");
        Scanner stringIn = new Scanner(System.in);
        String string = stringIn.nextLine();
        System.out.println(string + " has " + string.length() + " characters.");
    }
}
