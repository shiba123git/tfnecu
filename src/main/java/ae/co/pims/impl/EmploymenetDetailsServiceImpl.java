/**
 * 
 */
package ae.co.pims.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ae.co.pims.common.EmployerDetails;
import ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil;

/**
 * @author shmi0516
 * @param <V>
 *
 */
public class EmploymenetDetailsServiceImpl implements EmploymenetDetailsService{

	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmploymenetDetailsServiceImpl.class);
	private static final String FULLY_QUALIFIED_CLASS_NAME = "ae.co.pims.impl.EmploymenetDetailsServiceImpl";
	private static SessionFactory sessionfactory = null;
	private static Session session = null;
	private static Transaction tx = null;
	@Override
	public boolean addEmployer(Object v) {
		return false;
	}

	@Override
	public boolean updateEmployer(Object v) {
		return false;
	}

	@Override
	public List<EmployerDetails> getEmployeerDetails() {
		List<EmployerDetails> employeerDetails=new ArrayList<EmployerDetails>();
		return employeerDetails;
	}

	@Override
	public List<EmployerDetails> getEmployeerbyName(String name) {
	    List<EmployerDetails> singleEmployeerList=new ArrayList<EmployerDetails>();
		return singleEmployeerList;
	}

	@Override
	public List getEmployeerbyTAN(String tanNo) {
		List<EmployerDetails> singleEmployeerTanList=new ArrayList<EmployerDetails>();
		sessionfactory=HibernateAnnotationUtil.getSessionFactory();
		session=sessionfactory.openSession();
		tx=session.beginTransaction();
		Criteria creteria=session.createCriteria(EmployerDetails.class);
		creteria.add(Restrictions.eq("tanNo", tanNo));
		singleEmployeerTanList=creteria.list();
		return singleEmployeerTanList;
	}

	@Override
	public List<EmployerDetails> getCurrentCompanyDetails() {
		
		List<EmployerDetails> currentCompanyDetails=new ArrayList<EmployerDetails>();
		sessionfactory=HibernateAnnotationUtil.getSessionFactory();
		session=sessionfactory.openSession();
		tx=session.beginTransaction();
		Criteria creteria=session.createCriteria(EmployerDetails.class);
		creteria.add(Restrictions.eq("isCurrentCompany", true));
		currentCompanyDetails=creteria.list();
		return currentCompanyDetails;
	}

}
