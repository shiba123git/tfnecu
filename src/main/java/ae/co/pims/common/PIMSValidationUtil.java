/**
 * 
 */
package ae.co.pims.common;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil;

/**
 * <<<<<<< HEAD
 * 
 * @author Babu
 *
 */
public class PIMSValidationUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(PIMSValidationUtil.class);
	private static final String FULLY_QUALIFIED_CLASS_NAME = "ae.co.pims.common.PIMSValidationUtil";
	private static SessionFactory sessionfactory = null;
	private static Session session = null;
	private static Transaction tx = null;

	public static boolean validateBankName(String bankName) {
		sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		session = sessionfactory.openSession();
		tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankDetails.class);
		criteria.add(Restrictions.eq("bankName", bankName));
		List<BankDetails> bankList = criteria.list();
		tx.commit();
		session.close();
		return (bankList.isEmpty()) ? false : true;
	}

	public static boolean validateIFSCCode(String ifsccode) {
		sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		session = sessionfactory.openSession();
		tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankDetails.class);
		criteria.add(Restrictions.eq("ifsccode", ifsccode));
		List<BankDetails> bankList = criteria.list();
		tx.commit();
		session.close();
		return (bankList.isEmpty()) ? false : true;
	}

	public static boolean validateMobileNumber(String mobileNumber) {
		sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		session = sessionfactory.openSession();
		tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankDetails.class);
		criteria.add(Restrictions.eq("mobileNumber", mobileNumber));
		List<BankDetails> bankList = criteria.list();
		tx.commit();
		session.close();
		return (bankList.isEmpty()) ? false : true;
	}

	public static boolean validateEmail(String email) {
		sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		session = sessionfactory.openSession();
		tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankDetails.class);
		criteria.add(Restrictions.eq("email", email));
		List<BankDetails> bankList = criteria.list();
		tx.commit();
		session.close();
		return (bankList.isEmpty()) ? false : true;
	}

	public static void validateBankCreateion(BankDetails bao) {
		if (PIMSValidationUtil.validateBankName(bao.getBankName()))
			throw new PIMSRuntimeException(String.format(
					PIMSMessageUtil.BANK_MESSAGE_DETAILS.DUPLICATE_BANK_NAME_VALIDATION_MESSAGE, bao.getBankName()));
		if (PIMSValidationUtil.validateIFSCCode(bao.getIfsccode()))
			throw new PIMSRuntimeException(String.format(
					PIMSMessageUtil.BANK_MESSAGE_DETAILS.DUPLICATE_BANK_IFSC_VALIDATION_MESSAGE, bao.getIfsccode()));
		if (PIMSValidationUtil.validateMobileNumber(bao.getMobileNumber()))
			throw new PIMSRuntimeException(
					String.format(PIMSMessageUtil.BANK_MESSAGE_DETAILS.DUPLICATE_BANK_MOBILE_VALIDATION_MESSAGE,
							bao.getMobileNumber()));
		if (PIMSValidationUtil.validateEmail(bao.getEmail()))
			throw new PIMSRuntimeException(String.format(
					PIMSMessageUtil.BANK_MESSAGE_DETAILS.DUPLICATE_BANK_EMIAL_VALIDATION_MESSAGE, bao.getEmail()));
	}

}
