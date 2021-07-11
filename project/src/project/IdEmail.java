package project;
import java.util.Scanner;
public class IdEmail {
	public static void main(String[] args) {
		int id;
		Scanner input = new Scanner(System.in);
		System.out.println("How many email ids do you want");
		id = input.nextInt();
		String[] emails = new String[id];
		
		for( int counter = 0; counter < id; counter ++ ) {
			System.out.println("Enter the email id"+(counter+1));
			emails[counter] = input.next();
		}
		
		input.close();
		System.out.println("The email ids are");
		for( int counter = 0; counter < id; counter ++ ) {
			System.out.println(emails[counter]);
	}

}

}
