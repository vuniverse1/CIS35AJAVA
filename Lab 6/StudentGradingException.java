import java.util.*;
import java.io.*;
public class StudentGradingException extends Exception{
	private int errorNumber;
	private String errorMessage;
	
static Scanner sc = new Scanner(System.in);

//Centralize capture of all exceptions
public StudentGradingException() {
	super();
	 print();
}
public StudentGradingException(int errorNumber) {
	super();
	this.errorNumber = errorNumber;
	print();
}
public StudentGradingException(String errorMessage) {
	super();
	this.errorMessage = errorMessage;
	 print();
}
public StudentGradingException(int errorNumber, String errorMessage) {
    super();
    this.errorNumber = errorNumber;
    this.errorMessage = errorMessage;
    print();
}
public int getErrorNumber() {
    return errorNumber;
}

public void setErrorNumber(int errorNumber) {
    this.errorNumber = errorNumber;
}

public String getErrorMessage() {
    return errorMessage;
}

public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
}
public void print() {
    System.out.println("StudentGradingException [errorno = " + errorNumber + ", errormsg = " + errorMessage);
}
//Fix at least one exception.
public void fixException(Student[] lab2, int i) {
	lab2[i] = new Student();
	//System.out.println("Enter SID: ");
	//int ID = Integer.parseInt(sc.nextLine());
	//lab2[39].setSID(1947);
	System.out.println("Enter test scores for student " + lab2[39].getSID());
	//StringTokenizer st = new StringTokenizer(userInput);
	//int a = 0;
	
	int scores[] = new int[5];
	scores[0] = Integer.parseInt(sc.nextLine());
	scores[1] = Integer.parseInt(sc.nextLine());
	scores[2] = Integer.parseInt(sc.nextLine());
	scores[3] = Integer.parseInt(sc.nextLine());
	scores[4] = Integer.parseInt(sc.nextLine());
	
	lab2[39].setScores(scores);
	
	 
}


//Logs exceptions in a text file
public void logExceptionFile() {
	try {
		FileWriter fw = new FileWriter("lab6exceptionlog.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(errorMessage);
		bw.close();
		bw.newLine();
	}
	catch(IOException e) {
		System.out.print(e.toString());
	}
}


}