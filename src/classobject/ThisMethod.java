package classobject;

public class ThisMethod {													//Class

	void m(){																//Method1
		System.out.println("M");
	}
	void n(){																//Method2
		System.out.println("N");
		this.m();															//Calling Method1 which is defined in same class
	}
	public static void main(String []args){									//Main Method
		ThisMethod N=new ThisMethod();										//Reference Variable
		N.n();
	}
}
