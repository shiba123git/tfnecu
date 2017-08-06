package ae.co.pims.web;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ae.co.pims.common.ModelConstant;

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1007870378736010547L;

	@Override
	public void init() {

	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter(ModelConstant.USER_LOGIN.USER_NAME);
		String password = request.getParameter(ModelConstant.USER_LOGIN.PASSWORD);
		HttpSession session = request.getSession();
		if (username.equals(password)) {
			RequestDispatcher rd = request.getRequestDispatcher(
					String.format(ModelConstant.USER_LOGIN.USER_HOME_LOCATION_URL, UUID.randomUUID(), session.getId()));
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void destroy() {

	}

}
