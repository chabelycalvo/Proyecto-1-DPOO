package proyecto;

public abstract class Usuario{
	protected String login;
	protected String password;
	
public Usuario() {
	}
public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
}
