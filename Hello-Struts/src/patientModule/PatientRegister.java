package patientModule;

import java.io.Serializable;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateConfiguration.HibernateUtil;
import adminModule.AdminLogin;
import adminModule.AdminModel;


public class PatientRegister extends AdminLogin implements SessionAware
{
	
	
	public static int save(PatientModel patientModel) {
		int temp = 0;
		AdminModel a = new AdminModel();
		
		int id = (Integer)sessionMap.get("ID");
		a.setAdminId(id);
		System.out.println("Value of admin Id foreign key"+id);
		patientModel.setaId(id);
		System.out.println("Value of patient object is" + patientModel);
		
		Session session = null;
		Transaction transaction = null;
		System.out.println("Is there any session attribute there?" +sessionMap.isEmpty());
		//sessionMap.set("ID", );
		System.out.println("From Pateint Register" +sessionMap.get("name"));
		System.out.println("From Patient Register" +sessionMap.get("ID"));
		try {
			
			System.out.println("Check this Our");
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Serializable result = session.save(patientModel);
			int r = (Integer) result;
			transaction.commit();
			temp = r;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		


		return temp;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

}
