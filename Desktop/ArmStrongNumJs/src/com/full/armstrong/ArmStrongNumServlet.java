package com.full.armstrong;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ArmStrongNumServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		if ("get".equalsIgnoreCase(method)) {
			doGet(req, resp);
		} else {
			doPost(req, resp);
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/plain");
		req.getRequestDispatcher("/WEB-INF/armstrong_num.html").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("welcome!");
	}
}
