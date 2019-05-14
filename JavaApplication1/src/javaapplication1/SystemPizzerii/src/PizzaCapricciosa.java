import java.util.ArrayList;


public class PizzaCapricciosa extends Pizza {
	String size;
	
	public PizzaCapricciosa(String size) {
		pizza += "Capricciosa";
		sk�adniki = new ArrayList<>();
		sk�adniki.add("pieczarki");
		sk�adniki.add("sos");
		sk�adniki.add("szynka");
		poziomOstrosci = 1;
		this.size = size;
	}
	@Override
	public double cena() {
		if(size == "S")
			return 22.0d;
		if(size == "M")
			return 27.0d;
		if(size == "L")
			return 32.0d;
		else
			return 0;
	}

}
