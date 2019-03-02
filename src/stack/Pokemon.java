package stack;


/*
 *   Nathan Nasteff
 *   Delaware Tech
 *   Spring 2019
 */


public class Pokemon {
	
	// Define vars for name, type and hp of pokemon
	
	private String name;
	private String type1;
	private int hp;
	private int atk;
	private int def;

	
	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public Pokemon (String n, String t, int h) {
		name = n;
		type1 = t;
		hp = h;
	}
	// Gets & Sets


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType1() {
		return type1;
	}


	public void setType1(String type1) {
		this.type1 = type1;
	}


	public int getHP() {
		return hp;
	}


	public void setHP(int hp) {
		this.hp = hp;
	}


	// toString override for proper output of pokemon objects
	
	@Override
	public String toString() {
		return "Name: " + name + "   Type: " + type1 + "   HP: " + hp + "  ATK: " + atk + "  DEF: " + def;

		
	}

	


	
}

