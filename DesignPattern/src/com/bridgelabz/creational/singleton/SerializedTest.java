package com.bridgelabz.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton object1=SerializedSingleton.getInstance();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("/home/admin106/Desktop/demo.txt"));
		out.writeObject(object1);
		out.close();
		ObjectInput in=new ObjectInputStream(new FileInputStream("/home/admin106/Desktop/demo.txt"));
		 SerializedSingleton object2 = (SerializedSingleton) in.readObject();
	        in.close();
	        
	        
	        System.out.println("First Objetc "+object1.hashCode());
	        System.out.println("Second Object "+object2.hashCode());
	    
	}

}
