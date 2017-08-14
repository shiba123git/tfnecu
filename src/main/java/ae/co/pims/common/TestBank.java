/**
 * 
 */
package ae.co.pims.common;

import java.math.BigInteger;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil;

/**
 * @author Babu
 *
 */
public class TestBank {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		BankDetails bad = (BankDetails) session.load(BankDetails.class, new BigInteger("911235689789498"));
		System.out.println("Before Change  " + bad.getEmail());
		session.close();
		bad.setEmail("shiba@sbi.com");
		System.out.println("After Change  " + bad.getEmail());
		Session session1 = sessionfactory.openSession();
		Transaction tx1 = session1.beginTransaction();
		BankDetails bad1 = (BankDetails) session1.load(BankDetails.class, new BigInteger("911235689789498"));
		session1.merge(bad);
		tx1.commit();
		session1.close();
		System.out.println("After Executing the merge method::" + bad1.getEmail());
	}

}
