package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new PetiteCaisse("Petits objets"));
		caisses.add(new MoyenneCaisse("Moyens objets"));
		caisses.add(new GrandeCaisse("Grands objets"));
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		for(Caisse caisse : caisses) {
			caisse.addItem(item); //On part du principe qu'on ne peut avoir que ces 3 caisses
		}
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		return caisses.get(0).getTaille() + caisses.get(1).getTaille() + caisses.get(2).getTaille();
	}
}
