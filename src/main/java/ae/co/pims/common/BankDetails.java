/**
 * 
 */
package ae.co.pims.common;

import java.math.BigInteger;

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
@Entity
@Table(name = "PIMS_BANK_DETAILS")
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GETOBJECTID")
	@SequenceGenerator(allocationSize = 1, catalog = "", initialValue = 12, name = "GETOBJECTID", schema = "SYSTEM", sequenceName = "GETOBJECTID")
	@Column(name = "bankObjectId")
	private BigInteger bankObjectId;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "email")
	private String email;
	@Column(name = "ifsccode")
	private String ifsccode;
	@Column(name = "url")
	private String url;
	@Column(name = "isOnline")
	private boolean isOnline;
	@Column(name = "address")
	private String address;
	@Column(name = "mobileNumber")
	private String mobileNumber;

	public BankDetails() {
		super();
	}

	public BankDetails(String bankName, String email, String ifsccode, String url, boolean isOnline, String address,
			String mobileNumber) {
		super();
		this.bankName = bankName;
		this.email = email;
		this.ifsccode = ifsccode;
		this.url = url;
		this.isOnline = isOnline;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public BigInteger getId() {
		return bankObjectId;
	}

	public void setId(BigInteger bankObjectId) {
		this.bankObjectId = bankObjectId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "BankDetails [bankObjectId=" + bankObjectId + ", bankName=" + bankName + ", email=" + email
				+ ", ifsccode=" + ifsccode + ", url=" + url + ", isOnline=" + isOnline + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
