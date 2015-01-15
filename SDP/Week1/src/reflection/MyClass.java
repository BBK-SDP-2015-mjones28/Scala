package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] main)
	{
		System.out.println("Test");
		
		try {
			/*
				//class throws exception therefore wrap it
				Class c = Class.forName("java.util.Random");
				System.out.println(c);
				Method[] m = c.getMethods();
				
				for (Method meth: m)
				{
					System.out.println(meth);
				}
				//shows all the methods random (not just random's methods) 
				//can respond to along with exceptions
				
				System.out.println(m); //prints [Ljava.lang.reflect.Method;@4e25154f
				//L = class, type = java.lang.reflect, prints out memory location
				
			*/	
				
			    String s = "insert class name"; //package name required - reflect.Person
			    System.out.println(s);
			    Scanner scan = new Scanner(System.in);
			    String t = "reflection." + scan.next();
			    System.out.println(t);
			    
//			    Class<?> c = Class.forName(t);
//			    Method[] m = c.getMethods();
//			    for (Method meth: m)
//				{
//					System.out.println(meth);
//				}
//				
//			    
//			    Class<?> c1 = Class.forName(t);
//			    Method[] m1 = c1.getDeclaredMethods();
//			    for (Method meth1: m1)
//			    {
//			    	System.out.println(meth1);
//			    }
			    
			    
			    
			    //create new object on the fly dynamically
//			    Class<?> c2 = Class.forName(t);
//			    Object obj = c2.newInstance(); //this is the point where new is technically used to create person
//			    //calls the default constructor for person
//			    System.out.println(obj);
			    
			   Class<?> c3 = Class.forName(t);
			 
			   Constructor<?> obj1 = c3.getConstructor(String.class, String.class);
			   Object p = obj1.newInstance("Dave", "1234");
			   System.out.println(p);
			   Object p1 = obj1.newInstance("Claire", "2345");
			   System.out.println(p1);
			   
			   Class class1 = p1.getClass();
			   //setname is the method in person we r looking for
			   //string.class is the parameter of setName
			   Method meth = class1.getMethod("setName", new Class[] {String.class});
			   //here meth is the method setName - we therefore invoke meth on person p1
			   meth.invoke(p1, "jane"); // new Object[]{"jane"});
			   System.out.println(p1);
			   
			   
			    
			    
			    
				
			} 
		    catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) 
			{
				// TODO Auto-generated catch block
			   System.err.println("all gone wrong" + e);
				
			}

	}
	
}
