/**
 * SortString.java 1.1 19-08-2017
 * 
 */
//package declaration
package session72;

//importing Arrays class from java.util package for utilizing sort method

import java.util.Arrays;
/**
 *  This class will illustrate the code logic to sort words of given strings, 
 *  then sort characters in each word.
 *  Additionally it converts the first letter of each word to uppercase like original string.
 * 
 * @author Chhaya Yadav
 * 
 * version 1.1
 * 
 * Compiled on 19-Aug-2017
 */
//public class declaration
public class SortString {

//main method declaration
	
	public static void main(String[] args) {
	
//Original String literal declaration and initialization
		
		String str = "East West North South"  ;

//Conversion of all characters to lower case in original string
		
		String strl = str.toLowerCase();

//String to store the sorted word alphabetically
		
		String strn = "";

//declaration of delimiter space to parse the string into words 
		
		String delimiter = "[ ]+" ;
		
//parsing the string with the help of delimiter space	
		
		String[] word = strl.split(delimiter) ;
		
//length of String array
		
		int len = word.length ;
		
		int i , j ;

//declaration of one dimensional character array
		
		char[] ch ;
		
//integer variable declared for typecasting to convert first letter of each word to uppercase	
		
		int cast ;
		
//for loop to parse each word in String		
	
		for ( i = 0  ; i < len ; i ++){
			
//each word gets parsed to character array ch
			
		     ch = word[i].toCharArray() ;   
			
			 for( j = 0 ; j < ch.length ; j++){
				 
//sorting the characters as per ascii value in each word.This method is imported from java.util.Arrays method.				 
				 
				  Arrays.sort(ch);
				
//if it is first character then convert the letter to uppercase by type casting
				
				  if(j==0) {
					
//explicit typecasting from character to integer		
					  
					        cast  = (int) ch[j]  ;
					
//conversion to uppercase from lowercase	
					        
					        cast  = cast - 32 ;      
					        
//explicit typecasting from integer to character					        
					
				        	ch[j] = (char) cast ;    
					
				  }
//string concatenation with each word alphabetically arranged in ascending order				
				
				strn = strn  + ch[j] ;
				

			 }
//incorporating the space in between each word
			 
			 strn = strn + " " ;
					

		} 
		
//printing the original string
		
        System.out.println("Original String :" + str);
        System.out.println("");
        
//printing the sorted string       
        
		System.out.println("String with each word sorted alphabetically :" + strn);

	}
}


