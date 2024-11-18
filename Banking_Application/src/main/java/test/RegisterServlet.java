package test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/register11")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BankBean bankBean=new BankBean();
		bankBean.setUname(req.getParameter("uname"));
		bankBean.setPassword(req.getParameter("password"));
		bankBean.setAmount(Double.parseDouble(req.getParameter("amount")));
		bankBean.setAddress(req.getParameter("address"));
		bankBean.setPhno(req.getParameter("phno"));	
		int k=new RegisterDao().register(bankBean);
		if(k>0)
		{
			ServletContext sct=req.getServletContext();
			HttpSession hSession=req.getSession();
			hSession.setAttribute("bbean", bankBean);
			sct.setAttribute("bbean", bankBean);
			req.getRequestDispatcher("viewServlet").forward(req, res);
			
			
		}
	}

}
