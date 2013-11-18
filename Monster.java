//Justin Strauss
//HW26
//pd08
//2013-11-15

public class Monster extends Character {
    
    //default constructor
    
    public Monster() {
	super();
	health = 150;
	defense = 30;
	attackRate = 0.8;
	strength = 20 + ( (int) (Math.random() * 45));
	name = "Smeagel";
	dodge = Math.random() / 2;
    }
    
    public void specialize() {
         }    

    public void normalize() {
    }

    public String about() {
	String retStr = "Monsters are savage, unintelligent creatures. However don't underestimate them \nfor they have a keen instinct to kill. Don't cross paths with one of these \nbloodthirsty creatures without the intention of fighting for your life.";
	return retStr;
    }
    
    public void sacrifice() {}

}//end class Monster
