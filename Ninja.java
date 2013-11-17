//Marc Katz
//HW26
//pd08
//2013-11-15

public class Ninja extends Character{

    //default constructor
    public Ninja(String n){
	super();
	name = n;
	health = 75;
	strength = 75;
	defense = 30;
	attackRate = 0.7;
	dodge = 0.5;
    }

    //increases dodge by .1, but decreases defense by 10
    public void specialize(){
	dodge += 0.1;
	defense -= 10;
    }

    //decreases dodge by 0.1 and increases defence by 10 after specialize()
    public void normalize(){
	dodge -= 0.1;
	defense += 10;
    }

    //increases strength by 15 and dodge by 0.2, in return for 20% of remaining health
    public void sacrifice(){
	health -= health / 5;
	dodge += 0.2;
	strength += 15;
    }

    public String about(){
	String retStr = " The ninja is feirce fighter. He is strong, silent, and deadly./n It take more luck than skill to hit it, as it constantly darts around, appearing where you least expect it./n However, one strong punch can knock it out, if it hasn't done the same to you yet";
	return retStr;
    }

}
