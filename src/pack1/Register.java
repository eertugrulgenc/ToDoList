package pack1;

import java.util.ArrayList;

public class Register {
	private ArrayList<User> myReg = new ArrayList<User>();
	private User user;
	private boolean loginAccept = false;
	public void setRegister(String id, String password) {
		user = new User(id,password);
		myReg.add(user);
	}
	public void getUsers() {
		for(User u : myReg) {
			System.out.println(u.getId() + " : "+u.getPassword());
		}
	}
	
	public void login(String id, String password) {
		for(User u : myReg) {
			if(u.getId().equals(id) && u.getPassword().equals(password)) {
				loginAccept = true;
			}
		}
	
	}
	public boolean isLoginAccept() {
		return loginAccept;
	}
	public void setLoginAccept(boolean loginAccept) {
		this.loginAccept = loginAccept;
	}
	
}
