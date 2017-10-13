package classobject;

public class CopyConstr2 {								//Class

	int y;												//Instance Variable
	String h;
	
	CopyConstr2(int g,String o){						//Constructor1
		y=g;
		h=o;
	}
	
	public CopyConstr2() {								//Constructor2 Dummy
	}
	
	void Display(){										//Method 1
		System.out.println(y+" "+h);
	}
	
	public static void main(String []args){				//Main Method
		CopyConstr2 K=new CopyConstr2(5,"By Refrence"); //Reference Variable
		CopyConstr2 M=new CopyConstr2();
		M.h=K.h;
		M.y=K.y;
		K.Display();
		M.Display();
		
	}
}

