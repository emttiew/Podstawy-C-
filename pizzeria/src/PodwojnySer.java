public class PodwojnySer extends Dekorator {
	Pizza pizza;
	
	public PodwojnySer(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String order() {
		return this.pizza.order() + " + podwójny ser";
	}

	@Override
	public double cena() {
		return this.pizza.cena() + 3.50d;
	}

}
