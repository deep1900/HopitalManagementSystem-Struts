package adminModule;

import HibernateConfiguration.HibernateUtil;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdminRegister {

	public static int save(AdminModel adminModel) {
		int temp = 0;
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Serializable result = session.save(adminModel);
			System.out.println("FROM HERE");
			
			int r = (Integer) result;
			transaction.commit();
			temp = r;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session != null) {
			session.close();
			}
		}
		
		return temp;

	}
}
