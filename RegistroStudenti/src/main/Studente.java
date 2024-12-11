package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Studente {
	String nome;
	String cognome;
	int matricola;
	static int nMatricola = 4520;
	static ArrayList<Studente> elenco = new ArrayList<Studente>(); // ArrayList per inserire tutti gli studenti
	static Scanner scanner = new Scanner(System.in);

	public Studente(String nome, String cognome, int matricola) { // costruttore
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public Studente() { // ho dovuto creare una nuova classe Studente per poter creare l'oggetto
						// aggiungi a riga 23
	}

	public static void aggiunta(ArrayList<Studente> elenco, Scanner scanner) {
		int aggiunta = 1;
		while (aggiunta == 1) {
			Studente aggiungi = new Studente(); // creo l'oggetto aggiungi per poter richiamare i dati
			System.out.println("Inserire il nome: ");
			aggiungi.nome = scanner.nextLine();
			System.out.println("Inserire il cognome: ");
			aggiungi.cognome = scanner.nextLine();
			aggiungi.matricola = nMatricola; // aggiorna il numero di matricola che verrà assegnato al prossimo giro
			nMatricola++;
			System.out.println("ID assegnato: " + aggiungi.matricola);
			elenco.add(aggiungi);				//aggiungo all'ArrayList elenco
			System.out.println("Vuoi aggiungere un altro studente? 1) Si  2)No");
			aggiunta = scanner.nextInt();
			scanner.nextLine();
			System.out.println("");
		}
	}

	public static void visualizza(ArrayList<Studente> elenco) { // metodo per visualizzare l'elenco
		System.out.println("Gli studenti presenti in archivio sono:");
		for (Studente studente : elenco) { // per ogni studente della classe Studente scansiona l'elenco e stampa
			System.out.println(studente.nome + ", " + studente.cognome + ", " + studente.matricola);
		}
		System.out.println("");
	}

	public static void ricerca(ArrayList<Studente> elenco) { // metodo per trovare uno studente tramite la matricola
		System.out.println("Inserisci il numero di matricola:");
		int numero = scanner.nextInt();
		boolean trovato = false;
		for (Studente studente : elenco) { 		// per ogni studente della classe Studente scansiona l'elenco
			if (numero == studente.matricola) {		// se trova una corrispondenza modifica il valore di trovato
				trovato = true;
				if (trovato = true) { 	//se è stato trovato stampa il messaggio				
					System.out.println("La matricola " + studente.matricola + " corrisponde a " + studente.nome + ", "
							+ studente.cognome);
				}
			} else System.out.println("Matricola non trovata");		//se trovato rimane falso, matricola non trovata
		}
		System.out.println("");
	}
}