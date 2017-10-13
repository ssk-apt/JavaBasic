package classobject;

public class InitByRef {										//Class
	int q;														//Instance Variable
	String w;
	
	public static void main(String []args){						//Main Method
		InitByRef R=new InitByRef();							//Reference Variable R
		InitByRef K=new InitByRef();
		R.q=8;													//Initialize q value through reference variable R
		R.w=" is Initialized by reference variable R";
		K.q=9;													//Initialize q value through reference variable K
		K.w="is Initializzed by reference variable K";
		System.out.println(R.q+" "+R.w);
		System.out.println(K.q+" "+K.w);
	}

}
