package classobject;

public class CopyConstr {									//Class

	int y;													//Instance Variable
	String e;
	CopyConstr(int f,String g){								//Method1
		y=f;
		e=g;
	}
	
	CopyConstr(CopyConstr n){								//Method2
		y=n.y+1;
		e=n.e+"hi";
	}
	
	void Display(){											//Method3
		System.out.println(y+" "+e);
	}
	
	public static void main(String []args){					//Main Method
		CopyConstr cc=new CopyConstr(4,"copy constructor");						//Reference Variable for method1
		CopyConstr ccc=new CopyConstr(cc);										//Reference Variable for method2
		cc.Display();
		ccc.Display();
	}
}
