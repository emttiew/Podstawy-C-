import java.util.ArrayList;


public class PizzaPeperoni extends Pizza {

	String size;
	public PizzaPeperoni(String size) {
		pizza += " Peperoni";
		składniki = new ArrayList<>();
		składniki.add("salami");
		składniki.add("papryka ostra");
		składniki.add("cebula");
		składniki.add("ser");
		poziomOstrosci = 5;
		this.size = size;
	}
	@Override
	public double cena() {
		
		if("S".equals(size))
			return 25.0d;
		if("M".equals(size))
			return 30.0d;
		if("L".equals(size))
			return 35.0d;
		else
			return 0;
	}

}

