package week1.day1;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class CheckIfTheNumberIsPositiveOrNegative {
	
	public static void main(String[] args) {
		int  a = -20;
		     
		// check the number is greater than 0 or not
		if  (a > 0)
		{
			 System.out.println("The number is positive");
		}
		// checks the number is less than 0 or not 
		else if (a < 0)
		{
			System.out.println("The number is negative");
		}
		// condition fails return false
		else 
		{
			System.out.println("The number is neither positive nor negative");
		}
		
		
	
	}

}
