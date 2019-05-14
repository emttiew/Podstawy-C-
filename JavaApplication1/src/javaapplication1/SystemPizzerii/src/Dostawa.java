
public class Dostawa extends Dekorator {
	Pizza pizza;
	
	public Dostawa(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String order() {
		return this.pizza.order() + " + dostawa";
	}

	@Override
	public double cena() {
		return this.pizza.cena() + 5.0d;
	}

}
