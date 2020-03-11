package adventure;

import java.util.Scanner;
import java.util.Random;

public class Adventure { // welcome to character customization!

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// ---------------------------------------------------------------------------------------------------------
		// end of title sequence

		String name; // "name" is the name of the player!
		System.out.print("What is your name? ");

		Scanner kbd = new Scanner (System.in);

		name = kbd.nextLine();

		System.out.print("\n");
		// ---------------------------------------------------------------------------------------------------------
		// end of name section

		System.out.println("What is your gender?\n 0) Male \n 1) Female");

		Scanner kbd2 = new Scanner(System.in);
		int G;
		System.out.print("What is your choice? ");
		G = kbd2.nextInt();
		System.out.println();

		if (G == 0) {
			String addressM = "Sir ";
			name = addressM + name;
			System.out.println("Welcome " + name);
		}
		else if (G == 1){
			String addressF = "Ma'dam ";
			name = addressF + name;
			System.out.println("Welcome " + name);
		}
		else {
			System.out.println("Whatever man, doesn't matter.");
		}
		System.out.println();
		// ---------------------------------------------------------------------------------------------------------
		// end of gender bender

		System.out.println(name + ", choose a class.");
		System.out.println(" 0) Knight \n 1) Scout \n 2) Archer \n 3) Wizard");
		System.out.print("What is your choice? ");

		Scanner kbdclass = new Scanner(System.in);
		int charClass; // "charClass" is the numerical value of the player's class!
		charClass = kbdclass.nextInt();
		System.out.println();

		String charClass2 = null; // "charClass2" is the name of the player's class!

		Random randGenPlayerCompliment = new Random();
		int playerComplimentComp;
		playerComplimentComp = randGenPlayerCompliment.nextInt(4) + 1;

		String playerCompliment = null;
		switch(playerComplimentComp) {
		case 1:
			playerCompliment = " handsome ";
			break;

		case 2:
			playerCompliment = " speedy ";
			break;

		case 3:
			playerCompliment = " accurate ";
			break;

		case 4:
			playerCompliment = " mysterious ";
			break;
		}

		if (charClass == 0) {
			charClass = 0;
			charClass2 = "knight";			
			System.out.println(name + "! The" + playerCompliment + "knight!");
		}
		else if (charClass == 1) {
			charClass = 1;
			charClass2 = "scout";
			System.out.println(name + "! The" + playerCompliment + "scout!");
		}
		else if (charClass == 2) {
			charClass = 2;
			charClass2 = "archer";
			System.out.println(name + "! The" + playerCompliment + "archer!");
		}
		else if (charClass == 3) {
			charClass = 3;
			charClass2 = "wizard";
			System.out.println(name + "! The" + playerCompliment + "wizard!");
		}
		else {
			System.out.println("YOU DIED.");
			System.exit(0);
		}
		System.out.println();
		// ---------------------------------------------------------------------------------------------------------
		// end of class selection

		if (charClass <= 2) {
			System.out.println("What color shall your armor be? \n *NOTE: This option is cosmetic.");
			System.out.println(" 0) Red \n 1) Blue \n 2) Green \n 3) Carrot");
			System.out.print("What is your choice? ");


			Scanner kbdArmorColor = new Scanner(System.in);
			int armorColor; // "armorColor" is the numerical value of the player's armor color!
			armorColor = kbdArmorColor.nextInt();
			String armorColor2; // "armorColor2" is the name of the player's armor color!

			System.out.println();

			if (armorColor == 0) {
				armorColor2 = "red";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 1) {
				armorColor2 = "blue";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 2) {
				armorColor2 = "green";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 3) {
				armorColor2 = "carrot";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else {
				System.out.println("The " + charClass2 + ", " + name + ", forfeits the right to have color.");
			}
		}
		else {
			String address2 = " the Wise";
			name = name + address2;

			System.out.println("What color shall your robes be? \n *NOTE: This option is cosmetic.");
			System.out.println(" 0) Red \n 1) Blue \n 2) Green \n 3) Carrot");
			System.out.print("What is your choice? ");

			Scanner kbdArmorColor = new Scanner(System.in);
			int armorColor = 0;
			armorColor = kbdArmorColor.nextInt();
			String armorColor2 = null;

			System.out.println();

			if (armorColor == 0) {
				armorColor2 = "red";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 1) {
				armorColor2 = "blue";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 2) {
				armorColor2 = "green";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else if (armorColor == 3) {
				armorColor2 = "carrot";
				System.out.println("The " + charClass2 + ", " + name + ", glows " + armorColor2 + "!");
			}
			else {
				System.out.println("The " + charClass2 + ", " + name + ", forfeits the right to have color.");
			}
		}
		// ---------------------------------------------------------------------------------------------------------
		// end of color customization!

		int healthPlayer = 0; // indicates player's current health
		int healthPlayerMax = 0; // indicates player's max health (so they can be healed)
		int accuracyPlayer = 0; // indicates player's chance to hit enemy
		int staminaPlayer = 0; // indicates player's chance of being able to run away
		int damagePlayer = 0; // indicates player's damage output
		int attackRatePlayer = 0; // indicates no. of times player can hit enemy before enemy can hit back
		int expPlayer = 0; // indicates player's experience points

		if (charClass == 0) { // knight class stats
			healthPlayer = 10;
			healthPlayerMax = 10;
			accuracyPlayer = 50;
			staminaPlayer = 25;
			damagePlayer = 2;
			attackRatePlayer = 1;
		}
		else if (charClass == 1) { // scout class stats
			healthPlayer = 5;
			healthPlayerMax = 5;
			accuracyPlayer = 50;
			staminaPlayer = 75;
			damagePlayer = 1;
			attackRatePlayer = 1;
		}
		else if (charClass == 2) { // archer class stats
			healthPlayer = 10;
			healthPlayerMax = 10;
			accuracyPlayer = 75;
			staminaPlayer = 25;
			damagePlayer = 1;
			attackRatePlayer = 1;
		}
		else if (charClass == 3) { // wizard class stats
			healthPlayer = 10;
			healthPlayerMax = 10;
			accuracyPlayer = 50;
			staminaPlayer = 25;
			damagePlayer = 1;
			attackRatePlayer = 2;
		}

		String playerStats = " " + charClass2 + "\t HP:" + healthPlayer + "\t A:" + accuracyPlayer + "\t S:" + staminaPlayer + "\t DP:" + damagePlayer + "\t AR:" + attackRatePlayer + "\t EXP:" + expPlayer;
		System.out.println(playerStats + "\n");
		// ---------------------------------------------------------------------------------------------------------
		// end of player stats section

		if (healthPlayer == 0) {
			System.out.println("YOU DIED");
			System.exit(0);
		}

		int levelPlayer; // indicates player level

		if (expPlayer >= 5) {
			System.out.println("You leveled up!");
			levelPlayer = 1;
			healthPlayer = healthPlayer + 2;
			healthPlayerMax = healthPlayerMax + 2;
			accuracyPlayer = accuracyPlayer - 1;
			staminaPlayer = staminaPlayer - 1;
			damagePlayer = damagePlayer + 1;
		}
		else if (expPlayer >= 10) {
			System.out.println("You leveled up!");
			levelPlayer = 2;
			healthPlayer = healthPlayer + 4;
			healthPlayerMax = healthPlayerMax + 4;
			accuracyPlayer = accuracyPlayer - 2;
			staminaPlayer = staminaPlayer - 2;
			damagePlayer = damagePlayer + 2;
		}
		else if (expPlayer >= 20) {
			System.out.println("You leveled up!");
			levelPlayer = 3;
			healthPlayer = healthPlayer + 8;
			healthPlayerMax = healthPlayerMax + 8;
			accuracyPlayer = accuracyPlayer - 4;
			staminaPlayer = staminaPlayer - 4;
			damagePlayer = damagePlayer + 4;
		}
		else if (expPlayer >= 40) {
			System.out.println("You leveled up!");
			levelPlayer = 4;
			healthPlayer = healthPlayer + 16;
			healthPlayerMax = healthPlayerMax + 16;
			accuracyPlayer = accuracyPlayer - 8;
			staminaPlayer = staminaPlayer - 8;
			damagePlayer = damagePlayer + 8;
		}
		else if (expPlayer >= 80) {
			System.out.println("You leveled up!");
			levelPlayer = 5;
			healthPlayer = healthPlayer + 32;
			healthPlayerMax = healthPlayerMax + 32;
			accuracyPlayer = accuracyPlayer - 16;
			staminaPlayer = staminaPlayer - 16;
			damagePlayer = damagePlayer + 16;
		}
		// end of level section
		// ---------------------------------------------------------------------------------------------------------

		System.out.println("Your Adventure (TM) starts here!");
		System.out.println(playerStats + "\n");

		String inventorySlotHat = null;
		String inventorySlotChest = null;
		String inventorySlotGloves = null;
		String inventorySlotBoots = null;
		String inventorySlotWeapon = null;

		// list of item IDs
		int basicHelmetID = 00001;
		boolean ifBasicHelmet = false;
		if (ifBasicHelmet = true) {
			String basicHelmet = "BASIC HELMET";
			inventorySlotHat = basicHelmet;
			healthPlayer = healthPlayer + 1;
			accuracyPlayer = accuracyPlayer - 2;
		}
		int basicChestPlatID = 00010;
		boolean ifBasicChestPlate = false;
		if (ifBasicChestPlate = true) {
			String basicChestPlate = "BASIC CHEST PLATE";
			inventorySlotChest = basicChestPlate;
			healthPlayer = healthPlayer + 1;
			healthPlayerMax = healthPlayerMax + 4;
		}
		int basicGlovesID = 00100;
		boolean ifBasicGloves = false;
		if (ifBasicGloves = true) {
			String basicGloves = "BASIC GLOVES";
			inventorySlotGloves = basicGloves;
			healthPlayer = healthPlayer + 1;
			accuracyPlayer = accuracyPlayer - 2;
		}
		int basicBootsID = 01000;
		boolean ifBasicBoots = false;
		if (ifBasicBoots = true) {
			String basicBoots = "BASIC BOOTS";
			inventorySlotBoots = basicBoots;
			healthPlayer = healthPlayer + 1;
			staminaPlayer = staminaPlayer - 2;
		}
		int basicSwordID = 10000;
		boolean ifBasicSword = false;
		if (ifBasicSword = true) {
			String basicSword = "BASIC SWORD";
			inventorySlotWeapon = basicSword;
			damagePlayer = damagePlayer + 2;
		}

		boolean goblinSpawn = false;


		String actionPlayer = " 0) Move Onward! \n 1) Open Inventory! \n 2) Use A Potion!";
		System.out.print("What is your choice? ");
		System.out.println(actionPlayer);

		Scanner kbdActionPlayerComp = new Scanner(System.in);
		int actionPlayerComp;
		actionPlayerComp = kbdActionPlayerComp.nextInt();

		switch (actionPlayerComp) {
		
		case 0: // used for action going forwards!
			Random randGenAction = new Random();
			int action = randGenAction.nextInt(1) + 1;
			goblinSpawn = (action == 1);

			System.out.println("*You move onward! \n");
			break;

		case 1: // used for checking the inventory!
			System.out.println("You have: ");
			inventorySlotHat = "NADA";
			inventorySlotChest = "NADA";
			inventorySlotGloves = "NADA";
			inventorySlotBoots = "NADA";
			inventorySlotWeapon = "A ROCK";

			String inventory = " Head: " + inventorySlotHat + "\n Chest: " + inventorySlotChest + "\n Gloves: " + inventorySlotGloves + "\n"
					+ " Feet: " + inventorySlotBoots + "\n Weapon: " + inventorySlotWeapon + "\n";
			System.out.println(inventory);

			String actionPlayerCase1 = " 0) Move Onward! \n 1) Open Inventory! \n 2) Use A Potion!";
			System.out.print("What is your choice? ");
			System.out.println(actionPlayer);
			break;

		case 2:

			int inventoryPotions = 0;

			String inventoryPotion1 = "NADA";
			switch (inventoryPotion1) {
			case "NADA":
				break;

			default:
				inventoryPotions = inventoryPotions + 1;
			}
			String inventoryPotion2 = "NADA";
			switch (inventoryPotion2) {
			case "NADA":
				break;

			default:
				inventoryPotions = inventoryPotions + 1;
			}
			String inventoryPotion3 = "NADA";
			switch (inventoryPotion3) {
			case "NADA":
				break;

			default:
				inventoryPotions = inventoryPotions + 1;
			}
			String inventoryPotion4 = "NADA";
			switch (inventoryPotion4) {
			case "NADA":
				break;

			default:
				inventoryPotions = inventoryPotions + 1;
			}
			String inventoryPotion5 = "NADA";
			switch (inventoryPotion5) {
			case "NADA":
				break;

			default:
				inventoryPotions = inventoryPotions + 1;
			}

			switch (inventoryPotions) {

			}

			System.out.println("You have: " + inventoryPotions + " potions.");
			String inventoryPlayerP = "\n 1) Potion: " + inventoryPotion1 + "\n 2) Potion: " + inventoryPotion2 + "\n 3) Potion: " + inventoryPotion3 + 
					"\n 4) Potion: " + inventoryPotion4 + "\n 5) Potion: " + inventoryPotion5 + " \n";
			System.out.println(inventoryPlayerP);

		}

		
		if (goblinSpawn) {
			boolean goblin;
			int goblinHealth = 2;
			goblin = (goblinHealth != 0);
			if (goblin) {
				System.out.println("A wild Goblin appears! \n");
				Random randGenGoblin = new Random();
				int goblinAccuracy;
				goblinAccuracy = randGenGoblin.nextInt(10) + 1;

				if ((goblinAccuracy >= 1) && (goblinAccuracy > 6)) {
					System.out.println("*He pricks you with a feather! \n");
					healthPlayer = healthPlayer - 1;
				}
				else if (goblinAccuracy == 7) {
					System.out.println("*He scores a CRITICAL HIT! \n");
					healthPlayer = healthPlayer - 2;
				}
				else {
					System.out.println("*He MISSES! \n");
				}

			}
		}
	}

}