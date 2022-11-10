package zadaca1;

public class Main {

	public static void main(String[] args) {
		Avtomobil avt = new Avtomobil("Honda", "Civic", "Crna", 154500, 2008, "BT-3895-CE");
		
		avt.prvMetod();
		
		System.out.println(avt.vtorMetod());;
	}

}
