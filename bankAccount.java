import java.util.Scanner;
import java.util.Formatter;

public class bankAccount {
static Scanner fetch = new Scanner(System.in);
static Formatter formatter = new Formatter();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long account = 0; 
		String yorn = ""; // Creates the yes or no variable used to start and exit program
		while (yorn == "y") {
			System.out.println("Would you like to use the banking application? (please enter y or n)");
			yorn = fetch.next(); 
			System.out.println("Please enter the amount you would like to deposit: ");
			account = account +fetch.nextLong(); 
			formatter.format("%.2f", account);
			System.out.println("Please enter the amount you would like to withdraw:" );
			account = account -fetch.nextLong();
			formatter.format("%.2f", account);
			System.out.println("Your account balence is: $"+account);}
	}

}
