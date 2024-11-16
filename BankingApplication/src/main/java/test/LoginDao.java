package test;

import java.sql.*;

public class LoginDao 
{
	public LoginBean lb=null;
	public LoginBean check(String accno,String holder)
	{
		try {
			Connection con=DBConnection.getCon();
			String query="select * from BankAccount where accno=? and accholder=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, accno);
			ps.setString(2, holder);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				lb=new LoginBean();
				lb.setAccno(rs.getString(1));
				lb.setAcountholder(rs.getString(2));
				lb.setAccountbalance(rs.getLong(3));
			}
		}
		catch (Exception e) 
		{

			e.printStackTrace();
		}
		return lb;
		
	}
}
