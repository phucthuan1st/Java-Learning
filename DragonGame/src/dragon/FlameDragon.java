package dragon;

import java.util.Random;

public class FlameDragon extends Dragon {

	public FlameDragon(String name, int level) {
		super(name, level);

		Random random = new Random();
		this.baseDamage = random.nextInt(100, 1000);
		this.hp = random.nextInt(5000, 15000);
	}

	public FlameDragon(FlameDragon other) {
		super(other.name, other.level);
		this.baseDamage = other.baseDamage;
		this.hp = other.hp;
	}

	@Override
	public long actualDamage() {
		return (long) baseDamage * 15 + level * 5;
	}

	@Override
	public String dragonRace() {
		return "Flame Dragon";
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
