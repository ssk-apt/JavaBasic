package classobject;

public class StaticMethod {							//Class
	
	int rollno;										//Instance variable
	String Name;
	static String college="Indus";					//static instance variable - 
	
	static void change(){							//Static method can change the static variable value&static method invoked without instance of class
		college="Anna University";					//Only static variable can be defined inside static method
	}
	
	StaticMethod(int r, String n){					//Constructor
		rollno=r;
		Name=n;
	}
	
	void Display(){									//Method1
		System.out.println(rollno+" "+Name+" "+college);
	}
	
	static{											//Static Block
		System.out.println("Static can be invoked before main method");
	}
	
	public static void main(String []args){			//Main Method
		StaticMethod.change();						//Initiating the static method to change the static variable values.
		StaticMethod SM=new StaticMethod(43,"Siva");
		SM.Display();
	}
}
