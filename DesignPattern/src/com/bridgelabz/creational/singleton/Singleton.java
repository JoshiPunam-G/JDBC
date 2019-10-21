package com.bridgelabz.creational.singleton;

public class Singleton {

	public static void main(String[] args) {
	
		//EagerInitialization  
		//for(int i=0;i<5;i++)
		
	    EagerInitializedSingleton instance=EagerInitializedSingleton.getInstance();
	    System.out.println("EagerInitializedSingleton :"+instance.hashCode());
		System.out.println();
		
		//StaticBLockSinleton
		StaticBlockSingleton instance1=StaticBlockSingleton.getInstance();
	    System.out.println("StaticBlockSingleton :"+instance1.hashCode());
	    System.out.println();
		    
		//LazySingleton
		LazySingleton instance2=LazySingleton.getInstance();
	    System.out.println("LazySingleton :"+instance2.hashCode());
	    System.out.println();
	    
	    //ThreadSafeSingleton
	    ThreadSafeSingleton instance3=ThreadSafeSingleton.getInstance();
	    System.out.println("ThreadSafeSingleton :"+instance3.hashCode());
	    
	    
	    //BillPugSingleton
	    BillPugSingleton instance4=BillPugSingleton.getInstance();
	    System.out.println("BillPugSingleton :"+instance4.hashCode());
	    
	    
	    //EnumSingleton 
//	    EnumSingleton singleton=EnumSingleton .INSTANCE;
//	    System.out.println(singleton.getValue());
//	    singleton.setValue(10);
//	    System.out.println(singleton.getValue());
	  
	}

}
