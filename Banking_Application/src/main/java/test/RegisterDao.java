package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
	public int k=0;
	public int register(BankBean bankBean)
	{
		
		Connection connection=DBConnection.getCon();
		try 
		{
			PreparedStatement pStatement=connection.prepareStatement("insert into BankingApplication67(uname,password,amount,address,phone) values (?,?,?,?,?)");
			pStatement.setString(1,bankBean.getUname());
			pStatement.setString(2, bankBean.getPassword());
			pStatement.setDouble(3,bankBean.getAmount());
			pStatement.setString(4, bankBean.getAddress());
			pStatement.setString(5,bankBean.getPhno());
			k=pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
		
	}
}
