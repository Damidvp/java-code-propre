package ex5;

public class PetiteCaisse extends Caisse {
	
	private final static Integer MAX_SIZE = 5;
	
	public PetiteCaisse(String nom) {
		super(nom);
	}

	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		if (item.getPoids() < MAX_SIZE) {
			super.getItems().add(item);
		}
	}

}
