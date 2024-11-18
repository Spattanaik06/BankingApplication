package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BankBean implements Serializable
{
	
	private String uname,password,address,phno;
	private double amount;
	private int accno;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public BankBean()
	{
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "BankBean [uname=" + uname + ", password=" + password + ", address=" + address + ", phno=" + phno
				+ ", amount=" + amount + ", accno=" + accno + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
