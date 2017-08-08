/**
 * 
 */
package ae.co.pims.impl.oracle.connection.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shmi0516
 *
 */
public class HibernateAnnotationUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(HibernateAnnotationUtil.class);
	private static final String FULLY_QUALIFIED_CLASS_NAME = "ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil";
	private static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactory() {
		return (null != sessionfactory) ? sessionfactory
				: new AnnotationConfiguration()
						.configure("/ae/co/pims/impl/oracle/connection/hibernate/hibernate.cfg.xml")
						.buildSessionFactory();
	}
}
