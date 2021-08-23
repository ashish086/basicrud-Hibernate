



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Users 
{
	@Id
	@Column(name="userid")
	int userid;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="first_name")
	String first_name;
	
	@Column(name="last_name")
	String last_name;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/* Create */
	public Users(String username, String password, String first_name, String last_name) 
	{
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	
	/*Retrieve*/
	public Users(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) 
	{
	
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + "]";
	}

	

}
