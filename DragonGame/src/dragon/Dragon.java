package dragon;

public abstract class Dragon {

	protected int hp;
	protected int level;
	protected int baseDamage;
	protected String name;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	Dragon(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public abstract long actualDamage();

	public abstract String dragonRace();

	public abstract String data();
}
