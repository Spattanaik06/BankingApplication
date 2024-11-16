package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginBean implements Serializable
{
	private String accno,acountholder;
	private long accountbalance;
	public LoginBean() 
	{}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAcountholder() {
		return acountholder;
	}
	public void setAcountholder(String acountholder) {
		this.acountholder = acountholder;
	}
	public long getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(long accountbalance) {
		this.accountbalance = accountbalance;
	}
	
}
