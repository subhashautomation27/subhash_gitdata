package corejavaprog;

public class Singleton {
	
	static Singleton s1=new Singleton(); 
	public Singleton() {
		
	}
	public Singleton gettext()
	{
		return s1;
	}
	
	
	public static void main(String[] args) {
		//Singleton s=new Singleton();
		Singleton s=s1.gettext();
		
		
	}

}
