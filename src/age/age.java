package age;

import java.util.Scanner;

public class age {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 18) 
    throw new ageexception("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (ageexception a) {
   System.out.println(a);
  }
 }
}