/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */


package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String input=in.nextLine();
        String out=" ";
        if(input.equalsIgnoreCase("c")){
            System.out.print("Please enter temperature in Fahrenheit: ");
            int temp= in.nextInt();
            int conv=(temp-32)*(5/9);
             out="The temperature in Celsius is "+conv+ ".";

        }
        else if(input.equalsIgnoreCase("f")){
            System.out.println("Please enter temperature in Celsius: ");
            int temp= in.nextInt();
            int conv=(temp*9/5)+32;
             out="The temperature in Fahrenheit is "+conv+ ".";
        }

        System.out.println(out);


    }

}
