import java.util.Scanner;
/**
 * 
 * @author Jason 
 *
 */
public class Bills {
	public static void main(String[] args) {
		// declaring variables
		double tv = 400.00; 
		double vcr = 220.00;
		double controller = 35.20;
		double cd = 300.00;
		double tapeRecorder = 150.00;
		Scanner scan = new Scanner(System.in); //scanner 
		System.out.print("How many TV's were sold? "); //user input
		int numTv = scan.nextInt(); //user input is an integer
		System.out.print("How many VCR's were sold? "); //user input
		int numVcr = scan.nextInt(); //user input is an integer
		System.out.print("How many remote controller's were sold? "); //user input
		int numController = scan.nextInt(); //input is an integer type
		System.out.print("How many CD's were sold? "); //user input
		int numCd = scan.nextInt(); //user input is an integer type
		System.out.print("How many Tape Recorder's were sold? "); //user input
		int numTape = scan.nextInt(); //user input is an integer type
		System.out.printf("%-5s%-10s%15s%15s\n","QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE"); //printing the heading for columns
		System.out.printf("%-5d%-10s%15.2f%16.2f\n", numTv, "TV", tv, tv*numTv); //print the TV info
		System.out.printf("%-5d%-10s%15.2f%16.2f\n", numVcr, "VCR", vcr, vcr*numVcr); //print the VCR info
		System.out.printf("%-5d%-10s%8.2f%16.2f\n", numController, "Remote Controller", controller, controller*numController); //print the remote control info
		System.out.printf("%-5d%-10s%15.2f%16.2f\n", numCd, "CD Player", cd, cd*numCd); //print the CD player info
		System.out.printf("%-5d%-10s%12.2f%16.2f\n", numTape, "Tape Recorder", tapeRecorder, tapeRecorder*numTape); //print the tape recorder info
		System.out.printf("%35s%12.2f\n", "SUBTOTAL", (tv*numTv+vcr*numVcr+controller*numController+cd*numCd+tapeRecorder*numTape) ); // print sub total with two decimal places
		System.out.printf("%30s%15.2f\n", "TAX", (tv*numTv+vcr*numVcr+controller*numController+cd*numCd+tapeRecorder*numTape)*0.0875); //print tax amount with two decimal places
		System.out.printf("%38s%9.2f\n", "TOTAL PRICE", (tv*numTv+vcr*numVcr+controller*numController+cd*numCd+tapeRecorder*numTape)*1.875); //print final price with two decimal places
}

}
