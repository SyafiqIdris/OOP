package featurefour;

public class Registration {

	private int id;
	private String username;
	private String password;
	
	Registration(){
		id = 0;
		username = "";
		password = "";
	}
	
	public Registration (int newId, String newUsername, String newPassword) {
		id = newId;
		username = newUsername;
		password = newPassword;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setUsername(String newUsername) {
		username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return "Account registered" + "\n" + "ID:" + getId() + "\n" + "Username:" + getUsername() + "\n" + "Password:" + getPassword();
	}
}
