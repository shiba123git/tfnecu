/**
 * 
 */
package ae.co.pims.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Babu
 *
 */
@Entity
@Table(name = "BankAccountDetails")
public class BankAccountDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7491117016261920758L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GETOBJECTID")
	@SequenceGenerator(allocationSize = 1, catalog = "", initialValue = 12, name = "GETOBJECTID", schema = "SYSTEM", sequenceName = "GETOBJECTID")
	@Column(name = "bankAccountobjectId")
	private BigInteger bankAccountobjectId;
	@Column(name = "accountNumber")
	private BigInteger accountNumber;
	@Column(name = "name")
	private String name;
	@Column(name = "status")
	private String status;
	@Column(name = "accountType")
	private String accountType;
	@OneToMany(targetEntity = DebitCardDetails.class)
	@JoinTable(name = "BANK_DEBIT_CARD_RELATION", joinColumns = {
			@JoinColumn(name = "bankAccountobjectId") }, inverseJoinColumns = {
					@JoinColumn(name = "debitCardObjectId") })
	private Collection<DebitCardDetails> debitcardList = new ArrayList<DebitCardDetails>();

	public BankAccountDetails() {
		super();
	}

	public BankAccountDetails(BigInteger accountNumber, String name, String status, String accountType,
			Collection<DebitCardDetails> debitcardList) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.status = status;
		this.accountType = accountType;
		this.debitcardList = debitcardList;
	}

	public BigInteger getBankAccountobjectId() {
		return bankAccountobjectId;
	}

	public void setBankAccountobjectId(BigInteger bankAccountobjectId) {
		this.bankAccountobjectId = bankAccountobjectId;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Collection<DebitCardDetails> getDebitcardList() {
		return debitcardList;
	}

	public void setDebitcardList(Collection<DebitCardDetails> debitcardList) {
		this.debitcardList = debitcardList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BankAccountDetails [bankAccountobjectId=" + bankAccountobjectId + ", accountNumber=" + accountNumber
				+ ", name=" + name + ", status=" + status + ", accountType=" + accountType + ", debitcardList="
				+ debitcardList + "]";
	}

}
