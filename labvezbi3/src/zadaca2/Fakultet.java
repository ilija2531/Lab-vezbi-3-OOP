package zadaca2;

public class Fakultet {
	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sediste;
	
	public void prvMetod() {
		System.out.println("Zgolemen  broj na studenti : " + (this.brojNaStudenti + 50));
	}
	public int vtorMetod(int namali) {
		int namalenavrednost = this.brojNaStudenti - namali;
		return namalenavrednost;
	}
	public void tretMetod() {
		System.out.println(" Naziv na fakultet: " + this.nazivNaFakultet + " , sediste: " + this.sediste);
	}
}
