package week1.day2;

public class Calculator {
	public  void add(int num1,int num2,int num3) {
		int sum;
		sum = num1+num2+num3;
		System.out.println("Addition of given number "+sum);

	}
	public void  sub(int num1, int num2) {
		int subraction = num1-num2;
		System.out.println("Subraction of two number "+subraction);

	}
	public void mul(double num1, double num2) {
		double multiplication = num1 * num2;
		System.out.println("Multiplication of two number "+multiplication);

	}
	public void divide(float num1, float num2) {
		float div = num1/num2;
		System.out.println("Division of two number "+ div);

	}


}
