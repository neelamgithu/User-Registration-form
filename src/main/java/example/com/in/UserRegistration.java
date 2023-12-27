package example.com.in;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to UserRegistration form Program");
		  System.out.print("Enter your first name: ");
	        Scanner scanner = new Scanner(System.in);
	        String userInput = scanner.nextLine();
	        System.out.println(isValidFirstName(userInput));
	        
			  System.out.print("Enter yourLast name: ");
		        Scanner sc = new Scanner(System.in);
		        String LastName = scanner.nextLine();
		        System.out.println(isValidLastName(LastName));
		        
		        System.out.print("Enter your email id ");
		        Scanner emailid = new Scanner(System.in);
		        String email= scanner.nextLine();
		        System.out.println(isValidemailid(email));
		        
		        System.out.print("Enter your mobile number ");
		        Scanner mob = new Scanner(System.in);
		        String number= scanner.nextLine();
		        System.out.println(isValidmobnum(number));
	}
    

	
	public static boolean isValidmobnum(String number) {
		if(number !=null && number.matches("^A[0-9]{2}+\\s\\A[0-9]{10}\\z"))
		 {
			  return true;
		  }
			
		  else 
			  	{return false;}
      
		  
		
	}



	public static  boolean  isValidemailid(String email) {
		if(email != null && email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-][a-zA-Z0-9]+)*\\.[a-z]{2,}(\\.[a-z]{2,})?$\r\n"
				+ ""))
			{return true;
	  }
		
	  else {
		  	return false;
 
	  }
	}

	public static boolean isValidLastName(String LastName) {
		 if( LastName != null && LastName.matches("[A-Z][a-zA-Z]{2,}"))
		  {
			  return true;
		  }
			
		  else {
			  	return false;
       
		  }
		
	}



	public  static boolean isValidFirstName(String firstName) {
        // Check if the first name starts with a capital letter and has a minimum length of 3 characters
      
		  if( firstName != null && firstName.matches("[A-Z][a-zA-Z]{2,}"))
		  {
			  return true;
		  }
			
		  else {
			  	return false;
        
		  }
    }

}