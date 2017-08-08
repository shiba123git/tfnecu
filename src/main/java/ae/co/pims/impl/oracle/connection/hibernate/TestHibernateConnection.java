/**
 * 
 */
package ae.co.pims.impl.oracle.connection.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ae.co.pims.common.BankDetails;

/**
 * @author Babu
 *
 */
public class TestHibernateConnection {

	public static void main(String[] args) {
		SessionFactory sessionfactory = HibernateAnnotationUtil.getSessionFactory();
		System.out.println("Session Factory::" + sessionfactory);
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		BankDetails bd = new BankDetails();
		bd.setAddress("Test");
		bd.setBankName("SBI");
		bd.setEmail("abc@gmail.com");
		bd.setIfsccode("SBI0002071");
		bd.setMobileNumber("7204118564");
		bd.setOnline(true);
		bd.setUrl("https://www.sbi.com");
		session.save(bd);
		tx.commit();
		session.evict(bd);
		session.close();
		System.out.println("Done");

	}

}
