
public class CargoShip extends Ship{
	private String loadingType;
	private String cargoType;
	public CargoShip() {}

	public CargoShip(String name, int yearBuilt, int capacity, int length, int width, int height, 
			String departureDate, String arrDate, String loadingType, String cargoType) {
		super(name, yearBuilt, capacity, length, width, height, departureDate, arrDate);
		this.loadingType = loadingType;
		this.cargoType = cargoType;
		// TODO Auto-generated constructor stub
	}

	public String getLoadingType() {
		return loadingType;
	}

	public void setLoadingType(String loadingType) {
		this.loadingType = loadingType;
	}

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("\nLoading Type: %s \nCargo Type: %s", loadingType, cargoType);
		
	}
}
