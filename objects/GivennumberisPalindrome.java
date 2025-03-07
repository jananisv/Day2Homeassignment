package day2.homeassgn.methods.objects;

public class GivennumberisPalindrome {

	public static void main(String[] args) {
		
        int i = 121, reversed = 0, original = i;

        while (i > 0) {
            reversed = reversed * 10 + i % 10;
            i /= 10;
        }

        System.out.println(original == reversed ? "121 is a Palindrome" : "121 is not a Palindrome");
    
	}
}
