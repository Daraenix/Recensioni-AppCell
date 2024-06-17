/* PROVA DI VALUTAZIONE INTERMEDIA JAITA12

3. Nella classe Main:
-Chiedere all'utente di inserire nome, sistemaOperativo, prezzo dell'app.
-Creare un oggetto della classe MobileApp passando al costruttore i parametri inseriti dall'utente.
-Creare un menu con le seguenti voci:

1)Download singolo.

2)Download multiplo (in questo caso chiedere all'utente il numero di download da effettuare).

3)Ricevi recensione (in questo caso chiedere all'utente il nome, il stelle da assegnare, il testo della recensione;
impostare la data automaticamente al giorno corrente)

4)Visualizza recensioni.

5)Esci.

-Dopo ogni chiamata ad una voce di menu visualizzare i dati della mobile app (valutazione media, ricavo totale)
*/
package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.MobileApp;
import org.generation.italy.model.Recensione;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String nome;
		String sistemaOperativo;
		float prezzo;
		int scelta;
		boolean risposta = false;
		
		System.out.println("Benvenuto nel programma di creazione di una nuova applicazione!");
		System.out.println("Inserire nome dell'app: ");
		nome = sc.nextLine();
		System.out.println("Inserire il sistema operativo: ");
		sistemaOperativo = sc.nextLine();
		System.out.println("Inserire il prezzo: ");
		prezzo = sc.nextFloat();
		sc.nextLine();
		
		
		MobileApp app = new MobileApp(nome, sistemaOperativo, prezzo);
		while (app.getPrezzo() <= 0) {
			app = new MobileApp(nome, sistemaOperativo, prezzo);
		}
		System.out.println("Applicazione creata con successo!");
		do {
			System.out.println("Sceglire che operazione si vuole effettuare: ");
			System.out.println("1) Download singolo");
			System.out.println("2) Download multiplo");
			System.out.println("3) Scrivi una recensione");
			System.out.println("4) Visualizza recensioni");
			System.out.println("5) Esci");
			scelta = sc.nextInt();
			sc.nextLine();
			
			//Creazione Menù.
			switch (scelta) {
			
			//Download Singolo.
			case 1: {
				System.out.println("App scaricata! Ricavo totale: "+app.download());
				break;
			}
			//Download Mutliplo.
			case 2: {
				System.out.println("Inserire quantità di download: ");
				int qta=sc.nextInt();
				sc.nextLine();
				System.out.println("App scaricate! Ricavo totale: "+app.download(qta));
				break;
			}
			//Scrivi recensione
			case 3 :{
				System.out.println("Inserisci il Nome Utente");
				String username=sc.nextLine();
				System.out.println("Inserisci il numero di stelle da assegnare: ");
				int numStelle=sc.nextInt();
				sc.nextLine();
				System.out.println("Inserisci il testo della recensione: ");
				String commento=sc.nextLine();
				Recensione r=new Recensione(null, username, numStelle, commento);
				app.riceviRecensione(r);
			
				break;
			}
			//Visualizza Recensioni
			case 4 :{//visualizza lista
				for (Recensione r:app.getelencoRecensioni()) {
				System.out.println("Recensione: \nNumero di Stelle: ");
				int i;
				//ciclo for per scrivere le stelline
				for (i=0; i<r.getNumeroStelle(); i++)
					System.out.print("★");
				for (i=i; i<5; i++) {
					System.out.print("☆");
				}
				System.out.println("");
				System.out.println(r.toString());
				}
				break;
			}
			//Esci.
			case 5: {
				risposta = true;
			}
			}

		} while (!risposta);

	

		  
		  
} //Chiusura public static void
} //Chiusura public class Main