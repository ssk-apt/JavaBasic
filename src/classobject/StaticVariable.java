package classobject;

public class StaticVariable {					//Class

	static int counter=0;				//Static instance variable, will retain it's value
	int count=0;						//will get memory when object get created
	
	StaticVariable(){							//Method1
	counter++;
	count++;
	System.out.println(counter+" "+count);
	}
	
	public static void main(String []args){		//Main Method
		StaticVariable u=new StaticVariable();
		StaticVariable u1=new StaticVariable();
		StaticVariable u2=new StaticVariable();
		
	}
	
}
