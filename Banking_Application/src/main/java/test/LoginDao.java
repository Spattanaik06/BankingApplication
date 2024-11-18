package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public BankBean bankBean=null;
	public BankBean login(String uname,String password,int accno)
	{
		Connection connection=DBConnection.getCon();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("select * from bankingapplication67 where account =? and uname=? and password=?");
			preparedStatement.setInt(1, accno);
			preparedStatement.setString(2,uname);
			preparedStatement.setString(3, password);
			ResultSet resultSet=preparedStatement.executeQuery();
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
