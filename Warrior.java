// Justin Strauss
// pd#8
// HW25
// 2013-11-14

public class Warrior extends Character {

    public void normalize() {
        _defense = 100;
        _attack = .4;
    }

    public void specialize() {
        _defense = 20;
        _attack = .75;
    }

    // a class that exends an abstract class must override all inherited 
    // abstract methods

    public Warrior(String name) {
	_health = 125;
        _strength = 40;
	_defense = 100;
        _attack = 0.4;
    }

}