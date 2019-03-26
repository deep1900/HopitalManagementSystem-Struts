package adminModule;



public class LoginModel 
{
	
	private static String userName;
	private String password;
	private int id;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getUserName() {
		System.out.println("GET OF USERNAME" +userName);
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("SET VALUE OF USERNAME" +userName);
	}
	public String getPassword() {
		System.out.println("get value of password is" +password);
		return password;
		
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("set value of password is"+password);
	}
	@Override
	public String toString() {
		return "LoginModel [username=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
