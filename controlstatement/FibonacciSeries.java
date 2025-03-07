package day2.homeassignment.controlstatement;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8; // Define the range
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + range + " terms:");

        for (int i = 1; i <= range; ++i) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }

	}

}
