package adminModule;

import java.util.Map;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Session  implements SessionAware 
{
	private static final long serialVersionUID = -3434561352924343132L;
	private SessionMap<String, Object> sessionMap;
	
	public SessionMap<String, Object> getSessionMap() {
		System.out.println("Inside Session Map" +sessionMap);
		return sessionMap;
	}
	


	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		System.out.println("Inside Session Map" +sessionMap);
		this.sessionMap = sessionMap;
	}
	

	@Override
	public void setSession(Map<String, Object> map)
	{
		sessionMap = (SessionMap<String, Object>) map;
		map.get("username");
		System.out.println(map.get("username"));
		System.out.println("Inside Session Class");
		
	}
	
	HttpSession session = ServletActionContext.getRequest().getSession(true);
	
	
	public String logout()
	{
		sessionMap.remove("userId");
		sessionMap.invalidate();
		return "error";
	}
	

}
