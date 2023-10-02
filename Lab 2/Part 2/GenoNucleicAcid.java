
public class GenoNucleicAcid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NucleicAcid cytosine = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f); //new NucleicAcid object
		cytosine.print(); //print object called print()
		NucleicAcid adenine = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
		adenine.print();
		NucleicAcid guanine = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
		guanine.print();
		NucleicAcid thymine = new NucleicAcid("Thymine", "C5H6N2O2", 126.113f,	1.223f );
		thymine.print();
		NucleicAcid uracil = new NucleicAcid("Uracil", "C4H4N2O2", 112.08676f, 1.32f);
		uracil.print();

	}

}
