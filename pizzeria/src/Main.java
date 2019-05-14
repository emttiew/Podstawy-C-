import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Pizzeria pizzeria = Pizzeria.getPizzeria();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("###############################");
		System.out.println("Witamy kliencie!");
		int wybor = 0;
		
		
		do{
			System.out.println("\nJeśli chcesz zamówić pizzę wybierz \'1\'");
			wybor = Integer.parseInt(sc.nextLine());
			
			if(wybor != 1)
				break;
			
			Pizza pizza;
			
			int pizzaW = 0;
			do{
				System.out.println("[1] Pizza Wegetariańska");
				System.out.println("[2] Pizza Peperoni");
				System.out.println("[3] Pizza Capricciosa");
				pizzaW = Integer.parseInt(sc.nextLine());
			}while(pizzaW != 1 && pizzaW != 2 && pizzaW != 3);
			String size;
			System.out.println("Wprowadz rozmiar: S M L");
			size = sc.nextLine();
			
			if(pizzaW == 1)
				pizza = new PizzaWegetarianska(size);
			else if(pizzaW == 2)
				pizza = new PizzaPeperoni(size);
			else
				pizza = new PizzaCapricciosa(size);
			
			System.out.println("Może jakieś dodatki? (wprowadz np. 2 3 lub 0 w przeciwnym wypadku)");
			
			String str;
			System.out.println("[1] Dodatkowy kurczak");
			System.out.println("[2] Oliwki");
			System.out.println("[3] Podwójny ser");
			str = sc.nextLine();
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == '1')
					pizza = new Dodatkowykurczak(pizza);
				if(str.charAt(i) == '2')
					pizza = new Oliwki(pizza);
				if(str.charAt(i) == '3')
					pizza = new PodwojnySer(pizza);	
			}
			System.out.println("Czy z dostawą do domu? wybierz \'1\' jesli tak");
			int val = Integer.parseInt(sc.nextLine());
			if(val == 1)
				pizza = new Dostawa(pizza);
			
			pizzeria.newOrder(pizza);
			
		}
		while(wybor == 1);
		
		System.out.println("\nLista zamówień:");
		pizzeria.pokazZamowienia();
		
		System.out.println("Dziękujemy i zapraszamy ponownie");
			
	}

}
