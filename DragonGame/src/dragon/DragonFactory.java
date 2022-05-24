package dragon;

public class DragonFactory {

	static public Dragon createDragon(String type, String name, int level) {
		if (type.equals("sea") || type.equals("Sea") || type.equals("SeaDragon") || type.equals("Sea Dragon")) {
			return new SeaDragon(name, level);
		} else if (type.equals("flame") || type.equals("Flame") || type.equals("FlameDragon")
				|| type.equals("Flame Dragon")) {
			return new FlameDragon(name, level);
		}

		return new SeaDragon(name, level);

	}

	private DragonFactory() {

	}

}
