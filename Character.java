//Noah Brook
//HW26
//pd08
//2013-11-15

public abstract class Character {

    //instance variables
    protected int health, strength, defense;
    protected double attackRate, dodge;
    protected String name;

    public boolean isAlive() {
	return health > 0;
    }
    //accessor methods
    public int getDefense() {
	return defense;
    }
    
    public String getName() {
	return name;
    }

    public double getDodge() {
	return dodge;
    }

    public void lowerHP(int damage) {
	health -= damage;
    }

    public int attack(Character Opponent) {
	int damage = (int) (strength * (attackRate + 1)) - Opponent.getDefense();
	if (damage < 0) {
	    damage = 0;
	}
	else if (Math.random() <= Opponent.getDodge() ) {
	    System.out.println("Attack dodged!");
	    damage = 0;
	    
	}
	else {
	    Opponent.lowerHP(damage);
	    System.out.println("Direct hit!");
    
	}
	return damage;
       
    }

    //specialize prepares for special attack lowering defense and increasing attack                                             
    public abstract void specialize();
    
    //normalize prepares warrior for normal attack, reseting defense and attackRate                                                 
    public abstract void normalize();

    //about gives a brief explanation of each character
    public abstract String about();

    public abstract void sacrifice();

}//end class Character
