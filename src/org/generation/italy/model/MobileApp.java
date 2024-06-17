/* PROVA DI VALUTAZIONE INTERMEDIA JAITA123
 
3. Scrivere una classe MobileApp contenente i seguenti attributi:
-nome: stringa.
-sistemaOperativo: stringa.
-prezzo: float.
-ricavoTotale: float.
-elencoRecensioni: ArrayList di Recensione.


E i seguenti metodi:

-MobileApp(String nome, String sistemaOperativo, float prezzo)
	(costruttore della classe: inizializza gli attributi nome, 
	sistemaOperativo, prezzo in base ai parametri passati verificando
	la validità dei parametri; inizializza elencoRecensioni e ricavoTotale a 0).
-download(): incrementa il ricavoTotale del valore del prezzo
-download(int numeroDownload): incrementa il ricavoTotale 
	del valore del prezzo*numeroDownload.
-riceviRecensione(Recensione recensione):l'app riceve una nuova recensione.
-float valutazioneMedia(): restituisce la media delle recensioni ricevute finora (nr stelle).
-getter e setter (verificare la validità dei dati dei parametri dei setter).

*/
package org.generation.italy.model;

import java.util.ArrayList;

public class MobileApp {
   
	/*Genero le proprietà che voglio che abbia la MobileApp o meglio gli attributi che la caratterizzano;
	scelgo di farli incapsulati (visibilità non public) cosicchè se andranno modificati necessiterà chiamare medoti public*/
	
    private String nome;
    private String sistemaOperativo;
    private float prezzo;
    private float ricavoTotale = 0;
    private double download;
    private ArrayList <Recensione> elencoRecensioni = new ArrayList <Recensione>();
    private ArrayList <Recensione> numeroValutazioni = new ArrayList <Recensione>();
    private int numeroDownload;
	private Recensione recensione;
    
    
    //Creo Costruttore MobileApp.
    public MobileApp(String nome, String sistemaOperativo, float prezzo2) {
    	super();
		this.nome = nome;
		this.sistemaOperativo = sistemaOperativo;
		try {
			setPrezzo(prezzo2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}   
		//Inizializzo elencoRecensioni e ricavoTotale a 0).
		this.elencoRecensioni = new ArrayList<Recensione>();
		this.ricavoTotale = 0;
    	} //Chiudo il Costruttore.
    
    
    //Creo il primo Metodo Download.
    public double download() {
		ricavoTotale += prezzo;
		return ricavoTotale;
	}
    
    //Creo il secondo Metodo Download.
	public double download(int numDl) {
		ricavoTotale += (prezzo * numDl);
		return ricavoTotale;
	}

    
    //Creo il Costruttore riceviRecensione e il Metodo per ricevere recensione.
    public void riceviRecensione(Recensione recensione) throws Exception {
    	
    if (recensione == null)  {
    	this.recensione = recensione;
    } else throw new Exception("Scrivere una recensione");
    
    this.elencoRecensioni.add(recensione);
    }
    

    // Creo il Costruttore valutazioneMedia e il Metodo per calcolare la valutazione media.
    public void riceviRecensione1(Recensione recensione) {
		elencoRecensioni.add(recensione);
	}
    
    public float valutazioneMedia(){
    	int counter=0, totVal=0;
    	float media=0;
    	for (Recensione r : elencoRecensioni) {
    		counter++;
    		totVal+=r.getNumeroStelle();
    		media=(totVal/counter);
    }
    	return media;
    }
    
    
    //Genero getter e setter per "nome".
    public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}

    
    //Genero getter e setter per "sistemaOperativo".
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	
	//Genero getter e setter per "prezzo" nel quale mi assicuro che il prezzo debba esssere superiore a 0.
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) throws Exception {
		if (prezzo > 0) {
		this.prezzo = prezzo;
	} else
			throw new Exception ("Prezzo non valido!");
	}

	
	//Genero getter e setter per "ricavoTotale".
	public float getRicavoTotale() {
		return ricavoTotale;
	}
	public void setRicavoTotale(float ricavoTotale) {
		this.ricavoTotale = ricavoTotale;
	}

	
	//Genero getter e setter per "elencoRecensioni".
	public ArrayList<Recensione> getelencoRecensioni() {
		return elencoRecensioni;
	}
	public void setElencoRecensioni(ArrayList<Recensione> elencoRecensioni) {
		this.elencoRecensioni = elencoRecensioni;
	}

	
	//Genero getter e setter per "numeroValutazioni"
	public ArrayList<Recensione> getNumeroValutazioni() {
		return numeroValutazioni;
	}
	public void setNumeroValutazioni(ArrayList<Recensione> numeroValutazioni) {
		this.numeroValutazioni = numeroValutazioni;
	}
	
	
	 //Genero getter e setter per "numeroDownload".
	public int getNumeroDownload() {
		return numeroDownload;
	}
	public void setNumeroDownload(int numeroDownload) {
		this.numeroDownload = numeroDownload;
	}
	
	
	//Genero getter e setter per "Recensione".
	public Recensione getRecensione() {
		return recensione;
	}
	public void setRecensione(Recensione recensione) {
		this.recensione = recensione;
	}
	

} //fine public class MobileApp





 