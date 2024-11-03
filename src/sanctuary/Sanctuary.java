package sanctuary;

public class Sanctuary
{
	private Animal[] sanctuaryEnclosures = new Animal[5];
	
	private Attendant attendant;

	public Sanctuary(int enclosureCount)
	{
		sanctuaryEnclosures = new Animal[enclosureCount];
	}
	
	
	public void setAttendant(Attendant attendant)
	{
		this.attendant = attendant;
	}
	
	public void listAnimals()
	{
		for (Animal animal : sanctuaryEnclosures)
		{
			if(animal != null)
			{
				System.out.println(animal.getName() + " the " + animal.getClass() + " is here!  Yay!");
			}
			else
			{
				System.out.println("This enclosure is empty");
			}
		}
	}
	
	public void addAnimal(Animal newAnimal)
	{
		for (int i = 0; i < sanctuaryEnclosures.length; i++)
		{
			if(sanctuaryEnclosures[i] == null)
			{
				System.out.println("Welcome to the sanctuary, " + newAnimal.getName());
				sanctuaryEnclosures[i] = newAnimal;
				return;
			}
		}
		
		System.out.println("The sanctuary is full, time to expand!");
		sanctuaryEnclosures = expandSanctuary();
		addAnimal(newAnimal);
	}

	public void startAttendantRounds()
	{
		attendant.makeRounds(sanctuaryEnclosures);
	}
	
	private Animal[] expandSanctuary() 
	{
		Animal[] expandedSanctuary = new Animal[sanctuaryEnclosures.length * 2];
		
		System.out.println("Adding new enclosure!");
		
		for (int i = 0; i < sanctuaryEnclosures.length; i++)
		{
			expandedSanctuary[i] = sanctuaryEnclosures[i];
		}
		
		return expandedSanctuary;
	}
}
