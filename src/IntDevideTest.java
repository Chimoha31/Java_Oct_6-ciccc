import java.util.Scanner;


public class IntDevideTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dividend, divisor, quotient, remainder;
		
		System.out.println("Enter the dividend");
		dividend = scan.nextInt();
		
		System.out.println("Enter divisor");
		divisor = scan.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		
		
		System.out.println(" is " + quotient);
		System.out.println("Remainder is " + remainder);
		
		scan.close();

	}

}
