import java.util.ArrayList;


public class PizzaPeperoni extends Pizza {

	String size;
	public PizzaPeperoni(String size) {
		pizza += " Peperoni";
		sk³adniki = new ArrayList<>();
		sk³adniki.add("salami");
		sk³adniki.add("papryka ostra");
		sk³adniki.add("cebula");
		sk³adniki.add("ser");
		poziomOstrosci = 5;
		this.size = size;
	}
	@Override
	public double cena() {
		
		if(size == "S")
			return 25.0d;
		if(size == "M")
			return 30.0d;
		if(size == "L")
			return 35.0d;
		else
			return 0;
	}

}
