
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class customer {
     double deposit;
        int account_number;
        String name;
        double balance;
        double withdraw;
    double  deposit(){
        double x;
        Scanner input=new Scanner(System.in);
      System.out.println(" enter amount to be deposit");
      x=input.nextDouble();
      balance+=x;
      return balance;
    }
   double withdraw(){ 
       double y;
        Scanner input=new Scanner(System.in);
        System.out.println("enter  amount to be withdraw");
        y=input.nextDouble();
        if(y<=balance){
        balance-=y;
    } 
    else {
        
        System.out.println("your balance is low");
        }
        return balance;
        }
       public static void main(String[] args)
       {
            String name;
            int account_number;
            customer bk=new customer();
            Scanner input=new Scanner(System.in);
            System.out.print("enter your name");
            name=input.nextLine();
            System.out.println("enter your account_number");
            account_number=input.nextInt();
            bk.deposit();
            bk.withdraw(); 
}}

    

