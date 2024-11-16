package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		long amount=Long.parseLong(req.getParameter("deposit"));
		HttpSession hs=req.getSession(false);
		LoginBean lb=(LoginBean)hs.getAttribute("lbean");
		int k=new DepositDao().deposit(amount,lb.getAccno());
		if(k>0)
		{
			req.setAttribute("msg", "Deposit Successful.....");
			req.getRequestDispatcher("DepositSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Invalid Amount...");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
	}
}
