/**
 * 
 */
package ae.co.pims.impl;

import java.util.List;

import ae.co.pims.common.EmployerDetails;

/**
 * @author shmi0516
 * @param <V>
 *
 */
public interface EmploymenetDetailsService {
	
	public boolean addEmployer(Object obj);
	public boolean updateEmployer(Object obj);
	public List<EmployerDetails> getEmployeerDetails();
	public List<EmployerDetails> getEmployeerbyName(String name);
	public List<EmployerDetails> getEmployeerbyTAN(String tanNo);
	public List<EmployerDetails> getCurrentCompanyDetails();
	
	

}
