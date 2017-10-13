package classobject;

public class Class2 {								//Class
	
	int b=3;										//Instance Variable
	String c="class2";
	
	public static void main(String []args){			//Main Method
		Class1 M=new Class1();						//Reference Variable for class1
		Class2 O=new Class2();						//Reference Variable for class2
		System.out.println(M.a+" "+M.d);
		System.out.println(O.b+" "+O.c);
		
	}

}
