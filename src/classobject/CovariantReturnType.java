package classobject;

public class CovariantReturnType {						//Class

	String l="Keypad";
	CovariantReturnType(){								//Method 1
		System.out.println("Super class contructor is invoked");
	}
	
	CovariantReturnType get() {							//Returning covariant (CovariantReturnType)
		return this;
	}
	
	void msg() {										//Method 2
		System.out.println("Covariant Return Type returning the complete class CovariantReturnType CovariantReturnType object");
	}
	
	public static void main(String []args){				//Main Method
		CovariantReturnType CType=new CovariantReturnType(); //Creating Reference variable and object in heap area
		CType.get().msg();
	}
	
	
	
}


