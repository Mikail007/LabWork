public class Water extends  Mammal {

	private String name;
	private int number;
	public Water(String name,int number)
	{
		super(name,number);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("->Stay in water");
	}
}
