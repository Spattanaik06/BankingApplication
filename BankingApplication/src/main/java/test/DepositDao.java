package test;

import java.sql.*;

public class DepositDao 
{
public int k=0;
public int deposit(long amount,String accno)
{
	try {
		Connection con=DBConnection.getCon();
		String query="Update BankAccount set accbalance=(accbalance + ?) where accno=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setLong(1, amount);
		ps.setString(2,accno);
		k=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return k;
	
}
}
