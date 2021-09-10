package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        int gender, ounces, weight, hours;
        double BAC = 0;
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a 1 if you are male or a 2 if you are female:" );
        while( !input.hasNextInt() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        gender = input.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        while( !input.hasNextInt() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        ounces = input.nextInt();
        System.out.println("What is your weight, in pounds?");
        while( !input.hasNextInt() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        weight = input.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        while( !input.hasNextInt() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        hours = input.nextInt();
        if(gender == 1) {
            BAC = (ounces * 5.14 / weight * 0.73) - 0.015 * hours;
        }
        else if(gender == 2){
            BAC = (ounces * 5.14 / weight * 0.66) - 0.015 * hours;
        }
        String BACs = String.format("%.6f", BAC);
        System.out.println("Your BAC is " + BACs);
        if( BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive");
        }
    }
}
