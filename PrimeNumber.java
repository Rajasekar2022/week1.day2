package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input =13;
		boolean b = false;
		for (int i = 2; i < input/2; i++) {
			if (input % i ==0) {
				b = true;
				break;
			}
		}
		if (b==false) {
			System.out.println("Given Number is a Prime Number");
		}else
		{
			System.out.println("Given Number is not a Prime Number");
		}
	
	}

}
