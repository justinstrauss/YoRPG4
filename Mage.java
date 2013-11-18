//Noah Brook
//HW26
//pd08
//2013-11-15

public class Mage extends Character {

    public Mage(String newName) {
	super();
	name = newName;
	health = 175;
	defense = 45;
	attackRate = 0.3;
	strength = 75;
	dodge = 0.4;
    }

    public void specialize() {
	defense -= 10;
	attackRate += 0.2;
    }

    public void normalize() {
	defense += 10;
	attackRate -=  0.2;
    }

    public String about() {
	String retStr = "The mage is and sagacious fellow capable of weilding magic and spells.\nThrough his life he has trained giving him a high health and defense rating. \nBut heed my warning. Time has taken its toll and made the Mage's attack weak.";
	return retStr;
    }

    public void sacrifice() {
	health -= health / 5;
	strength += 20;
	dodge += 0.15;
    }
	

}//end class Mage
