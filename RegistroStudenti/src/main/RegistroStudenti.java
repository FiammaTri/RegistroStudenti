/*
 * Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.Studente;

public class RegistroStudenti extends Studente {

	public RegistroStudenti(String nome, String cognome, int matricola) {
		super(nome, cognome, matricola); // richiamo il costruttore
	}

	public static void main(String[] args) {

		int scelta;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(
					"Che vuoi fare? \n 1) Aggiungere uno studente \n 2) Visualizzare elenco studenti \n 3) Ricerca tramite matricola \n 4) Esci");
			scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
			case 1:
				aggiunta(elenco, scanner);		//richiamo il metodo usando gli attributi elenco e scanner
				break;
			case 2:
				visualizza(elenco);		//richiamo il metodo usando l'attributo elenco
				break;
			case 3:
				ricerca(elenco);		//richiamo il metodo usando l'attributo elenco
				break;
			case 4:
				System.out.println("Arrivederci!");
				System.exit(0);
			}
		} while (scelta > 0 && scelta < 4);
		scanner.close();
	}

}
