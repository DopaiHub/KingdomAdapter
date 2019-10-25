/**
 * 
 * @author Joshua Molina
 *
 */
public class WizardAdapter implements Warrior {
	private Wizard wizard;
	
	public WizardAdapter(Wizard w) {
		wizard = w;
	}
	
	public void attack() {
		wizard.performSpell();
	}
	
	public void defend() {
		wizard.heal();
	}
}