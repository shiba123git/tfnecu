/**
 * 
 */
package ae.co.pims.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Babu
 *
 */
@Controller
public class EmployerController {

	@RequestMapping(value = "/Login.spring", method = RequestMethod.POST)
	public ModelAndView processCrediential(@RequestParam("username") String username, @RequestParam String password) {

		String message = "Invalid Credientials";
		if (null != username && null != password) {
			if (username.equals(password)) {
				message = "Welcome " + username + "!!!";
			}
		}
		return new ModelAndView("result", "message", message);

	}

}
