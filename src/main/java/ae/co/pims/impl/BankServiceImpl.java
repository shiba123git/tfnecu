/**
 * 
 */
package ae.co.pims.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ae.co.pims.common.BankDetails;
import ae.co.pims.common.PIMSValidationUtil;
import ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil;

/**
 * @author shmi0516
 *
 */
public class BankServiceImpl implements BankService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BankServiceImpl.class);
	private static final String FULLY_QUALIFIED_CLASS_NAME = "ae.co.pims.impl.oracle.connection.hibernate.BankServiceImpl";
	private static SessionFactory sessionfactory = null;
	private static Session session = null;
	private static Transaction tx = null;

	public boolean createBank(BankDetails bao) {
		boolean status = false;
		session = getSession();
		tx = session.beginTransaction();
		PIMSValidationUtil.validateBankCreateion(bao);
		session.save(bao);
		tx.commit();
		return true;
	}

	public List<BankDetails> getBankbyName(String name) {
		session = getSession();
		tx = session.beginTransaction();
		return null;
	}

	public List<BankDetails> getBankbyifscCode(String ifsccode) {
		session = getSession();
		tx = session.beginTransaction();
		return null;
	}

	@SuppressWarnings("unused")
	public List<BankDetails> getBankbyId(BigInteger bankobjectId) {
		List<BankDetails> bankList = new ArrayList<BankDetails>();
		if (null != bankobjectId) {
			session = getSession();
			tx = session.beginTransaction();
			BankDetails bankdetails = (BankDetails) session.load(BankDetails.class, bankobjectId);
			bankList.add(bankdetails);
			System.out.println("Bank Name is :::" + bankdetails.getBankName());
			bankdetails.setBankName("HDFC");
			tx.commit();
			session.close();
		}
		return bankList;
	}

	public boolean isActive(String bankName) {
		session = getSession();
		tx = session.beginTransaction();
		return false;
	}

	private static Session getSession() {
		sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		return sessionfactory.openSession();
	}

}
