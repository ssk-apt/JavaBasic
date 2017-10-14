package classobject;

public class ThisConstr {													//Class
	
	//-------------------------------------------------------------------------------------------------------
	ThisConstArg obj;								//class object creation
	ThisConstr(ThisConstArg obj){					//Called from ThisConstArg class
		this.obj=obj;
	}					
	void Display(){
		System.out.println(obj.a+obj.J);				
	}
	//--------------------------------------------------------------------------------------------------------
	ThisConstr(){															//Constructor1
		System.out.println("This is not a Parameterized constructor");
	}
	
	ThisConstr(int x){														//Constructor2
		this();																//Calling Constructor1
		System.out.println(x+" This is parameterized constructor");
	}
	
	ThisConstr(String l){													//Constructor3
		this(6);															//Calling Constructor2
		System.out.println(l);		
	}
	
	public static void main(String []args){									//Main Method
		ThisConstr T=new ThisConstr(7);
		ThisConstr T1=new ThisConstr("called Parameterized Constructor using This");
	}
}
