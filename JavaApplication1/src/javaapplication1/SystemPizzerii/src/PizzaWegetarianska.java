import java.util.ArrayList;


public class PizzaWegetarianska extends Pizza {

	String size;
	public PizzaWegetarianska(String size) {
		pizza += " Wegetaria�ska";
		sk�adniki = new ArrayList<>();
		sk�adniki.add("papryka");
		sk�adniki.add("pomidor");
		sk�adniki.add("ser");
		poziomOstrosci = 0;
		this.size = size;
	}
	
	@Override
	public double cena() {
		if(size == "S")
			return 20.0d;
		if(size == "M")
			return 25.0d;
		if(size == "L")
			return 30.0d;
		else
			return 0;
	}

}
