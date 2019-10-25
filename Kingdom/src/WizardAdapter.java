/**
 * Class WizardAdapater implements the Warrior interface and its required methods
 * @author Joshua Molina
 *
 */
public class WizardAdapter implements Warrior {
	//Private Wizard object used to hold the sent-in Wizard in the parameterized constructor rather than create a new Wizard every time it's called
	private Wizard wizard;
	
	/**
	 * Parameterized constructor that requires a Wizard object and will set the private Wizard object wizard to the sent-in Wizard w
	 */
	public WizardAdapter(Wizard w) {
		wizard = w;
	}
	
	/**
	 * Utilizes the attack method from the Warrior interface and calls the method performSpell using wizard
	 */
	public void attack() {
		wizard.performSpell();
	}
	
	/**
	 * Utilizes the defend method from the Warrior interface and calls the method heal using wizard
	 */
	public void defend() {
		wizard.heal();
	}
}