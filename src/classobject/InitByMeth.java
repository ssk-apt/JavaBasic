package classobject;

public class InitByMeth {								//Class
	int y;												//Instance Variable-Scope all over class
	String z;
	
	void method(int j,String k){						//Method-1
		int u=9;										//Local Variable-Scope only inside Method
		y=j;
		z=k;
	}
	void Display(){										//Method-2
		System.out.println(y+" "+z);
	}

	public static void main(String []args){				//Main Method
		InitByMeth T=new InitByMeth();					//Reference Variable
		T.method(7," is Initialize By Method");
		T.Display();
	}
}
