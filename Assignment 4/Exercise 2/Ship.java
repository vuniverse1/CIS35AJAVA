
public class Ship {
	private String name;
	private int yearBuilt;
	private int capacity;
	private int length;
	private int width;
	private int height;
 int area;
	private String departureDate;
	private String arrDate;

	

	public Ship() {}
	
	
	public Ship(String name, int yearBuilt, int capacity, int length, int width, int height, 
			String departureDate, String arrDate) {
		
		this.name = name;
		this.yearBuilt = yearBuilt;
		this.capacity = capacity;
		this.length = length;
		this.width = width;
		this.height = height;
		this.departureDate = departureDate;
		this.arrDate = arrDate;
	}

	public void setName(String name) {
	this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrDate() {
		return arrDate;
	}
	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}
	public int calcArea() {
		area = width * length;
		return area;
	}
	
	public void print()
	{ 
		System.out.printf("Name: %s \nYear Built: %d \nCapacity: %d \nLength: %dft. \nWidth %dft. \nHeight %dft. \nSurface Area: %dsq. ft. \nDeparture Date: %s \nArrival Date: %s",
				name, yearBuilt, capacity, length, width, height, area, departureDate, arrDate);
		
		}
}

