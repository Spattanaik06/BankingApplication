package test;

import java.io.IOException;

import com.mysql.cj.Session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession(false);
		if(httpSession==null)
		{
			req.setAttribute("msg", "Invalid session...");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else 
		{
			String uname=req.getParameter("uname");
			String password=req.getParameter("password");
			int accno=Integer.parseInt( req.getParameter("accno"));
			BankBean bankBean=new LoginDao().login(uname, password, accno);
			System.out.println(bankBean.toString());
			httpSession.setAttribute("bbean", bankBean);
			
			req.getRequestDispatcher("deposit.jsp").forward(req, resp);
			
		}
	}
}
