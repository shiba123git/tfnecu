/**
 * 
 */
package ae.co.pims.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author shmi0516
 *
 */
@Entity(name="PIMS_EMPLOYER_DETAILS")
@Table(name="PIMS_EMPLOYER_DETAILS")
public class EmployerDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5020286722891458193L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GETOBJECTID")
	@SequenceGenerator(allocationSize = 1, catalog = "", initialValue = 12, name = "GETOBJECTID", schema = "SYSTEM", sequenceName = "GETOBJECTID")
	@Column(name = "employerObjectId")
	private BigInteger employerObjectId;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "fromDate")
	private Date fromDate;
	@Column(name = "toDate")
	private Date toDate;
	@Column(name = "pfNumber")
	private String pfNumber;
	@Column(name = "employeeId")
	private String employeeId;
	@Column(name = "isCurrentCompany")
	private boolean isCurrentCompany;
	
	@Column(name = "tanNo")
	private String tanNo;
	
	public EmployerDetails()
	{
		
	}


	public BigInteger getEmployerObjectId() {
		return employerObjectId;
	}


	public void setEmployerObjectId(BigInteger employerObjectId) {
		this.employerObjectId = employerObjectId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	public Date getToDate() {
		return toDate;
	}


	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}


	public String getPfNumber() {
		return pfNumber;
	}


	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public boolean isCurrentCompany() {
		return isCurrentCompany;
	}


	public void setCurrentCompany(boolean isCurrentCompany) {
		this.isCurrentCompany = isCurrentCompany;
	}


	public String getTanNo() {
		return tanNo;
	}


	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}
	
	
	
	

}
