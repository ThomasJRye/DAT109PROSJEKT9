package back;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


public class User {
	public String username;
	public String password;
	public String navn;
	public String epost;

	public User(String username, String password, String navn, String epost) {
		super();
		this.username = username;
		this.password = password;
		this.navn = navn;
		this.epost = epost;
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

	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getEpost() {
		return epost;
	}
	public void setEpost(String epost) {
		this.epost = epost;
	}
}
