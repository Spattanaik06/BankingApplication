package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/deposit")
public class DepositServlet  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession httpSession=req.getSession(false);
		if(httpSession==null)
		{
			req.setAttribute("msg","Please Login First....");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else 
		{
			BankBean bankBean=(BankBean) httpSession.getAttribute("bbean");
			httpSession.setAttribute("bbean", bankBean);
			req.getRequestDispatcher("deposit.jsp").forward(req, resp);
			
		}
	}
}
