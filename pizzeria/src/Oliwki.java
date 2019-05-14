
public class Oliwki extends Dekorator {
	Pizza pizza;
	
	public Oliwki(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String order() {
		return this.pizza.order() + " + oliwki";
	}

	@Override
	public double cena() {
		return this.pizza.cena() + 3.30d;
	}

}
