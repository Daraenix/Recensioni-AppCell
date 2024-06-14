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
	scelgo di farli incapsulati (visibilità non public) cosicchè se andranno modificati necessiterà chiamare medoti public*/
	
    private LocalDate data;
    private String nomeUtente;
    private int numeroStelle;
    private String testo;

    // Creo Costruttore.
    public Recensione(LocalDate data, String nomeUtente, int numeroStelle, String testo) throws Exception {
    
    //Gli if/else di seguito mi sono utili per controllare che i dati inseriti dall'utente siano validi o meno.
    	if (data == null) {
        	this.data=data;
        }  else { 
        	throw new Exception("La data non può essere null");
        }
        
        if (nomeUtente == null || nomeUtente.isEmpty()) {
        	this.nomeUtente = nomeUtente;
        } else {
        	throw new Exception("Il nome utente non può essere null o vuoto");
        }
        
        
        if (numeroStelle < 1 || numeroStelle > 5) {
        	this.numeroStelle = numeroStelle;
        } else {
        	throw new Exception ("Il numero di stelle deve essere compreso tra 1 e 5");
        }
        
        
        if (testo == null || testo.isEmpty()) {
        	this.testo = testo;
        } else {
            throw new Exception("Il testo non può essere null o vuoto");
        }
       } //Chiudo Costruttore

    
    //Genero getter e setter per "data".
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	//Genero getter e setter per "nomeUtente".
	public String getNomeUtente() {
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	
	//Genero getter e setter per "numeroStelle".
	public int getNumeroStelle() {
		return numeroStelle;
	}
	public void setNumeroStelle(int numeroStelle) {
		this.numeroStelle = numeroStelle;
	}
	
	
	//Genero getter e setter per "testo".
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
		return "Recensione [data=" + data + ", nomeUtente=" + nomeUtente + ", numeroStelle=" + numeroStelle + ", testo=" + testo + "]";
	}

 } //fine classe Recensione.