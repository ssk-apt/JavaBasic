package classobject;

public class SuperKey extends CovariantReturnType { 	//Class
	
	String l="Google";									//Class Variable
	
	SuperKey(){											//Constructot - Call to contructor can be made only from another contructor
		super();										//without this super keyword also the super class contructor should be invoked by default
	}
	
	void Display() {									//Method1
		System.out.println(l+" "+super.l);    			//Both class having l variable but print different value with super keyword
		super.msg();  	 								//super class method called
	}

	public static void main(String []args) {			//Main Method
		SuperKey Ref=new SuperKey();					//Creating reference variable and object in heap memory
		Ref.Display();
	}
}
