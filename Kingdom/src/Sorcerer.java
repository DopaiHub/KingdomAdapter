/**
* Sorcerer class implements Wizard and has performSpell and heal methods
* @author Steven Maxwell
*
*/
public class Sorcerer implements Wizard {

	/**
	* performSpell method prints a spell
	*/
	public void performSpell() {
		System.out.println("Casting Spell: I put a spell on you, and now you're gone");
	}
	/**
	* heal method prints a heal
	*/
	public void heal() {
		System.out.println("Healing: You should all feel healthy again.");
	}

}
