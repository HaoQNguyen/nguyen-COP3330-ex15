/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final String PASSWORD = "abc$123";

        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        String p = input.nextLine();

        if (p.equals(PASSWORD))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
