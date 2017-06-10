package com.sunilpandey.demos;

public class Singletonclass {
	/*Singleton class means you can create only one object for the given class. 
	You can create a singleton class by making its constructor as private,
	so that you can restrict the creation of the object. 
	Provide a static method to get instance of the object,
	wherein you can handle the object creation inside the class only. 
	In this example we are creating object by using static block. */
	
	/*The Singleton's purpose is to control object creation, 
	limiting the number of objects to only one. 
	Since there is only one Singleton instance, 
	any instance fields of a Singleton will occur only once per class,
	just like static fields. Singletons often control access to resources, 
	such as database connections or sockets.

	For example, if you have a license for only one connection for your database or 
	your JDBC driver has trouble with multithreading, 
	the Singleton makes sure that only one connection is made or that 
	only one thread can access the connection at a time.*/
	
	/*The easiest implementation consists of a private constructor and a field to hold its result,
	and a static accessor method with a name like getInstance().

	The private field can be assigned from within a static initializer block or,
	more simply, using an initializer. The getInstance( ) method (which must be public) 
	then simply returns this instance*/
	
	private static Singletonclass singleton = new Singletonclass();
	/* A private Constructor prevents any other
	    * class from instantiating.
	    */
	private Singletonclass() {
		
	}
	 /* Static 'instance' method */
	public static Singletonclass getInstance() {
		return singleton;
	}
	/* Other methods protected by singleton-ness */
	protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	
	
	

}
