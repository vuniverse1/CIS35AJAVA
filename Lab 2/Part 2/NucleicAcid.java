public class NucleicAcid {
	private String name;
	private String chemicalForm;
	private float molarMass;
	private float density;
	public NucleicAcid() {} //default constructor
	public NucleicAcid(String name, String chemicalForm, float molarMass, float density) { //constructor w variables
		this.name = name;
		this.chemicalForm =chemicalForm;
		this.molarMass = molarMass;
		this.density = density;
	}
	public String getName() { //getter method
		return name;
	}
	public void setName(String name) { //setter method
		this.name = name;
	}
	public String getChemicalForm() {
		return chemicalForm;
	}
	public void setChemicalForm(String chemicalForm) {
		this.chemicalForm = chemicalForm;
	}
	public float getMolarMass() {
		return molarMass;
	}
	public void setMolaMass(float molarMass) {
		this.molarMass = molarMass;
	}
	public float getDensity() {
		return density;			
	}
	public void setDensity(float density) {
		this.density = density;
	}
	public void print() { //print method
		System.out.printf("%-15s%n Chemical Formula: %s%n Molar Mass: %.3f g/mol%n Density: %.3f g/cm3%n      %n", name, chemicalForm, molarMass, density);
	}}
