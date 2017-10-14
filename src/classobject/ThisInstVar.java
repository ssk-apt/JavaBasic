package classobject;

public class ThisInstVar {											//Class

	int rollno;
	String name;													//Instance Variable
	
	ThisInstVar(int rollno,String name){							//Constructor with same variable name as parameter
		this.rollno=rollno;											//this keyword defines the class variable
		this.name=name;
	}
	
	void Display(){													//Method
		System.out.println(rollno+" - "+name);
	}
	public static void main(String []args){							//Main Method
		ThisInstVar T1=new ThisInstVar(43,"Siva");					//Reference Variable
		ThisInstVar T2=new ThisInstVar(43,"Sakthi");
		T1.Display();
		T2.Display();
	}
}
