package entity;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter

public class User {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	private Integer id;
	private String username;
	private String password;
	private String email;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
