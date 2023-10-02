import java.util.Scanner;
/**
 * 
 * @author Jason Vu
 * Java Programming - CIS D035A - 11Y
 * Assignment -1
 * Due Date: 10-2-2022
 * Date Submitted: 9-29-2022
 */
public class TempConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //scanner
		System.out.print("Enter Centigrade temperature: "); //ask user for temperature in Celsius
		double cTemp = scan.nextDouble(); //declare temperature as double type
		System.out.println(cTemp + " degrees Centigrade is " + (32.00 + (cTemp*(180.00/100.00)) + " degrees Fahrenheit.")); //print Fahrenheit conversion
		System.out.print("Enter Fahrenheit temperature: "); //ask user for Fahrenheit temperature
		double fTemp = scan.nextDouble(); //declare temperature as double type
		System.out.println(fTemp + " degrees Fahrenheit is " + ((fTemp - 32.00)*(5.00/9.00)) + " degrees Centigrade."); //print celsius conversion
		

	}

}
