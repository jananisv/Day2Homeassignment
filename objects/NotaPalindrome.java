package day2.homeassgn.methods.objects;

public class NotaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 123456789, reversed = 0;

        // Reverse the number
       // while (i > 0) {
          //reversed = reversed * 10 + i % 10;
        	
          //  i /= 10;
      //  }

        // Check for palindrome
        if (i == reversed) {
            System.out.println(i + " is a Palindrome.");
        } else {
            System.out.println(i + " is not a Palindrome.");
        }

	}
}
