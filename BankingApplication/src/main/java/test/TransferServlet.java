package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/transfer")
public class TransferServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		String accno=req.getParameter("accno");
		long transferamount=Long.parseLong(req.getParameter("transfer"));
		LoginBean lb=(LoginBean) req.getSession(false).getAttribute("lbean");
		 int k1=new TransferDao().transfer(lb.getAccno(),transferamount);
		int k2=new TransactionReciverDao().recieve(accno,transferamount);
		
		if(k1>0&&k2>0)
		{
			req.setAttribute("msg", "Transaction Successfull");
			req.getRequestDispatcher("TransactionSuccess.jsp").forward(req, res);
			
		}	
		else
		{
			req.setAttribute("msg","invalid transaction .....");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		
		
	}
}
