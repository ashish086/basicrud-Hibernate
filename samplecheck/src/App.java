

import org.hibernate.Session;

public class App 
{
	public static void main(String[] args) 
	{
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		try 
		{
			// Step 1: Create object(ORM) with entity class
			//Users user = new Users("sova","brimstone","reyna","killjoy");
			Users ret= new Users(); //Retrieving
			Users upd = new Users(); //Updated
			Users del= new Users(); //delete
			
			
			

			// Step 2: Start the transaction / transport
			session.beginTransaction();
			//session.save(user);
			//upd = session.get(Users.class, 3);
			//upd.setPassword("Demopass");  //Updated
			//upd.setLast_name("UpdatedVal");
			
			ret=session.get(Users.class,6); //retrieve
			
			//del = session.get(Users.class, 3); //delete
			
			// Step 3: perform DELETE Operation	
			//session.save(ret);
			//session.save(upd);
			
			//session.delete(del);
			
			
			
			
			// Step 4: Commit the transaction
			session.getTransaction().commit();
			//System.out.println(user);
			System.out.println(ret);
			//System.out.println(upd);
			//System.out.println(del);
			
			
		} 
		
		finally
		{
			session.close();
			
		}
		
		
	}
	

}
