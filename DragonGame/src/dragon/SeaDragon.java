package dragon;

import java.util.Random;

public class SeaDragon extends Dragon {

	public SeaDragon(String name, int level) {
		super(name, level);

		Random random = new Random();
		this.baseDamage = random.nextInt(200, 1200);
		this.hp = random.nextInt(1000, 10000);
	}

	public SeaDragon(SeaDragon other) {
		super(other.name, other.level);
		this.baseDamage = other.baseDamage;
		this.hp = other.hp;
	}

	@Override
	public long actualDamage() {
		return (long) baseDamage * 10 + level * 10;
	}

	@Override
	public String dragonRace() {
		return "Sea Dragon  ";
	}

	@Override
	public String data() {
		String result;

		result = "Dragon race: " + dragonRace();
		result += " - Name: " + name;
		result += " - Level: " + level;
		result += " - HP: " + hp;
		result += " - Base damage: " + baseDamage;
		result += " - Actal damage: " + actualDamage();

		return result;
	}
}
