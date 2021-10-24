package basicJava;

public class TC_002_basicClass {

	public TC_002_basicClass() 
	{
			x=10;
			w="kalam";
	}
	
	public TC_002_basicClass(int x) 
	{
			this.x=x;
			w="alam";
	}
//Data members
	public int x;
	public float y;
	public char z;
	public String w;
	public boolean b;

//Methods
	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		System.out.println(b);
	}
}

