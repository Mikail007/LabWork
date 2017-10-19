public class Insects extends Oviparous {

	private String name;
	private int number;
	public Insects(String name,int number)
	{
		super(name,number);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("->Insect");
	}
}
