public class GenomeInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanGenome Bob = new HumanGenome("\"Human Bob\"", "20000", "46", "76");
		HumanGenome Sally = new HumanGenome("\"Human Sally\"", "20000", "46", "120");
		HumanGenome Sri = new HumanGenome("\"Human Sri\"", "20000", "46", "75");
		System.out.printf("%-15s%-10s%25s%30s", "GenomeName", "NumberofGenes", "NumberofChromosomes", "NumberofCells(Trillions)");
		Bob.print();
		Sally.print();
		Sri.print(); }}
