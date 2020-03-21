package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	
	List<VoceDizionario> dizionario = new ArrayList<>();

	public AlienDictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String aggiungitraduci(String testoInput) {
		// TODO Auto-generated method stub
		
		testoInput.toLowerCase();
		
		for (Character c : testoInput.toCharArray()) {
			
			if(!Character.isAlphabetic(c) && c!=' ') {
				
				return "Inserisci solo caratteri alfabetici\n";
			}
		}
		
		if(testoInput.contains(" ")) {
			
			aggiungiVoce(testoInput);
			
			return "Voce aggiunta correttamente\n";			
		}
		else {
			
			return traduciParola(testoInput);
		}
	}

	private String traduciParola(String testoInput) {
		// TODO Auto-generated method stub
		
		int indice = dizionario.indexOf(new VoceDizionario(testoInput, null));
		
		if(indice != -1) {
			
			return dizionario.get(indice).toString();
		}
		else {
			
			return "Parola non presente nel dizionario\n";
		}
	}

	private void aggiungiVoce(String testoInput) {
		// TODO Auto-generated method stub
		String alienWord = testoInput.substring(0, testoInput.indexOf(" "));
		String italianWord = testoInput.substring(testoInput.indexOf(" ")+1);
		
		VoceDizionario nuovaVoce = new VoceDizionario(alienWord, italianWord);
		
		dizionario.add(nuovaVoce);
	}

	public void reset() {
		// TODO Auto-generated method stub
		
		dizionario.clear();
	}

	
	
	
	

}
