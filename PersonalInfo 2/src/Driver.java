import java.util.Scanner;
public class Driver {
		     static Scanner sc = new Scanner(System.in); // scanner
		    public static void main(String [] args)
		    {
		        Driver d1 = new Driver(); 
		        Person jason = d1.readValue();  //3 instances of person object
		        jason.print();
		        Person rod = d1.readValue();
		        rod.print();
		        Person joshua = d1.readValue();
		        joshua.print();
		    }
		    public Person readValue() {
		        //use methods in Scanner to read values - create a Person object and return it.
		    	System.out.println("Enter your name: "); 
		    	String name = sc.nextLine();
		    	System.out.println("Enter your address: ");
		    	String address = sc.nextLine();
		    	System.out.println("Enter your age: ");
		    	String age = sc.nextLine();
		    	System.out.println("Enter your phone number: ");
		    	String phone = sc.nextLine();
		    	Person person = new Person(); //new person object
		    	person.setName(name);  //set values
		    	person.setPhone(phone); 
		    	person.setAddress(address);
		    	person.setAge(age);
		    	return person;
		    } }
	