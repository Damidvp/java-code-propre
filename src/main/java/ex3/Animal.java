package ex3;

public class Animal {

	private String type;
	private String nom;
	private String comportement;

	public Animal(String type, String nom, String comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
