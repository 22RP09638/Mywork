/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jq3;
import java.util.Scanner;
/**
 *
 * @author user
 */
class ATM{
double balance=1000;
static String location;
static double maxwithdrawlimit;
ATM(){
location="KARONGI";
maxwithdrawlimit=50000;
  System.out.println("YOUR LOCATION IS:" + location); 
  System.out.println("MAXIMUM WITHDRAW LIMIT:" + maxwithdrawlimit); 
}
//display balance;
public void bal(double b){
balance=b;
    System.out.println("YOUR BALANCE IS:"+balance);
}
//deposit
public void deposit(double dep){
    balance+=dep;
    System.out.println("THE NEW BALANCE IS:" +balance); 
    
}
//withdraw
public void withdraw(double wdrw){
    if((wdrw<=maxwithdrawlimit)&&(wdrw>1000)){
    balance=balance-wdrw;
    System.out.println("THE NEW BALANCE IS:" +balance); 
    }
        else{
             System.out.println("TRANSACTION ERROR!");  
        }}
    } 

public class Jq3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c=new Scanner(System.in);
        ATM obj=new ATM();
        obj.balance=1000;
        System.out.println("ENTER AMOUNT WANT TO DEPOSIT:"); 
        double depo=c.nextDouble();
        obj.deposit(depo);
        System.out.println("ENTER AMOUNT WANT TO WITHDRAW:"); 
        double with=c.nextDouble();
        obj.withdraw(with);
    }
    
}
