package com.bridgelabz.creational.singleton;

public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance3;
  
  private ThreadSafeSingleton() {}
  
  public static synchronized ThreadSafeSingleton getInstance()
  {
	  if(instance3==null)
	  {
		  instance3=new ThreadSafeSingleton();
	  }
	return instance3;
	  
  }
}

