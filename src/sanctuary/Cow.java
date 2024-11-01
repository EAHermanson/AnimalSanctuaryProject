package sanctuary;

public class Cow extends Animal
{
	private static String noise = "Moo";

	@Override
	public void makeNoise()
	{
		System.out.println(noise);
	}

	@Override
	public void eat(int amount)
	{
		makeNoise();
		System.out.println("I love eating these " + amount + " hays.");
	}
	
	
}
