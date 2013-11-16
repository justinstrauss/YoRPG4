// Justin Strauss
// pd#8
// HW25
// 2013-11-14

public abstract class Character {

    protected String _name;
    protected int _health;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    // these instance vars need to be protected so they can be acessed by
    // the subclasses without being public

    public boolean isAlive() {
	return (_health > 0);
    }

    public String getName() {
	return _name;
    }

    public int getDefense() {
	return _defense;
    }

    public void lowerHP(int damage) {
	_health -= damage;
    }

    public int attack(Character name) {
	int damage = (int) (_strength * _attack) - name.getDefense();
	if (damage < 0) {
	    damage = 0;
	}
	name.lowerHP( damage );
	return damage;
    }

    public abstract void normalize();

    public abstract void specialize();

    public static String about() {
	return "These are subclasses of superclass Character.";
    }

}