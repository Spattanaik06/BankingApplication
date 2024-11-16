package test;
import java.sql.*;
public class TransferDao 
{
	public int k=0;
	public int transfer(String acno,long amount)
	{
		try {
			Connection con=DBConnection.getCon();
			String query="update BankAccount set accbalance=accbalance - ? where accno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setLong(1, amount);
			ps.setString(2, acno);
			k=ps.executeUpdate();

		
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
				
		return k;
		
	}
}
