package basicJava;

public class TC_001_printName {
	
	public static int add(int x, int y) 
	{
		int z=x+y;
		return z;
	}

	public static void main(String[] args) {
		
		System.out.println("hello world, i am learning java basic");
		
		//Variable is a storage to store one value.
		int x=10;
		//x--> 10 --> 4bytes in RAM
		//4,294,967,296-4
		System.out.println("Value of x: "+x);
		x=20;
		System.out.println("Value of x: "+x);

//		constants value cannot be changed
		final int y=10;
		//y=20; //not possible
		//System.out.println(x);
		
		//byte z=129;
		System.out.println(x);
		
		int [] asdf={10,28,30};
		System.out.println(asdf[0]);
		

		int xNew=10; //no quotes for numeric values
		int [] yNew= {10,20,30}; //no quotes for numeric values
		char cNew='Q'; //char value enclosed by single quote
		String sNew="batch6a"; //string value enclosed by double quotes
		boolean bNew=true; //no quotes for boolean
		
		int sumOfTwoNumber=add(1, 2);
		System.out.println("Sum of two number is: "+sumOfTwoNumber);
		
		//Creating object
		TC_002_basicClass basicClass =new TC_002_basicClass();
		basicClass.display();
		
		System.out.println("new object");
		//Creating 2nd object
		TC_002_basicClass basicClass2 =new TC_002_basicClass(2);
		basicClass2.display();
		
	}

}
