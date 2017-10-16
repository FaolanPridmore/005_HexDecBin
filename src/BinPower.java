import java.util.Scanner;

public class BinPower {
	
	Scanner input = new Scanner(System.in);
	
	/*
	 * String is cap reason: it is a class
	 * int isn't cap reason: its primitive, meaning it isn't a class
	 * Integer is cap reason: it is a class
	 * 
	 */
	
	public BinPower() {
		
		
		
	}
	
	public void setBinary() {
		String name = "";
		double exp;
		double base;
		int ans;
		System.out.println("Welcome to my Hexadecimal, Decimal, or "
				+ "Binary conversion program");
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("Very nice to meet you " + name + "! Please enter a base to modify.");
		base = input.nextDouble();
		System.out.println("The base you entered was " + base + " Please enter an exponent to modify it.");
		exp = input.nextDouble();
		
		
		
		System.out.println("The exponent you chose was: " + exp);
		
		
		// (int) "Type Casting" -- pow requires double, which makes no snese in binary 
		// so type cast to get right answer
		ans = (int)Math.pow(base, exp);
		System.out.println("The answer is " + ans);
		
	}
	
}
