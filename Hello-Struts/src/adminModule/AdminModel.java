package adminModule;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import patientModule.PatientModel;

@Entity
@Table(name = "Admin")
public class AdminModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADMIN_ID")

	private int adminId;

	@Column(name = "First_Name")
	private String firstname;

	@Column(name = "Last_Name")
	private String lastname;

	@Column(name = "Email")
	private String email;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;
	
	@OneToMany(cascade= CascadeType.ALL) //mappedBy="adminModel"
	private List<PatientModel> patientModel;
	

	public List<PatientModel> getPatientModel() {
		return patientModel;
	}
	public void setPatientModel(List<PatientModel> patientModel) {
		this.patientModel = patientModel;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getAdminId() {
		return adminId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String fName) {
		this.firstname = fName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lName) {
		this.lastname = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminModel [adminId=" + adminId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", userName=" + userName + ", password=" + password + ", patientModel=" + "]";
	}
	
	public String execute()
	{
		AdminRegister.save(this);
		int temp = 0;
		if(temp>0)
		{
			return "success";
		}
		else
		{
			return "error";
		}
		
	}

}
