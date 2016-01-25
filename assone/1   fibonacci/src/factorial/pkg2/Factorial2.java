/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial.pkg2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Factorial2 {

    
     
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number for factorial calculations");

int a = scanner.nextInt();
double fact= 1;

System.out.println("Factorial of " +a+ ":");
for (int i= 1; i<=a; i++){
fact=fact*i;
      }
System.out.println(fact);
   }
}

   // }
        
        
        
        // TODO code application logic here
   // }
    