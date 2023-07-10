package ex2;

public class LivretA extends CompteBancaire {
	
	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde, 0);
		super.setTauxRemuneration(tauxRemuneration);
	}

	public void appliquerRemuAnnuelle(){
		super.setSolde(super.getSolde() + super.getSolde()*super.getTauxRemuneration()/100);
	}
	
	/**
	 * Enlève un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (super.getSolde() - montant > 0){
			super.setSolde(super.getSolde() - montant);
		}
	}
}
