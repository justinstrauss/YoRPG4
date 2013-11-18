//Justin Strauss
//HW26
//pd08
//2013-11-15

public class Warrior extends Character{
    
    //default constructor
    public Warrior(String newName) {
	super();
	name = newName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRate = 0.5;
	dodge = Math.random() * 50;
    }
       
    //specialize prepares for special attack lowering defense and increasing attack                                             
    public void specialize() {
        defense = 35;
        attackRate = 0.8;
    }
    //normalize prepares warrior for normal attack, reseting defense and attackRate                                                                                                                                                       
    public void normalize() {
        defense = 45;
        attackRate = 0.4;
    }

    public String about() {
	String retStr = "The Warrior is a brave soldier of the battle of evil, \nknown for his fierce attacks and swinging broadsword. \nIf I were a monster, I wouldn't mess with him.";
	return retStr;
    }
	    
    public void sacrifice() {}    

}//end class Warrior
