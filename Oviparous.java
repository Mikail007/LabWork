public class Oviparous extends Animal {

	private String name;
	private int number;
	public Oviparous(String name,int number)
	{
		super(name,number);
		super.can_move();
	}
	public void can_move()
	{
			System.out.println("->Oviparous");
	}
}
