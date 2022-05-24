package game;

import java.util.ArrayList;
import java.util.Scanner;

import dragon.Dragon;
import dragon.DragonFactory;

public class Game {
	private ArrayList<Dragon> dragons = new ArrayList<>();
	public static final Scanner scanner = new Scanner(System.in);

	public Game() {
		createDragonList();
	}

	private long totalDamage() {
		long result = 0;

		for (Dragon dragon : dragons) {
			result += dragon.actualDamage();
		}

		return result;
	}

	private Dragon createDragon() {

		String type;
		String name;
		int level;

		scanner.nextLine();

		System.out.println("What type of dragon: ");
		type = scanner.nextLine();

		System.out.println("Dragon name: ");
		name = scanner.nextLine();

		System.out.print("Dragon level: ");
		level = scanner.nextInt();

		return DragonFactory.createDragon(type, name, level);
	}

	private void createDragonList() {

		System.out.print("How many dragon on this game? --> ");
		int n;
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dragon " + (i + 1) + ": ");
			dragons.add(createDragon());
		}

	}

	public void showGame() {

		for (Dragon dragon : dragons) {
			System.out.println(dragon.data());
		}

		System.out.println("Total damage dealt by all dragon is: " + totalDamage());
	}
}
