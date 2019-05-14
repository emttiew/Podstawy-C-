import java.util.ArrayList;


public abstract class Pizza {
	protected String pizza = "Pizza";
	protected ArrayList<String> składniki;
	protected int poziomOstrosci;
	public String order(){
		return pizza;
	}
	
	public abstract double cena();
	
}
