public class Mammal extends Animal {

	private String name;
	private int number;
	public Mammal(String name,int number)
	{
		super(name,number);
		super.can_move();
	}
	public void can_move()
	{
				System.out.println("->Mammals");
	}
}
