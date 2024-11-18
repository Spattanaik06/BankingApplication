package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.exceptions.RSAException;

public class ViewDao 
{
	public BankBean bankBean=null;
	public BankBean view(String uname)
	{
		Connection connection=DBConnection.getCon();
		try {
			PreparedStatement pStatement=connection.prepareStatement("select * from bankingapplication67 where uname=?");
			pStatement.setString(1, uname);
			ResultSet resultSet = pStatement.executeQuery();
			if(resultSet.next())
			{
			bankBean=new BankBean();
			bankBean.setAccno(Integer.parseInt(resultSet.getString(1)));
			bankBean.setUname(resultSet.getString(2));
			bankBean.setPassword(resultSet.getString(3));
			bankBean.setAmount(Double.parseDouble( resultSet.getString(4)));
			bankBean.setAddress(resultSet.getString(5));
			bankBean.setPhno(resultSet.getString(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bankBean;
		
	}
}
