package sanctuary;

public class Attendant
{
	public void makeRounds(Animal[] sanctuary)
	{
		for (Animal animal : sanctuary)
		{
			if(animal != null)
			{
				System.out.println("Tending to " + animal.getName() + ".");
				animal.eat( (int)((Math.random()+1) * 10) );
			}
			else
			{
				System.out.println("This enclosure is empty, and ready to receive a new animal.");
			}
		}
		
		System.out.println("There we go!  Break time...");
	}
}
