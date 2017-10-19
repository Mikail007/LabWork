public class Mainclass {

	public static void main(String[] args) {
		Animal a=new Birds("Parrot",5);
		a.can_move();
		Animal c=new Insects("Ant",6);
		c.can_move();
		Animal b=new Land("Dog",10);
		b.can_move();
		Animal d=new Water("Goldfish",11);
		d.can_move();
		DoSomething x=new DoSomething();
		x.doSomething(a);
		x.doSomething(c);
		x.doSomething(b);
		x.doSomething(d);
	}

}
