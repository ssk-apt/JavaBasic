package classobject;

public class ThisConstArg {								//Class
	int a=5;											//Instance Variable
	String J="Pass this arg in constructor";
	
	ThisConstArg(){										//Constructor1
		ThisConstr A=new ThisConstr(this);				//Initializing constructor in ThisConstr class - this keyword creates an object which holds the instance variables values
		A.Display();
	}
	
	void method(){
		System.out.println(this);
	}
	public static void main(String []args){				//Main Method
		ThisConstArg B=new ThisConstArg();				//initializing Constructor1
		System.out.println(B);
		B.method();
	}
}
