package sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp
{
	Sanctuary sanctuary;
	Scanner input;
	
	public static void main(String[] args)
	{
		AnimalSanctuaryApp sanctuaryApplication = new AnimalSanctuaryApp();
		sanctuaryApplication.launchApp();
	}
	
	private void launchApp()
	{
		int selection = 0;
		boolean quit = false;
		input = new Scanner(System.in);

		System.out.println("Enter the initial size of our beloved sanctuary:  ");
		selection = input.nextInt();
		
		if(selection <= 0)
		{
			System.out.println("We need at least one, so we'll start there...");
			selection = 1;
		}
		
		sanctuary = new Sanctuary(selection);
		sanctuary.setAttendant(new Attendant());
		
		while(!quit)
		{
			System.out.println("------Please select a menu option-------"
					+ "\n1:  List sanctuary animals."
					+ "\n2:  Add a new animal."
					+ "\n3:  Send the attendant on their rounds."
					+ "\n4:  Quit.");
			
			selection = input.nextInt();
			
			switch(selection)
			{
			case 1:
				sanctuary.listAnimals();
				break;
			case 2:
				System.out.println("We can currently house the following animal types:"
						+ "\n1:  Cow" 
						+ "\n2:  Duck" 
						+ "\n3:  Lion");
				selection = input.nextInt();
				input.nextLine();
				System.out.println("Please enter the animal's name:  ");
				String name = input.nextLine();
				Animal animalToAdd;
				
				switch(selection)
				{
				case 1:
					animalToAdd = new Cow();
					animalToAdd.setName(name);
					sanctuary.addAnimal(animalToAdd);
					break;
				case 2:
					animalToAdd = new Duck();
					animalToAdd.setName(name);
					sanctuary.addAnimal(animalToAdd);
					break;
				case 3:
					animalToAdd = new Lion();
					animalToAdd.setName(name);
					sanctuary.addAnimal(animalToAdd);
					break;
				default:
					System.out.println(selection + " is not a valid entry for this menu.");
					break;
				}
				break;
			case 3:
				sanctuary.startAttendantRounds();
				break;
			case 4:
				quit = true;
				break;
			default:
				System.out.println(selection + " is not a valid entry for this menu.");
			}
		}
		
	}
}
