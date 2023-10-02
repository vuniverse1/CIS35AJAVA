
public class CruiseShip extends Ship {
	private double ticket;
	private int numOfFloors;
	private String cruiseType;
	
	public CruiseShip() {}
	
	
	public CruiseShip(String name, int yearBuilt, int capacity, int length, int width, int height,
			String departureDate, String arrDate, double ticket, int numOfFloors, String cruiseType) {
		super(name, yearBuilt, capacity, length, width, height, departureDate, arrDate);
		this.ticket = ticket;
		this.numOfFloors = numOfFloors;
		this.cruiseType = cruiseType;
		// TODO Auto-generated constructor stub
	}


	public double getTicket() {
		return ticket;
	}


	public void setTicket(double ticket) {
		this.ticket = ticket;
	}


	public int getNumOfFloors() {
		return numOfFloors;
	}


	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}


	public String getCruiseType() {
		return cruiseType;
	}


	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}
	@Override
public int calcArea() {
	area = super.calcArea() * numOfFloors;
	return area; //in cruise ships, there is entertaininment on more than one floor usually
}

	@Override
	public void print() {
		super.print();
		System.out.printf("\nTicket Price: $%.2f \nNumber of Floors: %d \nCruise Type: %s", ticket, numOfFloors, cruiseType);
		
	}
}
