package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
	
		int input = 123;
		int sum =0 ;
		
		while (input > 0) {
			int rem = input % 10;
			System.out.println("Reminder is "+rem);
			sum=sum+rem;
			System.out.println("Sum is "+sum);
			input = input / 10;
			System.out.println("Quo "+ input / 10);
		}
		System.out.println("sum of digits "+sum);

	}

}
