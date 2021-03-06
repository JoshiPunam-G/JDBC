 package com.bridgelabz.structural.proxy;

 interface DatabaseExecutor
{
  public void executeDatabase(String query)throws Exception;	
}

 class DatabaseExecuterImpl implements DatabaseExecutor
{

	@Override
	public void executeDatabase(String query)throws Exception{
		System.out.println("Excute Query:"+query);
	}
	
}
 
 class DatabaseExecuteProxy implements DatabaseExecutor
{
	private boolean isadmin=true;
	private DatabaseExecuterImpl dbexecutor;
	
	public  DatabaseExecuteProxy(String name,String password)throws Exception{
		if(name=="admin" && password=="admin@123")
		{
			isadmin=true;
			dbexecutor=new DatabaseExecuterImpl();
		}
		
	}

	@Override
	public  void executeDatabase(String query) throws Exception {
	   if(isadmin)
	   {
		   dbexecutor.executeDatabase(query);
	   }
	   else if(query.equals("DELETE"))
	   {
			   throw new Exception("Delete not allowed for non admin");
	   }
	   else
		{
			 dbexecutor.executeDatabase(query);
		}
	 
	}
}

public class ProxyPatternExample {

	public static void main(String[] args) throws Exception {
		
		DatabaseExecutor nonadmin=new DatabaseExecuteProxy("nonadmin","admin@123678");
		try {
		nonadmin.executeDatabase("DELETE");
		}catch(Exception e)
		{
			System.out.println("Exception Caught :"+e.getMessage());
		}
		
		
		/*DatabaseExecutor admin=new  DatabaseExecuteProxy("admin","admin@123");
		admin.executeDatabase("DELETE");*/
	}

}
