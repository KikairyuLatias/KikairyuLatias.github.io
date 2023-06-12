import java.util.Random;

//use for generating 3 archetypes for Deck Build Packs

public class MainDeckBuild 
{
	public static void main(String[] args) 
	{
		System.out.println("VERSION UPDATE: 2023/05/13\n");

		for (int value = 0; value < 3; value++)
		{
			// RNG
			Random rand = new Random();	

			// stuff
			int cardtype = rand.nextInt();
			int type = rand.nextInt(29);
			int vanilla = rand.nextInt();
			int attribute = rand.nextInt(7)+1;
			int summon = rand.nextInt(9)+1;
			int precedent = rand.nextInt();
			int power = rand.nextInt(3)+1;
			int level = rand.nextInt(11)+1;
			int rank = rand.nextInt(11)+1;
			int link = rand.nextInt(6)+1;
			int range = rand.nextInt(2)+1;
			int speed = rand.nextInt(4)+1;
			int backrow = rand.nextInt(4)+1;
			int pendulum = rand.nextInt();
			//int card_count = rand.nextInt(10)+10;
			//int run = value +1;
			int theme = rand.nextInt(46);
			int theme2 = rand.nextInt(45);

			//System.out.println("Run #"+ run +" \n");

			//determine if there will be monsters or not
			if(cardtype%5 != 1)
			{
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
				case 10: System.out.println("Illusion");
				break;
				case 11: System.out.println("Insect");
				break;
				case 12: System.out.println("Machine");
				break;
				case 13: System.out.println("Plant");
				break;
				case 14: System.out.println("Psychic");
				break;
				case 15: System.out.println("Pyro");
				break;
				case 16: System.out.println("Reptile");
				break;
				case 17: System.out.println("Rock");
				break;
				case 18: System.out.println("Sea-Serpent");
				break;
				case 19: System.out.println("Spellcaster");
				break;
				case 20: System.out.println("Thunder");
				break;
				case 21: System.out.println("Warrior");
				break;
				case 22: System.out.println("Winged Beast");
				break;
				case 23: System.out.println("Wyrm");
				break;
				case 24: System.out.println("Zombie");
				break;
				case 25: System.out.println("Celestial Warrior (RUSH DUEL)");
				break;
				case 26: System.out.println("Cyborg (RUSH DUEL)");
				break;
				case 27: System.out.println("High Dragon (RUSH DUEL)");
				break;
				case 28: System.out.println("Magical Warrior (RUSH DUEL)");
				break;
				case 29: System.out.println("Omega Psychic (RUSH DUEL)");
				break;
				case 30: System.out.println("Galaxy (RUSH DUEL)");
				break;
				default: System.out.println("Mixed type");
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
				default: System.out.println("No particular method");
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

				// Toon, Spirit, Union, Gemini, and Flip (if they appear)

				// any monsters with abilities
				int ability = rand.nextInt(6);
				int ability2 = rand.nextInt(5);

				if(summon != 3)
				{
					switch(ability)
					{
					case 1: System.out.println("Has Toon monsters");break;
					case 2: System.out.println("Has Spirit monsters");break;
					case 3: System.out.println("Has Union monsters"); break;
					case 4: System.out.println("Has Gemini monsters"); break;
					case 5: System.out.println("Has Flip monsters");break;
					case 6: System.out.println("Has monsters with multiple abilities");break;
					default: System.out.println("No monsters with abilities");break;
					}
				}
				else if(summon == 3)
				{
					switch(ability2)
					{
					case 1: System.out.println("Also has Toon monsters");break;
					case 2: System.out.println("Also has Spirit monsters");break;
					case 3: System.out.println("Also has Union monsters"); break;
					case 4: System.out.println("Also has Gemini monsters"); break;
					case 5: System.out.println("Has monsters with other abilities");break;
					default: System.out.println("No other abilities");break;
					}
				}

				//for plain Normal Summon
				if(summon == 1)
				{
					switch(range)
					{
					case 1: System.out.println("Normal Summon anything");break;
					case 2: System.out.println("Focus on mid Level monsters");break;
					default: System.out.println("Focus on high Level monsters");break;
					}
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

					switch(range)
					{
					case 1: System.out.println("Mid level focus (5 and 6)");break;
					case 2: System.out.println("High level focus (7 to 12)");break;
					default: System.out.println("Anything from Level 5 onwards");break;
					}
				}

				// determines how to go about Ritual Summons
				if(summon == 4)
				{
					System.out.println("Primary focus on Level "+level+" monsters");

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
					System.out.println("Primary focus on Level "+level+" monsters");

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
					int synrange = rand.nextInt(3);
					int accel = rand.nextInt(3);

					switch(synrange)
					{
					case 1: System.out.println("Primarily lower Level focus");break;
					case 2: System.out.println("Primarily mid Level focus");break;
					case 3: System.out.println("Primarily high level focus");break;
					default: System.out.println("Mixed Level range");break;
					}

					switch(accel)
					{
					case 1: System.out.println("Accel Synchro / CLEAR MIND");break;
					case 2: System.out.println("Multiple Tuners / BURNING SOUL");break;
					case 3: System.out.println("Accel Synchro and multiple Tuners"); break;
					default: System.out.println("No CLEAR MIND or BURNING SOUL (normal Synchro stuff)");break;
					}

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
						System.out.println("Primary focus on Rank "+rank+" monsters");
					}
					else
					{
						System.out.println("Normal procedure");
						System.out.println("Primary focus on Rank "+rank+" monsters");
					}
				}

				// determine if we get ED Pendulums, Ritual Pends or not (these will follow the usual procedures)
				if(summon == 8)
				{
					int range2 = rand.nextInt(3)+1;

					switch(range2)
					{
					case 1: System.out.println("Low level focus");break;
					case 2: System.out.println("Mid Level focus");break;
					case 3: System.out.println("High level Pendulums");break;
					default: System.out.println("Any range of Levels");break;
					}

					if(pendulum%4 == 0)
					{
						System.out.println("Contains Ritual and ED Pendulums"); 
					}
					else if(pendulum%4 == 1)
					{
						System.out.println("Only Extra Deck Pendulums for SS only");
					}
					else if(pendulum%4 == 2)
					{
						System.out.println("Only Ritual Pendulums");
					}
					else
					{
						System.out.println("No Ritual or Extra Deck Pendulums");
					}
				}

				// another line on how to deal with Ritual Pends
				if (summon == 8 && pendulum%4 == 0 || summon == 8 && pendulum%4 == 2)
				{
					int ritpend = rand.nextInt();

					if(ritpend%3 == 0)
					{
						System.out.println("Ritual Pends that can be FIRST either Pendulum or Ritual Summoned");
					}

					else if(ritpend%3 == 1)
					{
						System.out.println("Ritual Pends that first need to be Ritual Summoned");
					}
					else
					{
						System.out.println("Ritual Pends that MUST either be Ritual Summoned or Pendulum Summoned from the hand");
					}
				}

				// determine how to deal with Link Summon
				if(summon == 9)
				{
					System.out.println("Primary focus on Link "+link+" monsters");

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
				case 1: System.out.println("Low stats compared to equivalent Level/Rank/Link Rating");
				break;
				case 2: System.out.println("Average stats compared to equivalent Level/Rank/Link Rating");
				break;
				case 3: System.out.println("High stats compared to equivalent Level/Rank/Link Rating");
				break;
				case 4: System.out.println("Mixed stats compared to equivalent Level/Rank/Link Rating");
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
				if (backrow == 1)
				{
					System.out.println("Monsters only"); 
				}

				else
				{
					System.out.println("Contains backrow");
				}

				// ratio of monsters to backrow
				if(backrow !=1)
				{
					int backratio_m = ((rand.nextInt(9))+1)*10;
					int backratio_s = 100 - backratio_m;

					System.out.println(""+backratio_m+"% monsters and "+backratio_s+"% backrow");

					//backrow ratios (if any)
					int backrow_s = (rand.nextInt(10))*10;
					int backrow_t = 100 - backrow_s;

					System.out.println("Backrow ratios: "+backrow_s+"% Spells / "+backrow_t+"% Traps");
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
				case 44: System.out.println("Functions best at high LP"); break;
				case 45: System.out.println("Functions best when your LP is low"); break;
				case 46: System.out.println("Deck out the opponent"); break;
				default: System.out.println("No particular theme");break;
				}

				// Illusion monsters (keep the "no destroy" battle effect or not)
				if(type==10)
				{
					int choice = rand.nextInt();

					if(choice%2 == 0)
					{
						System.out.println("Retain the effect that prevents monsters from being destroyed in battle");
					}
					else
					{
						System.out.println("Illusion monsters and monsters they battle can be destroyed (do not have this effect)");
					}

				}
			}

			else
			{
				System.out.println("No monsters exist");

				//determination of backrow ratios
				int backrow_s = (rand.nextInt(10))*10;
				int backrow_t = 100 - backrow_s;

				System.out.println("Backrow ratios: "+backrow_s+"% Spells / "+backrow_t+"% Traps");

				//themes (needs to be different from monster including)
				switch(theme2)
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
				case 19: System.out.println("No particular theme");break;
				case 20: System.out.println("Position-specific effects");break;
				case 21: System.out.println("Floodgating");break;
				case 22: System.out.println("Protection from opponent's effects");break;
				case 23: System.out.println("Destroy own cards to do things");break;
				case 24: System.out.println("GY spam");break;
				case 25: System.out.println("Hand traps");break;
				case 26: System.out.println("Main Deck hate");break;
				case 27: System.out.println("Specific targets");break;
				case 28: System.out.println("Disruption tactics");break;
				case 29: System.out.println("Deck out the opponent"); break;
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
				case 44: System.out.println("Functions best at high LP"); break;
				case 45: System.out.println("Functions best when your LP is low"); break;
				default: System.out.println("No particular theme");break;
				}
			}


			// how many cards in archetype/series, etc?

			System.out.println("\n");

			//System.out.println("\n" + "" + +type + " " + +attribute + " " + +summon + " " + +range + " " + +range2 + " "+ +speed + " " + "\n");
			//System.out.println("\nEnjoy your cardmaking!\n");
		}
	}
}