/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jq2;
import java.util.Scanner;
/**
 *
 * @author user
 */

public class Jq2 {

 static void sumof(int n1,int n2){
      int sumofnum=0;
      int i;
      for(i=n1;i<=n2;i++)
      {
      sumofnum+=n1;
      }
      System.out.println("THE SUM OF ALL NUMBERS IS:" + sumofnum );

}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c=new Scanner(System.in);
      System.out.println("enter first number:");
      int num1=c.nextInt();
      System.out.println("enter second number:");
      int num2=c.nextInt();
      sumof(num1,num2);
        
    }
    
}
