package adminModule;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import HibernateConfiguration.HibernateUtil;

public class AdminLogin  extends ActionSupport implements SessionAware
{
//	LoginModel l;
	AdminModel l = new AdminModel();
	public static  SessionMap<String,Object> sessionMap;
	int id = 0;
	
	@Override  
	public void setSession(Map<String, Object> map) {  
	    sessionMap=(SessionMap)map;  
	}  
	
	

//	public LoginModel getL() {
//		return l;
//	}
//
//
//	public void setL(LoginModel l) {		this.l = l;
//	}



	public AdminModel getL() {
		return l;
	}



	public void setL(AdminModel l) {
		this.l = l;
	}



	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public boolean login()
	{
	

		System.out.println(l.getUserName());
		System.out.println(l.getPassword());
		
		System.out.println("Inside Login");
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			System.out.println("inside  admin login");
			System.out.println();
			TypedQuery<LoginModel>  query = session.createQuery("from AdminModel where USER_NAME=:uname and PASSWORD=:pwd");
//			query.setParameter("uname", loginModel.getUserName());
//			query.setParameter("pwd", loginModel.getPassword());
			query.setParameter("uname",l.getUserName());
			query.setParameter("pwd", l.getPassword());
//			query.setParameter("id", l.getId());
			List<LoginModel> results = query.getResultList();
			System.out.println(results);
			
			if(results.size()!=0){
				Iterator stIterator=results.iterator();
				while(stIterator.hasNext()){
				AdminModel at = (AdminModel)stIterator.next();
					System.out.println("ADMIN_ID" +at.getAdminId());
					id = at.getAdminId();
					
				}
				System.out.println( "Value of Id is  "  +id);
		
				
			}
			if(results.isEmpty() == true)
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(session != null)
			{
				session.close();
			}
		}
		return false;
	}
	
	
	public String execute()
	{
		boolean flag = false;
		flag = login();
		
		if(flag == true) {
//			sessionMap.put("login","true");  
//		    sessionMap.put("name",l.getUserName()); 
		    sessionMap.put("ID",id);
		    System.out.println("Id in Session Map is" +sessionMap);
		    
	
		return "success";
		}
		else
			return "error";
	}


	

}
