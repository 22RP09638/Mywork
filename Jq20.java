package jq20;


import java.util.Scanner;
public class jq20 {
    public static void main(String[] args) {
        // Change the year here to test
        Scanner a=new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        int year =a.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       
       
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

}