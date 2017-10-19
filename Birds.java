public class Birds extends Oviparous {

	private String name;
	private int number;
	public Birds(String name,int number)
	{
		super(name,number);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("->Bird");
	}
}
