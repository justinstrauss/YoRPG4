//Justin Strauss
//HW26
//pd08
//2013-11-15

public class Archer extends Character {

    public Archer(String newName) {
	name = newName;
	health = 50; // low health
	defense = 90; // high defense
	attackRate = 0.1; // low attack
	strength = 75;
	dodge = 0.35;
    }

    public void normalize() {}
    public void specialize() {}
    // archers can't specialize or normailze

    public String about() {
	String retStr = "An archer is only equipped with bow and arrow, ";
	retStr += "leaving him with a low attack rate, but nonetheless, he is ";        retStr += "able to defend himself with ease.";
	return retStr;
    }

    public void sacrifice() {
        health -= health / 5;
	strength += 25;
	dodge += 0.4;
    }

}