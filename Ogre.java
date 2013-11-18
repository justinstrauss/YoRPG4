//Noah Brook
//HW26
//pd08
//2013-11-15

public class Ogre extends Character {

    public Ogre() {
	super();
	health = 170;
	defense = 40;
	attackRate = 0.85;
	strength = 25 +( (int) (Math.random() * 45));
	name = "Ogre";
	dodge = 0.01;
    }

    public void specialize() {
    }

    public void normalize() {
    }
    
    public void sacrifice() {
    }

    public String about() {
	String retStr = "Ogres are huge beasts that can tear a human a part.\nYou best be prepared for a fight when meeting this creature.\nDon't forget to attack fast, for his strength be mighty but his agility not.";
	return retStr;
    }

}//end class Ogre
