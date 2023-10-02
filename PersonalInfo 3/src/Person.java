public class Person {
	private String name;
	private String address;
	private String age;
	private String phone;
	Person(){} // default constructor w no parameters
Person(String name, String address, String age, String phone) // overloaded constructors w  parameters
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
	}
	Person(String name, String address, String age){ //overloaded constructor
		this.name = name;
		this.address = address;
		this.age = age;
	}
	Person(String name, String age){ //overload constructor
		this.name = name;
		this.age = age;
		
	}

	
	//setter and getter methods
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAge(String age) {
		this.age = age; }
	
	public String getAge() {
		return age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	//print method
	public void print() {
		
		System.out.println( "Name: " + name + " " + "Address: " + address + " " + "Age: " + age  + " " + "Phone #: " + phone);
		System.out.println();
	}
}
