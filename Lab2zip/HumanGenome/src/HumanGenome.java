

public class HumanGenome {
	private String genomeName;
	private String genes;
	private String chromosomes;
	private String cells;
	public HumanGenome() {}
	public HumanGenome(String genomeName, String genes, String chromosomes, String cells) {
		this.genomeName = genomeName;
		this.genes = genes;
		this.chromosomes = chromosomes;
		this.cells = cells;
	}
	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}
	public String getGenomeName() {
		return genomeName;
	}
	public void setGenes(String genes) {
		this.genes = genes;
	}
	public String getGenes() {
		return genes;
	}
	public void setChromosomes(String chromosomes) {
		this.chromosomes = chromosomes;
	}
	public String getChromosomes() {
		return chromosomes;
	}
	public void setCells(String cells) {
		this.cells = cells;
	}
	public String getCells() {
		return cells;
	}
	public void print() {
		System.out.printf("\n%-15s%-10s%25s%30s", genomeName, genes, chromosomes, cells);

		
	}

}
