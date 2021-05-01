package odev2;

public class User {

	 private int id;
	 private String mail ;
	 private String userName;
	 private String password;
	
	
	public User(int id, String mail, String userName, String password) {
		super();
		this.id = id;
		this.mail = mail;
		this.userName = userName;
		this.password = password;
	}
	
	public int getId()
	{
	return id;
	}
	public void setId(int id)
	{
	this.id= id;
	}
	public String  getMail()
	{
	return mail;
	}
	public void setMail(String  mail)
	{
	this.mail= mail;
	}
	
	
	
	public String getuserName()
	{
	return userName;
	}
	public void setuserName(String userName)
	{
	this.userName=userName;
	}
	
	
	public String getpassword()
	{
	return password;
	}

	public void setpassword(String password)
	{
	this.password=password;
	}
	
}
