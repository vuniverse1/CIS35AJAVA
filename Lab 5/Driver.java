import java.util.Scanner;

public class Driver {     
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Populate the array
			Student lab2[] = new Student[60]; //create extra elements to run code correctly regarding assingment needs
			int numOfStu=0;
			lab2 = Util.readFile("/Users/jasonvu/Downloads/students.txt", lab2);
			
			numOfStu = Util.stuCounter; // find number of lines from file. which will show number of students in array.
			if(numOfStu>40) {
				numOfStu = 40;
			
				System.out.printf("Only able to calculate up to 40 scores, anything after is ignored."); 
		}
			if(numOfStu ==0) {
				System.out.printf("\nThere are no student scores."); //when there is no data
				}
			
			System.out.println("");
			System.out.printf("\nSID   Q1  Q2  Q3  Q4  Q5");
			for(int i = 0; i<numOfStu; i++){ // print student data 
			lab2[i].print(); 
			}
			//add calls to find high and find average
			
			Statistics statlab2 = new Statistics(); //create statistics object
			//call methods
			statlab2.findlow(lab2,numOfStu); 
			statlab2.findhigh(lab2,numOfStu);
			statlab2.findavg(lab2, numOfStu);
			
			System.out.println("");
			System.out.printf("%nEnter 1 to see lowest scores. %nEnter 2 to see highest scores %nEnter 3 to see average scores. %nEnter 4 to see all information. ");
			int option = sc.nextInt();
			statlab2.print(option); // print statistics of students
			}

	}
