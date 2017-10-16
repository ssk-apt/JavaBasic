package classobject;

public class InstanceInitializer extends CovariantReturnType{		//Class
	
	InstanceInitializer() {											//Constructor
		super();    												//Not Required to give super keyword
		System.out.println("Method 1");
	}
	
	{System.out.println("sub class Instance Initializer block invoked");} //InstanceBlock

	
	public static void main(String []args) {						//Main Method
		InstanceInitializer ins=new InstanceInitializer();			//Reference variable and object in heap
	}
}

