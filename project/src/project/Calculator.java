package project;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		int num1,num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		num2 = in.nextInt();
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Sub = "+(num1-num2));
		System.out.println("Milt = "+(num1*num2));
		System.out.println("Div = "+(num1/num2));

	}

}
