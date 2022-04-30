package hibercycle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class LaptopMain {

	public static void main(String[] args) {
MyLaptopClass lob=new MyLaptopClass(); //new State  Transient
		
		Configuration con=new Configuration().configure().addAnnotatedClass(MyLaptopClass.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		//ServiceRegistry reg1=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
        
		/*lob.setLid(222);
		lob.setLname("Sony");
		lob.setLprice(800);  //object is in transient state
		
		session.save(lob);  //persistant state always data is there in database
		lob.setLprice(850);
		tx.commit();
		*/
		
		//detach state
		
		lob.setLid(112);
		lob.setLname("Dell");
		lob.setLprice(700);
		session.save(lob);
		
		tx.commit();
	  session.evict(lob);
		lob.setLprice(650);//not updated in database
          
		//object is in detached state
		
		
	
		//remove state
		lob.setLid(116);
		lob.setLname("Samsung");
		lob.setLprice(700);
		//persistent
		session.save(lob);
		//tx.commit();
		session.delete(lob);
	}



	}


