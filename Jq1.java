/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jq1;
import java.util.Scanner;
/**
 *
 * @author user
 */
class rectangle{
double width;
double length;
public void area(double w,double l){
   width=w;
   length=l;
   System.out.println("THE AREA OF RECTANGLE IS:"+ width*length);
}
public void permeter(double k,double p){
   width=k;
   length=p;
   System.out.println("THE PERIMETER OF RECTANGLE IS:"+ (width+length)/2);
}
}
   
public class Jq1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner c=new Scanner (System.in);
       System.out.println("ENTER THE WIDTH");
       double a=c.nextDouble();
       System.out.println("ENTER THE LENGTH");
       double b=c.nextDouble();
       rectangle r=new rectangle();
       r.area(a, b);
       r.permeter(a, b);
    }
    
}
