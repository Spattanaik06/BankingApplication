package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class BankingLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		
		String accno=req.getParameter("accno");
		String accholder=req.getParameter("holder");
		LoginBean lb=new LoginDao().check(accno,accholder);
		
		if(lb==null)
		{
			req.setAttribute("msg", "Invalid Bank Account Details...");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("lbean", lb);
			req.getRequestDispatcher("LoginSuccess.jsp").forward(req, res);
		}
	}
}
