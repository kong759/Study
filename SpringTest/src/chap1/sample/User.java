package chap1.sample;

public class User {
	private String id;
	private String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
	

	public void changePassword(String oldPassword, String newPassword) {
		if (!matchPassword(oldPassword)) {
			throw new IllegalArgumentException("illegal password");
		} else {
			password = newPassword;
		}
	}

	public boolean matchPassword(String inputPasswd) {
		return password.equals(inputPasswd);
	}
	
	
	
}
