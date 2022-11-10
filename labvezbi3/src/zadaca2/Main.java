package zadaca2;

public class Main {

	public static void main(String[] args) {
			Fakultet faks1 = new Fakultet();
			faks1.nazivNaFakultet = "FIKT";
			faks1.brojNaSmerovi = 2;
			faks1.brojNaStudenti = 200;
			faks1.dekan = " Aleksandar Markoski ";
			faks1.sediste = " Bitola ";
			
			faks1.prvMetod();
			System.out.println(" Namalen broj na studenti : " + faks1.vtorMetod(40));
			faks1.tretMetod();
			
			Fakultet faks2 = new Fakultet();
			faks2.nazivNaFakultet = " PFB ";
			faks2.brojNaSmerovi = 4;
			faks2.brojNaStudenti = 370;
			faks2.dekan = " Elena Trajkovska ";
			faks2.sediste = " Bitola ";
			
			faks2.prvMetod();
			System.out.println(" Namalen broj na studenti : " + faks2.vtorMetod(60));
			faks2.tretMetod();		

	}

}
