/**
 * 
 */
package ae.co.pims.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ae.co.pims.common.EmployerDetails;
import ae.co.pims.impl.EmploymenetDetailsService;
import ae.co.pims.impl.EmploymenetDetailsServiceImpl;

/**
 * @author Babu
 *
 */
@Controller
public class EmployerController {

	EmploymenetDetailsService employerService = new EmploymenetDetailsServiceImpl();
	private final static String YES = "Yes";
	private final static String NO = "No";

	@RequestMapping(value = "/createEmployer.spring", method = RequestMethod.POST)
	public ModelAndView createEmployer(@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("fdate") String fromDate, @RequestParam("toDate") String toDate,
			@RequestParam("pfNumber") String pfNumber, @RequestParam("address") String tanNo,
			@RequestParam("employeeId") String employeeId, @RequestParam("address") String isCurrentCompany) {

		boolean isCC = (isCurrentCompany.equalsIgnoreCase(YES)) ? true : false;
		EmployerDetails ed = new EmployerDetails();
		ed.setName(name);
		ed.setAddress(address);
		ed.setEmployeeId(employeeId);
		ed.setPfNumber(pfNumber);
		ed.setTanNo(tanNo);
		ed.setCurrentCompany(isCC);
		employerService.addEmployer(ed);
		String message = "Hello";
		return new ModelAndView("result", "message", message);

	}

}
