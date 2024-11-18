package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepositAmountDao 
{
	public int k=0;
	public int deposit(String uname,Double amount)
	{	
		Connection connection=DBConnection.getCon();
		String query="update bankingapplication67 set amount=amount + ? where uname=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setDouble(1, amount);
			preparedStatement.setString(2, uname);
			k=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return k;
		
	}
}
