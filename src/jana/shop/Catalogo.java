package jana.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ESERCIZIO BONUS
		/*Aggiungere una classe Catalogo che contiene il metodo main (in modo che sia eseguibile).
		In questa classe chiedere all’utente di darci i dettagli di 5 prodotti da aggiungere al catalogo.
		Al termine dell’inserimento stampare il catalogo con tutti i prodotti inseriti.
		BONUS++ :puntare_a_destra: stampare il catalogo in forma tabellare come nell’immagine in allegato, aggiungendo eventuali opportuni metodi alla classe Prodotto
		SUGGERIMENTI :lente:
		usare i metodi nextInt() e nextDouble() dello Scanner in un ciclo può creare dei problemi perchè non svuota correttamente il buffer. Per ovviare a questi problemi utilizzare sempre il metodo nextLine() e convertire la stringa ottenuta in int o double usando i metodi Integer.parseInt(String s) e Double.parseDouble(String s)
		per formattare le stringhe in forma tabellare in java si possono usare i metodi System.out.format() e String.format()  . Trovate degli esempi qui e ovviamente potete cercare altri esempi e documentazione online
		EDIT: rimuovo il link all’esempio su come formattare le stringhe perché è troppo complesso e può essere fuorviante. Domani comunque lo vediamo insieme in correzione*/
		
		String[] marca=new String[5];
		String[] nome=new String[5];
		float[] prezzo=new float[5];
		int[] iva=new int[5];
		
		Scanner scan=new Scanner(System.in);
		Prodotto prod = new Prodotto(null, null, 0, 0);
		Prodotto[] shop=new Prodotto[5];
		
		for(int i=0;i<5;i++) {
			
				System.out.println("DIMMI I DETTAGLI DEL PRODOTTO N "+(i+1)+" DA AGGIUNGERE AL CATALOGO: ");
				System.out.println("Marca:");
				marca[i]= scan.nextLine();
				System.out.println("Nome:");
				nome[i]= scan.nextLine();
				System.out.println("Prezzo:");
				prezzo[i]= Float.parseFloat(scan.nextLine());
				System.out.println("IVA:");
				iva[i]= Integer.parseInt(scan.nextLine());
				
				
				prod = new Prodotto(marca[i], nome[i], prezzo[i], iva[i]);
				shop[i] = prod;	
				
				
	}
	
		for(int a = 0; a < shop.length; a++) {
			System.out.println(shop[a].catalogo());
		}
		
		
		scan.close();
	}

}
