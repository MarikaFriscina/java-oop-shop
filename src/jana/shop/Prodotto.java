package jana.shop;

import java.text.DecimalFormat;

public class Prodotto {
	
	String marca;
	String nome;
	float prezzo;
	int iva;
	
	Prodotto(String marca, String nome, float prezzo, int iva){
		this.marca=marca;
		this.nome=nome;
		this.prezzo=prezzo;
		this.iva=iva;
	}
	
	
	public float TotConIva() {
		prezzo= prezzo+((prezzo/100)*iva);
		return prezzo;
	}
	
	DecimalFormat df = new DecimalFormat("#.00€");

	public String fraseFinale() {

		return "Il prezzo finale del prodotto " + nome + " della marca " + marca + " è di: " + df.format(TotConIva());
	}
}
