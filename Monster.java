// Justin Strauss
// pd#8
// HW25
// 2013-11-14

public class Monster extends Character {

    public void normalize() {}
    public void specialize() {}
    // these methods must be present to compile, but since we don't want
    // monsters to do anything with them, they are "empty"

    public Monster() {
        _health = 150;
        _strength = 20 + ((int) (45.0*Math.random()));
	_defense = 20;
	_attack = 1;
    }

}