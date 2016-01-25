/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revese2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class Revese2 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        System.out.println("Result:" + reverse); 
        // TODO code application logic here
    }
}
}
    
    

    
  