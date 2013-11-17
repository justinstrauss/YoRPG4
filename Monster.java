//Noah Brook
//HW26
//pd08
//2013-11-15

public class Monster extends Character {
    
    //default constructor
    
    public Monster() {
	super();
	health = 150;
	defense = 20;
	attackRate = 0.8;
	strength = 20 + ( (int) (Math.random() * 45));
	name = "Smeagel";
	dodge = Math.random() * 40;
    }
    
    public void specialize() {
         }    

    public void normalize() {
    }

    public String about() {
	String retStr = "Smeagels our savage, unintelligent creatures. However don't underestimate them /n                                                    for they have a keen instinct to kill. Don't cross paths with one of these /n                                                        bloodthirsty creatures without the intention of fighting for your life.";
	return retStr;
    }
    
    public void sacrifice() {}

}//end class Monster
