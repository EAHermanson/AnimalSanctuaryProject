package sanctuary;

public class Duck extends Animal
{
	private static String noise = "Quack!";

	@Override
	public void makeNoise()
	{
		System.out.println(noise);
	}

	@Override
	public void eat(int amount)
	{
		makeNoise();
		System.out.println("I love eating these " + amount + " fish.");
	}
	
	
}
