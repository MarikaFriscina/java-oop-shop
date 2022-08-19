package jana.shop;

public class Main {

	public static void main(String[] args) {
		
		//ESERCIZIO BASE
		Prodotto[] shop=new Prodotto[5];
		
		Prodotto prod1 = new Prodotto("Bic", "Accendino", 1.05f, 23);
		Prodotto prod2 = new Prodotto("AZ", "Dentifricio", 2.50f, 22);
		Prodotto prod3 = new Prodotto("Coccolino", "Ammorbidente", 3.20f, 23);
		Prodotto prod4 = new Prodotto("Panificio Michelangelo", "Pane senza glutine", 1.50f, 5);
		Prodotto prod5 = new Prodotto("Roventa", "Piastra per capelli", 10.70f, 23);

		shop[0] = prod1;
		shop[1] = prod2;
		shop[2] = prod3;
		shop[3] = prod4;
		shop[4] = prod5;
		
		
		for (int i = 0; i < shop.length; i++) {

			System.out.println(shop[i].fraseFinale());
		}
		


	}

}
