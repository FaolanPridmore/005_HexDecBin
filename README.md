# 005_HexDecBin




String bin = "";
  	String msg = "";
  	int num;
 +	int numberBits = 10;
 +	int bite = 8; // spelled wrong to avoid a keyword conflict
 +	int nibble = 4;
 +	int byteAnswer = 0, byteRemainder = 0;
  	
  	
  	public HexDecBin() {
 		msg= "Welcome to my Hexadecimal, Decimal, or Binary conversion program!";
 		JOptionPane.showMessageDialog(null, msg);
 		msg = "What is your name?";
 		JOptionPane.showInputDialog(msg);
 		//store name somehow
 		msg= "Very nice to meet you " + name + " let's begin: ";
 		JOptionPane.showMessageDialog(null, msg);
 	} // end of HexDecBin
 	
 	
 	public void setHexNumber() {
 		
 		System.out.println("\nEnter the hex number");
 		hex = kbd.nextLine();
 		// mouse over parseInt to read pop-up guide
 		num = Integer.parseInt(hex, 16);
 		System.out.println("You have entered hex " + hex );
 		System.out.println("Decimal value is: " + num + "(remember 0-" + num + " has " + (num+1) + " values)");
 	} //end of getHexNumber
 	
  	public void setDecNumber() {
  		System.out.println("\nEnter the Dec number");
  		dec = kbd.nextLine();
 +		num = Integer.parseInt(dec);
 +		System.out.println("You have entered dec " + dec);
 +		
 +		
  		
  	}
  	
 	public void setBinNumber() {
 		System.out.println("\nEnter the Bin number");
 		bin = kbd.nextLine();
 	}
 	
 	void convert() {
 		
 		String binary = Integer.toBinaryString(num);
 		
 		System.out.println("Binary value is: " + binary);
  		System.out.println("Number of bits is " + binary.length());
  		System.out.println("Number of whole nibbles (4 bits) is x with y bits left over");
  		System.out.println("Number of whole bytes (8 bits) is x with y bits remaining");
 -	}
 -	
 +		byteAnswer = numberBits / bite;
 +		byteRemainder = numberBits % bite;
 +		
 +		System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
 +	}	
  	
  }
  	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 
View  
18  src/RunHere.java
@@ -1,5 +1,18 @@
  
  public class RunHere {
 +	
 +	/*
 +	 * Grading Req's!
 +	 * 
 +	 * 1. All JOP's, remove / comment out Scanner, syso
 +	 * 2. Runnable jar -- stand alone outside of Eclipse 
 +	 * 3. Ask for name, repeat name with friendly "Hello ...
 +	 * 4. Ask "What base are we starting with, Hex, Dec, or Bin?"
 +	 * 5. Ask "what base are we converting to, Hex, Dec, or Bin?"
 +	 * 6. Enter the starting number
 +	 * 7. Do the conversion, display the result
 +	 * 8. Ask if they want to go again; if yes start over, if no friendly exit
 +	 */
  
  	public static void main(String[] args) {
  		
 		//Added hex to bin functionality (just for git practice)
 		BinPower binpower = new BinPower();
 		binpower.setBinary();
  		
  		HexDecBin baseConverter = new HexDecBin();
  		
 +		
  		baseConverter.setHexNumber();
  		baseConverter.convert();
  		
 +		HexDecBin obj = new HexDecBin();
 +		
 +		obj.setDecNumber();
 +		obj.convert();
  	}
  
  }
