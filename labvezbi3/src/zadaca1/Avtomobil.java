package zadaca1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatikm;
	public int godnaproizvodstvo;
	public String registracija;
	
	public Avtomobil(String marka, String model, String boja, double pominatikm, int godnaproizvodstvo, String registracija) {
		this.marka=marka;
		this.model=model;
		this.boja=boja;
		this.pominatikm= pominatikm;
		this.godnaproizvodstvo= godnaproizvodstvo;
		this.registracija= registracija;
	}
	public void prvMetod() {
		System.out.println(this.marka + " " + this.model + " " + this.boja);
	}
	
	public double vtorMetod() {
		double pkm;
		pkm=this.pominatikm + 1520.25;
		return pkm;
		
	}
}
