package day2.homeassignment.controlstatement;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		
		int i = 10; // define number 
		if ( i> 0) {
			
            System.out.println(i + " Given number is a Positive number.");
            
        }
		
		else if (i < 0) {
            
			System.out.println(i + " Given number is a Negative number.");
			
        } 
		
		else {
        	
            System.out.println("The number is Zero.");
        }
		
	}

}
