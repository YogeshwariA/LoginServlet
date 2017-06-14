package com.yogu.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	@Override
	public void init() {
		System.out.println("Init called!");
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	doPost(request, response);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		String name = req.getParameter("username");
		String password = req.getParameter("password");
		if ("Ajith".equals(name) && "Ajith".equals(password)) {
			resp.getWriter().println("Login successfully!");
		} else {
			resp.getWriter().println("Please give correct username and password.");

		}

	}

	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// req.getRequestDispatcher("WEB-INF/index1.html").forward(req, resp);
		// resp.sendRedirect("/index.html");

	}
*/
	@Override
	public void destroy() {
		System.out.println("Completed");
		super.destroy();
	}

}
