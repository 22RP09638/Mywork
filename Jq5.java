/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jq5;
import java.util.Scanner;
/**
 *
 * @author user
 */
class recr{
    //factorial number using recursion
    static  void calculaterecr(int n){
    if(n==1){
    System.out.println("factorial number is:"+n);
    }
    else{
    System.out.println("factorial number is:"+n*(n-1));
    }
        if(n<0){
    System.out.println("sorry,not possible for negative number");
    }
    else if(n==0){
    System.out.println("factorial of 0 is 1");
    }
    else{
    System.out.println("factorial of"+n*(n-1));
    }
    }
}
public class Jq5 {
    public static void main(String[] args) {
     Scanner c=new Scanner(System.in);
     System.out.println("enter number want to calculate factorial");
      int nmb=c.nextInt();
      recr obj=new recr();
      obj.calculaterecr(nmb);
    }
}
