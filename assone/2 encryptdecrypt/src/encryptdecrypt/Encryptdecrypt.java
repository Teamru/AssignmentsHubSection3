/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encryptdecrypt;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Encryptdecrypt {

    /**
     * @param args the command line arguments
     */
  //  public static void main(String[] args) {
      static Map<String,String> Dictionary = new HashMap<>(); 
	static Map<String,String> RevDictionary = new HashMap<>();
      
	
	Encryptdecrypt(){
		
		Dictionary.put("A","%");
		Dictionary.put("a","9");
		Dictionary.put("B","@");
		Dictionary.put("b","#");
                 Dictionary.put("C","1");
		Dictionary.put("c","2");
		Dictionary.put("D","3");
		Dictionary.put("d","4");
		Dictionary.put("E","5");
		Dictionary.put("e","6");
		Dictionary.put("F","7");
		Dictionary.put("f","8");
		Dictionary.put("G","0");
		Dictionary.put("g","}");
		Dictionary.put("H","{");
		Dictionary.put("h","]");
		Dictionary.put("I","[");
		Dictionary.put("i",",");
               Dictionary.put("J",".");
		Dictionary.put("j",">");
		Dictionary.put("K","<");
		Dictionary.put("k","/");
		Dictionary.put("L","0");
		Dictionary.put("l","\\-");
		Dictionary.put("M","\\\"");
		Dictionary.put("m","::");
		Dictionary.put("N",";");
		Dictionary.put("n","+");
		Dictionary.put("O","S");
		Dictionary.put("n","-");
		Dictionary.put("Q","$");
		Dictionary.put("q","%");
		Dictionary.put("R","^");
		Dictionary.put("r","&");
		Dictionary.put("S","*");
		Dictionary.put("s","(");
		Dictionary.put("T",")");
		Dictionary.put("t","~");
		Dictionary.put("U","10");
		Dictionary.put("u","5");
		Dictionary.put("V","\\\\");
		Dictionary.put("v","+");
		Dictionary.put("W","=");
		Dictionary.put("w","7");
		Dictionary.put("X","~");
		Dictionary.put("x",")");
		Dictionary.put("Y","2");
		Dictionary.put("y","*");
		Dictionary.put("Z","]");
		Dictionary.put("z","8");
	
	}

	
	static String Encrypt(String input){
		
				
		String encrypted="";
		String character;
		char charOfString;
		
		for(int i=0;i<input.length();i++){
			
			charOfString = input.charAt(i);
			character = ""+charOfString;
	     
			if(Dictionary.containsKey(character)){
	    	   encrypted =encrypted + Dictionary.get(character);
	       }
		}
		
		return encrypted;
	}	
	
	static String Decrypt(String input){
		
		String Decrypted = "";
		
		String character;
		char charOfString;
		
		for(int i=0;i<input.length();i++){
			
			charOfString = input.charAt(i);
			character = ""+charOfString;
	     
			if(Dictionary.containsKey(character)){
	    	   Decrypted =Decrypted + Dictionary.get(character);
	       }
			System.out.println(Dictionary);
		}
		return Decrypted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String val ="tamene";
		 String encrypt = Encrypt(val);
		
		Encryptdecrypt  op = new Encryptdecrypt();
		System.out.println(op.Encrypt(val));
		
	}




}
  
        // TODO code application logic here
    
    

