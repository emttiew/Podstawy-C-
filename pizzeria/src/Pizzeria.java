import java.util.ArrayList;


public class Pizzeria {

	private static Pizzeria pizzeria = null;
	private String adres;
	private ArrayList<Pizza> listaZamowien;
	private Pizzeria(){
		this.listaZamowien = new ArrayList<>();
	}

	public static Pizzeria getPizzeria() {
		if(pizzeria == null)
			pizzeria = new Pizzeria();
		return pizzeria;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	} 
	
	public void newOrder(Pizza pizza){
		this.listaZamowien.add(pizza);
	}

	public void pokazZamowienia() {
		String res = "";
		if(listaZamowien.size() > 0){
			for(int i = 0; i < listaZamowien.size(); i++){
				res = res + "\n" + (i+1) + " " + listaZamowien.get(i).order() + " " + listaZamowien.get(i).cena() + " PLN.";
			}
			System.out.println(res);
		}else{
			System.out.println("Brak zamówień.");
		}
	}
}
