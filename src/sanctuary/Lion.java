package sanctuary;

public class Lion extends Animal
{
	private static String noise = "Roar!";

	@Override
	public void makeNoise()
	{
		System.out.println(noise);
	}

	@Override
	public void eat(int amount)
	{
		makeNoise();
		System.out.println("I love eating these " + amount + " steaks.");
	}
	

}
