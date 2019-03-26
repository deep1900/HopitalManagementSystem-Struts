package patientModule;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.opensymphony.xwork2.ActionSupport;

import adminModule.AdminModel;

@SuppressWarnings("serial")
@Table(name = "patient")
@Entity
public class PatientModel extends ActionSupport
{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Patient_ID")
	@Id
	private int pId;
	@Column(name="ADMIN_ID")
	private int aId;
	
	@ManyToOne
	@JoinColumn(name="AdminID")
	private AdminModel adminModel;
	
	
	
	public AdminModel getAdminModel() {
		return adminModel;
	}

	public void setAdminModel(AdminModel adminModel) {
		this.adminModel = adminModel;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	@Column(name = "Patient_Name")
	private String name;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
	

	
	@Override
	public String toString() {
		return "PatientModel [pId=" + pId + ", adminModel=" +  ", name=" + name + "]";
	}

	public String execute() {
		int i = PatientRegister.save(this);
		if (i > 0) {
			return "success";
		} else {
			return "error";
		}
	}

	

}
