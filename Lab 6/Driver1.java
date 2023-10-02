import java.util.*;
import java.io.*;

public class Driver1 {

	public static void main(String[] args) throws StudentGradingException{
		
        //create new object of students
        Student students[] = new Student[41];
       int numOfStu=0; 
        
       //students = Util.readFile("/Users/jasonvu/Downloads/students.txt", students);
        try
        {
        	
            //file path
            Util.readFile("/Users/jasonvu/Downloads/students.txt", students);
           //throw new StudentGradingException();
        
        //Student Grading Exception
        }  catch(StudentGradingException exception)
        {
            if(exception.getErrorMessage()=="java.util.NoSuchElementException")
            	
            {
            	
                exception.fixException(students, 40); //Util.stuCounter);
                
                
            }
            exception.logExceptionFile();
            System.out.printf("\nNew data and calculations");
        }
        
        if(Util.counter == 0)
        {
            System.out.printf("\nNo data");
          
       }

        if(Util.counter == 1)
        {
            System.out.printf("\nNo student data");
            
        }
       
        System.out.printf("\nSID   Q1  Q2  Q3  Q4  Q5");
        
        for(int i=1; i< 40; i++) //(Util.stuCounter); i++)
        {	//students[39].setSID(1988);
        	//int scores[]  = new int[5];
        	
            students[i].print();
            
        }
        
       // students[39].print();
       // students[38].print();
        
        //create new object of statistics
        Statistics newStats = new Statistics();
       

        newStats.findlow(students, 40);
        newStats.findhigh(students, 40);
        newStats.findavg(students, 40);

        // Print the data and statistics

        System.out.println("");
		
		newStats.print();

    
}
}

