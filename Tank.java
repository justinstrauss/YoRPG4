//Marc Katz
//HW26
//pd08
//2013-11-15

public class Tank extends Character{

    //default constructor
    public Tank(String n){
	super();
	name = n;
	health = 225;
	strength = 50;
	defense = 60;
	attackRate = 0.3;
	dodge = 0.05;
    }

    //increases defense by 10, but decreases strength by 10
    public void specialize(){
	defense += 10;
	strength -= 10;
    }

    //returns the stats to normal after specialize()
    public void normalize(){
	defense -= 10;
	attackRate += 10;
    }

    //increases defense by 35 in return for 20% of remaining health
    public void sacrifice(){
	health -= health / 5;
	defense += 35;
    }

    public String about(){
	String retStr = "The tank is a huge, rumbling beast. It mows down anything in its path, attacks just bouncing off its thick hide. \nIt takes many hits to bring it down, more than usually a monster can deal. \nHowever, the tank's attacks are weak, and is dependant on time to wittle down the opponent's health.";
	return retStr;
    }

}

