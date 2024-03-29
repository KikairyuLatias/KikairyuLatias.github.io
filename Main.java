import java.util.Random;
import java.io.InputStreamReader;
import java.util.Scanner;

//use for any number of archetype generations

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("How many archetypes would you like to generate? Enter no more than 500.");	

		InputStreamReader keyboardInput = new InputStreamReader(System.in);
		Scanner myScanner;
		myScanner = new Scanner(keyboardInput);
		int input = myScanner.nextInt();

		if(input > 0 && input <= 500)
		{
			for (int value = 1; value <= input; value++)
			{

				// RNG
				Random rand = new Random();	

				// stuff
				int type = rand.nextInt(23)+1;
				int vanilla = rand.nextInt();
				int attribute = rand.nextInt(7)+1;
				int summon = rand.nextInt(9)+1;
				int precedent = rand.nextInt();
				int power = rand.nextInt(3)+1;
				//	int range = rand.nextInt(5)+1;
				int speed = rand.nextInt(4)+1;
				int backrow = rand.nextInt(4)+1;
				int pendulum = rand.nextInt();
				//int card_count = rand.nextInt(10)+10;
				//int run = value +1;
				int theme = rand.nextInt(43);

				//System.out.println("Run #"+ run +" \n");

				// printing the type
				switch (type)
				{
				case 1: System.out.println("Aqua");
				break;
				case 2: System.out.println("Beast");
				break;
				case 3: System.out.println("Beast-Warrior");
				break;
				case 4: System.out.println("Cyberse");
				break;
				case 5: System.out.println("Dinosaur");
				break;
				case 6: System.out.println("Dragon");
				break;
				case 7: System.out.println("Fairy");
				break;
				case 8: System.out.println("Fiend");
				break;
				case 9: System.out.println("Fish");
				break;
				case 10: System.out.println("Insect");
				break;
				case 11: System.out.println("Machine");
				break;
				case 12: System.out.println("Plant");
				break;
				case 13: System.out.println("Psychic");
				break;
				case 14: System.out.println("Pyro");
				break;
				case 15: System.out.println("Reptile");
				break;
				case 16: System.out.println("Rock");
				break;
				case 17: System.out.println("Sea-Serpent");
				break;
				case 18: System.out.println("Spellcaster");
				break;
				case 19: System.out.println("Thunder");
				break;
				case 20: System.out.println("Warrior");
				break;
				case 21: System.out.println("Winged Beast");
				break;
				case 22: System.out.println("Wyrm");
				break;
				case 23: System.out.println("Zombie");
				break;
				case 24: System.out.println("Mixed type");
				break;
				}

				// printing attributes 
				switch (attribute)
				{
				case 1: System.out.println("DARK-Attribute");
				break;
				case 2: System.out.println("EARTH-Attribute");
				break;
				case 3: System.out.println("FIRE-Attribute");
				break;
				case 4: System.out.println("LIGHT-Attribute");
				break;
				case 5: System.out.println("WATER-Attribute");
				break;
				case 6: System.out.println("WIND-Attribute");
				break;
				case 7: System.out.println("Multiple Attribute");
				}

				// print primary method
				switch (summon)
				{
				case 1: System.out.println("Normal Summon");
				break;
				case 2: System.out.println("Tribute Summon");
				break;
				case 3: System.out.println("Flip Summon");
				break;
				case 4: System.out.println("Ritual Summon");
				break;
				case 5: System.out.println("Fusion Summon");
				break;
				case 6: System.out.println("Synchro Summon");
				break;
				case 7: System.out.println("Xyz Summon");
				break;
				case 8: System.out.println("Pendulum Summon");
				break;
				case 9: System.out.println("Link Summon");
				break;
				case 10: System.out.println("No particular method");
				break;
				}

				// how many vanillas will be in here?
				if(vanilla%3 == 1)
				{
					System.out.println("1 Vanilla monster");
				}
				else if (vanilla%3 == 2)
				{
					System.out.println("Multiple Vanillas");
				}
				else
				{
					System.out.println("No Vanilla monsters");
				}

				// determines how to go about Tribute Summons
				if(summon == 2)
				{
					if(precedent%3 == 1)
					{
						System.out.println("Tribute monsters from hand and/or banish from GY instead");
					}
					else if(precedent%3 == 2)
					{
						System.out.println("Pay LP to Tribute Summon");
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// determines how to go about Ritual Summons
				if(summon == 4)
				{
					if(precedent%3 == 1)
					{
						System.out.println("Use LP in lieu of Tributing monsters");
					}
					else if(precedent%3 == 2)
					{
						System.out.println("Use monster's ATK instead of Levels");
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// determines how to go about Fusion Summons
				if(summon == 5)
				{
					if(precedent%3 == 1)
					{
						System.out.println("Fusion Summon from the Deck [or Extra]");
					}
					if(precedent%3 == 2)
					{
						System.out.println("Contact Fusion");
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// determines how to go about Synchro Summons
				if(summon == 6)
				{
					if(precedent%2 == 1)
					{
						System.out.println("Use difference in Levels (Dark Synchro?)");
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// determines how to go about Xyz Summons
				if(summon == 7)
				{
					if(precedent%3 == 1)
					{
						System.out.println("Dependent Ranks on materials");
					}
					else if(precedent%3 == 2)
					{
						System.out.println("Use materials from elsewhere but field");
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// determine if we get ED Pendulums or not (these will follow the usual procedures)
				if(summon == 8)
				{
					if(pendulum%2 == 0)
					{
						System.out.println("ED Pendulums"); 
					}
					else if(pendulum%2 != 0)
					{
						System.out.println("No ED Pendulums");
					}
				}

				// determine how to deal with Link Summon
				if(summon == 9)
				{
					if(precedent%2 == 1)
					{
						System.out.println("Link Materials from elsewhere but hand/field"); 
					}
					else
					{
						System.out.println("Normal procedure");
					}
				}

				// print power range

				switch(power)
				{
				case 1: System.out.println("Low Level/Rank/Link Rating");
				break;
				case 2: System.out.println("Mid Level/Rank/Link Rating");
				break;
				case 3: System.out.println("High Level/Rank/Link Rating");
				break;
				case 4: System.out.println("No specific Level/Ranking/Link range");
				break;
				}

				// print summoning speed
				switch (speed)
				{
				case 1: System.out.println("Slow summoning speed"); 
				break;
				case 2: System.out.println("Medium summoning speed");
				break;
				case 3: System.out.println("Fast summoning speed");
				break;
				case 4: System.out.println("Extreme summoning speed");
				break;
				case 5: System.out.println("Mixed summon speed");
				break;
				}

				// print backrow amount
				switch (backrow)
				{
				case 1: System.out.println("Monsters only"); 
				break;
				case 2: System.out.println("Low backrow to monster ratio");
				break;
				case 3: System.out.println("Balanced backrow/monster ratio");
				break;
				case 4: System.out.println("High backrow/monster ratio");
				break;
				case 5: System.out.println("Spells/Traps only");
				break;
				}

				// gimmick
				switch(theme)
				{
				case 1: System.out.println("Beatdown"); break;
				case 2: System.out.println("Swarm"); break;
				case 3: System.out.println("Card milling/destruction"); break;
				case 4: System.out.println("Stat alteration"); break;
				case 5: System.out.println("Protect the castle"); break;
				case 6: System.out.println("Heavy combos"); break;
				case 7: System.out.println("Mild combos"); break;
				case 8: System.out.println("Counter distribution"); break;
				case 9: System.out.println("Token spam"); break;
				case 10: System.out.println("Type manipulation"); break;
				case 11: System.out.println("Same name"); break;
				case 12: System.out.println("Cyclic (some kind of circular/nonlinear playstyle)"); break;
				case 13: System.out.println("Equips"); break;
				case 14: System.out.println("Massive searches"); break;
				case 15: System.out.println("Lock the opponent from playing"); break;
				case 16: System.out.println("Banishing"); break;
				case 17: System.out.println("Swarm"); break;
				case 18: System.out.println("Steal opponent's monsters"); break;
				case 19: System.out.println("Ladder bosses");break;
				case 20: System.out.println("Position-specific effects");break;
				case 21: System.out.println("Floodgating");break;
				case 22: System.out.println("Protection from opponent's effects");break;
				case 23: System.out.println("Destroy own cards to do things");break;
				case 24: System.out.println("GY spam");break;
				case 25: System.out.println("Hand traps");break;
				case 26: System.out.println("Main Deck hate");break;
				case 27: System.out.println("Specific targets");break;
				case 28: System.out.println("Disruption tactics");break;
				case 29: System.out.println("Inheritance effects [stuff gains effects if <x> is used to summon for them]");break;
				case 30: System.out.println("Specific type support"); break;
				case 31: System.out.println("Normal / non-Effect monster interaction"); break;
				case 32: System.out.println("Burn damage"); break;
				case 33: System.out.println("LP restoration");break;
				case 34: System.out.println("Stat/card modulation"); break;
				case 35: System.out.println("Extra Deck hate");break;
				case 36: System.out.println("Freely summon Extra Deck monsters");break;
				case 37: System.out.println("Alternate win conditions");break;
				case 38: System.out.println("Banish own cards to do things");break;
				case 39: System.out.println("Hand control");break;
				case 40: System.out.println("Multiple themes");break;
				case 41: System.out.println("Specific values");break;
				case 42: System.out.println("Columns (specific placement)");break;
				case 43: System.out.println("Revolves around Vanilla monsters");break;
				default: System.out.println("No particular theme");break;
				}

				// how many cards in archetype/series, etc?

				System.out.println("\n");

				//System.out.println("\n" + "" + +type + " " + +attribute + " " + +summon + " " + +range + " " + +range2 + " "+ +speed + " " + "\n");
				//System.out.println("\nEnjoy your cardmaking!\n");
			}
		}
		else if (input == 0)
		{
			System.out.println("What are you doing? You can't make zero prompts, baka");
		}
		else if (input < 0)
		{
			System.out.println("You can't make a negative number of prompts, baka");
		}
		else if (input > 500)
		{
			System.out.println("Can you read? The instructions clearly say NO HIGHER THAN 500! Read again baka.");
		}
	}
}