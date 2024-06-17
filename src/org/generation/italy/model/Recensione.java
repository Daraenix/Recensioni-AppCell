/* PROVA DI VALUTAZIONE INTERMEDIA JAITA123
 
2. Scrivere una classe “Recensione” che contiene i seguenti attributi:
-LocalDate data 
-String nomeUtente
-int numeroStelle 
-String testo
e opportuni metodi costruttore, getters, setters, facendo in modo che 
non si possa creare un’istanza non valida di Recensione 
(ad esempio il numero di stelle deve essere compreso tra 1 e 5).
*/
package org.generation.italy.model;

import java.time.LocalDate;

public class Recensione {
   
	/*Genero le proprietà che voglio che abbia la Recensione o meglio gli attributi che la caratterizzano;
	scelgo di farli incapsulati (visibilità non public) cosicchè se andranno modificati necessiterà chiamare medoti public.*/
	
    private LocalDate data;
    private String nomeUtente;
    private int numeroStelle;
    private String testo;

    // Creo Costruttore.
    public Recensione(LocalDate data, String nomeUtente, int numeroStelle, String testo) {
    	super();
    	this.data = LocalDate.now();
    	try {
    		this.numeroStelle = setNumeroStelle(numeroStelle);
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	this.nomeUtente = nomeUtente;
    	this.testo = testo;
    	
    }//chiudo Costruttore.
    
    
    //Genero Getter e Setter per data.
	public LocalDate getData() {
		return data;
	}
	public LocalDate settData() {
		return data;
	}
	
	
	//Genero Getter e Setter per nomeUtente.
	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
			
	}
	
	//Genero Getter e Setter per numeroStelle.
	public int getNumeroStelle() {
		return numeroStelle;
	}
	public int setNumeroStelle(int numeroStelle) throws Exception { 
		//Verifica che il valore di numeroStelle vada da 1a5.
		if (numeroStelle > 0 && numeroStelle < 6)
			return numeroStelle;
		else
			throw new Exception("Numero stelle non valido.");
	}
	
	//Genero Getter e Setter per testo.
	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	/*Genero un metodo toString per rappresentare un oggetto come una stringa,
	così da stampare la Recensione con i suoi attributi quando si dovrà mostrare all'utente.*/
	@Override
	public String toString() {
		return "Data: " + data +"\nNome Utente: " + nomeUtente + "\nRecensione: \n''"
				+ testo + "''";
	}

}//fine classe Recensione.