
public class Animal {

	private String name;
	private int number;
	public Animal(String name,int number)
	{
		this.name=name;
		this.number=number;
	}
	public void can_move()
	{
		System.out.println("Name of the Animal:"+this.name);
		System.out.println("No. of the Animal:"+this.number);
		System.out.println("->Animal");
	}
}
