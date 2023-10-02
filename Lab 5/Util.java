import java.util.*;
import java.io.*;
public class Util {
static int stuCounter;
public static Student [] readFile(String filename, Student [] stu) {
//Reads the file and builds student array.
int counter = 0;
//private boolean DEBUG = true;
try {
	//Open the file using FileReader Object.
BufferedReader buff = new BufferedReader(new FileReader(filename));
boolean eof = false;
while (!eof) {
String line = buff.readLine(); //In a loop read a line using readLine method.

if (line == null)
eof = true;
else{
	//if(DEBUG)
// System.out.println(line);
stu[counter]= new Student();
StringTokenizer st = new StringTokenizer(line); //Tokenize each line using StringTokenizer Object
if(counter > 0) { //skip header line and cannot exceed 40 students
	
	
while(st.hasMoreTokens()){
	String id = st.nextToken(); 
stu[counter].setSID(Integer.parseInt(id)); //Value is then saved in the right property of Student Object.
int[] quiz= new int[5];
for(int i =0; i < quiz.length; i++){
quiz[i]= Integer.parseInt(st.nextToken()); //Each token is converted from String to Integer using parseInt method
}
stu[counter].setScores(quiz); //Value is then saved in the right property of Student Object.

}
}


counter++;
}}

buff.close();
} catch (IOException e) {
System.out.println("Error -- " + e.toString());
}
stuCounter = counter -1;
return stu;
}

}





