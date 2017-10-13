package classobject;

public class AnonymousObject {											//Class
	int e=10;															//Instance Variable
	
	public static void main(String []args){								//Main Method
		new AnonymousObject().e=10;										//Anonymous Object - No Reference variable created it can be used at the time of object creation only.
		System.out.println(new AnonymousObject().e);
	}

}
