import java.util.ArrayList;


public class PizzaPeperoni extends Pizza {

	String size;
	public PizzaPeperoni(String size) {
		pizza += " Peperoni";
		sk�adniki = new ArrayList<>();
		sk�adniki.add("salami");
		sk�adniki.add("papryka ostra");
		sk�adniki.add("cebula");
		sk�adniki.add("ser");
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
