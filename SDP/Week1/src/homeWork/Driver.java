package homeWork;

public class Driver {

	public static void main(String [] args)
	{
		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String> sStorage = new Storage<>();
		
		//Reasoning:  - Storage can hold a type of any object
		// Storage 'has a' object that is instantiated only at run-time.
		//Benefits: ??
		
		//Class baCls = BankAccount.class;
		Class<BankAccount> baCls = BankAccount.class;
		//<BankAccount> = the type of the class modelled by this Class object
		
		try
		{
			/*
			Object myAccount = baCls.newInstance();
			aStorage.setValue((BankAccount)myAccount);
			
			//Deposit
			((BankAccount) myAccount).deposit(15);
			System.out.println(((BankAccount) myAccount).showBalance());
			
			//required casting to an actual bank account. object itself does not have
			//access to the methods
			*/
			
			/*
			BankAccount myAccount = baCls.newInstance();
			aStorage.setValue(myAccount);
			//Deposit
			myAccount.deposit(15);
			System.out.println(myAccount.showBalance());
			//myAccount is not a BankAccount - it is a new instance of the class BankAccount
			//Although myAccount thinks it can run the BankAccount methods it cant as it is not a BankAccount.
			*/
			
			
			BankAccount myAccount = (BankAccount)baCls.newInstance();
			aStorage.setValue(myAccount);
			//Deposit
			myAccount.deposit(15);
			System.out.println(myAccount.showBalance());
			//Cast changes the class object into BankAccount - allows access to the methods
			//JVM stipulates the Cast at Runtime
			//safe???
			
			/*
			BankAccount myAccount = baCls.newInstance();
			aStorage.setValue(myAccount);
			//Deposit
			myAccount.deposit(15);
			System.out.println(myAccount.showBalance());
			//with Class<BankAccount> - the type of class modelled is defined by the BankAccount object
			//therefore myAccount would now be deemed - BankAccount object
			*/
			
			System.out.println( aStorage.getValue().showBalance());
			//console shows 115.0
			if(aStorage.getClass() == sStorage.getClass())
			{
				System.out.println("Equal");
				System.out.println(aStorage.getClass());
				System.out.println(sStorage.getClass());
			}
			else
			{
				System.out.println("Not Equal");
			}
			
			//returns 115.0, as aStorgae had its (has a) value changed to BankAccount
			//Then myAccount had its value changed to 115.0
			//aStorage has a BankAccount object of myAccount - which has its value of 115.0
			//returns equal. Both are made of the same single (static?) class storage. Thus 
			//both will point to the same class. 
		}
		catch (InstantiationException e)
		{
			//...
		}
		catch (IllegalAccessException e)
		{
			//...
		}
		
	}
	
	
}
