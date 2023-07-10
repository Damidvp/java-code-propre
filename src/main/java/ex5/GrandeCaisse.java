package ex5;

public class GrandeCaisse extends Caisse {
	
	private final static Integer MIN_SIZE = 20;
	
	public GrandeCaisse(String nom) {
		super(nom);
	}

	@Override
	public void addItem(Item item) {
		if (item.getPoids() >= MIN_SIZE) {
			super.getItems().add(item);
		}
	}

}
