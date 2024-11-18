package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/viewServlet")
public class viewServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession hSession=req.getSession(false);
		ServletContext sct=req.getServletContext();
		if(hSession==null)
		{
			req.setAttribute("msg", "Invalid session");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
			
		}
		else 
		{
			BankBean bankBean= (BankBean) sct.getAttribute("bbean");
			String uname=bankBean.getUname();
			BankBean bankBean1=new ViewDao().view(uname);
			hSession.setAttribute("bbean",bankBean1);
			req.getRequestDispatcher("view.jsp").forward(req, resp);

			
			
		}
	}
}
