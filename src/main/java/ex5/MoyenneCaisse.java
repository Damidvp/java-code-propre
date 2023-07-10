package ex5;

public class MoyenneCaisse extends Caisse {
	
	private final static Integer MIN_SIZE = 5;
	private final static Integer MAX_SIZE = 20;
	
	public MoyenneCaisse(String nom) {
		super(nom);
	}

	@Override
	public void addItem(Item item) {
		if (item.getPoids() >= MIN_SIZE && item.getPoids() <= MAX_SIZE) {
			super.getItems().add(item);
		}
	}

}
