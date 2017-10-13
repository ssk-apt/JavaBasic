package classobject;

public class InitByConst {
	int i;														//Instance Object
	String j;
	InitByConst(int m,String l){								//Constructor
		i=m;
		j=l;
	}
	
	public static void main(String []args){						//Main Method
		InitByConst C=new InitByConst(1,"Contructor invoked");		//Reference Variable
		System.out.println(C.i+" "+C.j);
	}
}
