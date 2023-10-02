
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship[] ships = new Ship[5];
		ships[0] = new CruiseShip();
		//demonstrate setter and getter methods and inheritance and polymorphism
		ships[0].setName("The Greatest");
		ships[0].setYearBuilt(2000);
		ships[0].setCapacity(825);
		ships[0].setLength(300);
		ships[0].setWidth(400);
		ships[0].setHeight(45);
		((CruiseShip) ships[0]).setNumOfFloors(3);
		ships[0].calcArea();  //polymorphism method
		ships[0].setDepartureDate("December 5th");
		ships[0].setArrDate("December 8th");
		((CruiseShip) ships[0]).setTicket(2199.99);
		((CruiseShip) ships[0]).setCruiseType("Luxury Cruise");
		//create and assign new ships to arrays
		ships[1] = new Ship("La Vida", 1976, 1000, 500, 500, 50,"03 - 04 - 2022", "03 - 05 - 2022");
		ships[1].calcArea();
		
		ships[2] = new CargoShip("Golden Cargo", 1944, 200, 250, 240, 40, "April 4th, 2022", "April 7th, 2022", "Bulk", "Food");
		ships[2].calcArea();
		
		ships[3] = new CruiseShip("Heavenly Cruise", 2018, 3000, 1000, 213, 300, "08-23-2022", "08-26,2022", 4675.49, 6, "Celebrity Eclipse");
		ships[3].calcArea();
		
		ships[4] = new CargoShip("China Trade", 1999, 250, 200, 365, 233, "September 10th, 2022", "Septempber 17th, 2022", "Bulk", "Retail Items");
		ships[4].calcArea();
		
		//printing loop
		for(int i = 0; i < ships.length; i++) {
			System.out.printf("\n");
			ships[i].print();
			System.out.printf("\n");
			
		}
	}
}