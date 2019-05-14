
public class Dodatkowykurczak extends Dekorator {
	Pizza pizza;
	
	public Dodatkowykurczak(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String order() {
		return this.pizza.order() + "+ dodatkowy kurczak";
	}

	@Override
	public double cena() {
		return this.pizza.cena() + 4.20d;
	}

}