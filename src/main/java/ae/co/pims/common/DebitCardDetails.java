/**
 * 
 */
package ae.co.pims.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Babu
 *
 */
@Entity
@Table(name = "DebitCardDetails")
public class DebitCardDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2275570765819530871L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GETOBJECTID")
	@SequenceGenerator(allocationSize = 1, catalog = "", initialValue = 12, name = "GETOBJECTID", schema = "SYSTEM", sequenceName = "GETOBJECTID")
	@Column(name = "debitCardObjectId")
	private BigInteger debitCardObjectId;
	@Column(name = "cardNo")
	private BigInteger cardNo;
	@Column(name = "validForm")
	private Date validForm;
	@Column(name = "validTo")
	private Date validTo;
	@Column(name = "cardType")
	private String cardType;
	@Column(name = "pin")
	private int pin;
	@Column(name = "cvvNo")
	private int cvvNo;

	@ManyToOne(fetch = FetchType.LAZY)
	private BankAccountDetails bad;

	public DebitCardDetails(BigInteger cardNo, Date validForm, Date validTo, String cardType, int pin, int cvvNo,
			BankAccountDetails bankAccountDetails) {
		super();
		this.cardNo = cardNo;
		this.validForm = validForm;
		this.validTo = validTo;
		this.cardType = cardType;
		this.pin = pin;
		this.cvvNo = cvvNo;
		this.bad = bankAccountDetails;
	}

	public DebitCardDetails() {
		super();
	}

	public BigInteger getDebitCardObjectId() {
		return debitCardObjectId;
	}

	public void setDebitCardObjectId(BigInteger debitCardObjectId) {
		this.debitCardObjectId = debitCardObjectId;
	}

	public BigInteger getCardNo() {
		return cardNo;
	}

	public void setCardNo(BigInteger cardNo) {
		this.cardNo = cardNo;
	}

	public Date getValidForm() {
		return validForm;
	}

	public void setValidForm(Date validForm) {
		this.validForm = validForm;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}

	public BankAccountDetails getBankAccountDetails() {
		return bad;
	}

	public void setBankAccountDetails(BankAccountDetails bankAccountDetails) {
		this.bad = bankAccountDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DebitCardDetails [debitCardObjectId=" + debitCardObjectId + ", cardNo=" + cardNo + ", validForm="
				+ validForm + ", validTo=" + validTo + ", cardType=" + cardType + ", pin=" + pin + ", cvvNo=" + cvvNo
				+ ", bankAccountDetails=" + bad + "]";
	}

}
