/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bendocoding.recruitment_assignment;

/**
 *
 * @author Bendo
 */
//public class Exercises {
    
    
    class Exercise1
    {
    public boolean isEven(int Number)
   {
      
      boolean evenNumber; 
   
      if ( Number % 2 == 0 ) // if value gives a remainder of 0 when divided by 2 then it's a even number
      {
         evenNumber = true;
      }
         
      else
      {
         evenNumber = false;  //else it's not an even number
      }  
       
      return evenNumber;
   
   } 
    
    
    
   
   public boolean isPrime(int Number)//method to check if value is prime Number
   {
   
       if(Number <=1)                //Input Value cannot be less then 1 as any value less then 1 is not a prime Number
       {
          return false;
       }
       
       for(int i = 2; i < Math.sqrt(Number); i++) //for loop begining from 2 checking whether value is prime, it can't start from 1 since 1 is not a prime
       {
        if(Number % i == 0)//if value gives a remainder of  0 when divided by 2, then it has a high possiblity of not being a prime 
          {
             return false;
          }
       }
         return true;
   }
   
   
   public boolean isPalindrome(int Number) //Method to check if inputef integer value a palindrome
   {
       int remainder;
       int total=0;
       int temporaryValue;

       temporaryValue = Number;
       
       while(Number > 0)             //When Number Greater Then 0 
       { 
         remainder = Number % 10;   //get remainder of the Inputed Value
           
         total =(total*10)+ remainder; 
       
         Number=Number / 10; 
      }  


     if(temporaryValue == total)   
     {
       return true;
     }

    else 
     {
       return false;
     }
    }
    
    }

//}
class Exercise2
{
 public String ReverseString(String Input)  //Method to Reverse Input String  
{

  String reverse = new StringBuffer(Input).
  
  reverse().toString();    //Java Stored Method that reverses string values
  
  return reverse;
        
 }
}
    
public class Exercises 
{

public static void main(String[]args)
{
    
    
    
    int evenNumber1 = 0;
    int evenNumber2 = 3; //Test Integer Values For Even Number
    int evenNumber3 = 6;
    
    int primeNumber1 = 1;
    int primeNumber2 = 3;
    int primeNumber3 = 110; //Integer Test Values For Even Number
    int primeNumber4 = 113;
    
    
    int palindromeNumber1 = 10;
    int palindromeNumber2 = 101; //Integer Test Values For Palindrome Number
    int palindromeNumber3 = 123321;
    
    
    String Input1 = "Hello World";
    String Input2 = "8BitPlantoon"; //String Test Input For Reverse String
    
    Exercise1 Methods1 = new Exercise1();
    Exercise2 Methods2 = new Exercise2();
    


System.out.println("Even Number Test\n");
System.out.println("Test Case 1: Input = " + evenNumber1 + ", " + " Output " + Methods1.isEven(evenNumber1));
System.out.println("Test Case 2: Input = " + evenNumber2 + ", " + " Output " + Methods1.isEven(evenNumber2));
System.out.println("Test Case 3: Input = " + evenNumber3 + ", " + " Output " + Methods1.isEven(evenNumber3) + "\n\n");


System.out.println("Prime Number Test\n");
System.out.println("Test Case 1: Input = " + primeNumber1 + ", " + " Output " + Methods1.isPrime(primeNumber1));
System.out.println("Test Case 2: Input = " + primeNumber2 + ", " + " Output " + Methods1.isPrime(primeNumber2));
System.out.println("Test Case 3: Input = " + primeNumber3 + ", " + " Output " + Methods1.isPrime(primeNumber3));
System.out.println("Test Case 4: Input = " + primeNumber4 + ", " + " Output " + Methods1.isPrime(primeNumber4) + "\n\n");


System.out.println("Palindrome Number Test\n");
System.out.println("Test Case 1: Input = " + palindromeNumber1 + ", " + " Output " + Methods1.isPalindrome(palindromeNumber1));
System.out.println("Test Case 2: Input = " + palindromeNumber2 + ", " + " Output " + Methods1.isPalindrome(palindromeNumber2));
System.out.println("Test Case 3: Input = " + palindromeNumber3 + ", " + " Output " + Methods1.isPalindrome(palindromeNumber3) + "\n\n");


System.out.println("String Word Test\n");
System.out.println("Test Case 1: Input = " + Input1 + ", " + " Output " + Methods2.ReverseString(Input1));
System.out.println("Test Case 2: Input = " + Input2 + ", " + " Output " + Methods2.ReverseString(Input2));
}
}

//}