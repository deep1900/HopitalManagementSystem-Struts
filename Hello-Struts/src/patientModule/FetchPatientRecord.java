package patientModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateConfiguration.HibernateUtil;

public class FetchPatientRecord 
{
	ArrayList<PatientModel> list=new ArrayList<PatientModel>();  
	  
	public ArrayList<PatientModel> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<PatientModel> list) {  
	    this.list = list;  
	}  
	public String execute()
	{
		Session session = null;
		Transaction transaction = null;
		try {
			
			System.out.println("Check this Our");
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			List patient = session.createQuery("from PatientModel p").list();
			PatientModel p = new PatientModel();
			Iterator it = patient.iterator();
			while(it.hasNext())
			{
				Object o = (Object)it.next();
				PatientModel p1 = (PatientModel)o;
				System.out.println("ID:" +p.getaId());
				System.out.println(p.getName());
				list.add(p);
			}
					}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		session.close();
		return "success";
	}

}
