package classobject;

public class ConstructorOverL {												//Class
	
	int f;																	//Instance variables
	String h;
	String q;
	ConstructorOverL(int g,String p){										//Constructor1 (int,string)
		f=g;
		h=p;
	}
	ConstructorOverL(int l,String m,String k){								//Constructor2 (int,string,string)
		f=l;
		h=m;
		q=k;
	}
	
	public static void main(String []args){																//Main Method
		ConstructorOverL CON=new ConstructorOverL(8,"Contructor1 Invoked");								//Reference variable - Constructor1
		ConstructorOverL CON2=new ConstructorOverL(9,"Constructor2 Invoked","again to Overload");		//Reference variable - Constructor2
		System.out.println(CON.f+" "+CON.h+" "+CON.q);
		System.out.println(CON2.f+" "+CON2.h+" "+CON2.q);
	}
}
