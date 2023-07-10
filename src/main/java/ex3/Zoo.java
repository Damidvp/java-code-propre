package ex3;

import java.util.List;

public class Zoo { // Les informations types, noms et comportements peuvent être rattachées à 1
					// objet commun : Animal (création d'une nouvelle classe et d'une liste d'objets
					// Animal dans Zoo)

	private String nom;
	private List<Animal> animaux;

	public Zoo(String nom) {
		this.nom = nom;
	}

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void afficherListeAnimaux() {
		for (int i = 0; i < animaux.size(); i++) {
			System.out.println(animaux.get(i).getNom() + " " + animaux.get(i).getType() + " " + animaux.get(i).getComportement());
		}
	}

	public int taille() {
		return animaux.size();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
