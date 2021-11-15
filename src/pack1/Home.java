package pack1;

import java.util.Scanner;

public class Home {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		Register reg = new Register(); //This call register class
		String reg_id,reg_password; // This parameters used in case 1   
		int choose; // choose parameters for switch case 
		boolean flag = true; // This parameter using in while loop
		while(flag) {
			System.out.println("1-Register\n2-Login\n3-Exit");
			choose = scan.nextInt();
		switch(choose) {
		case 1: {
			System.out.println("Kullanýcý ID : ");
			reg_id = scan.next();
			System.out.println("Password : ");
			reg_password = scan.next();
			reg.setRegister(reg_id,reg_password);
			break;
		}
		case 2: 
		{
			System.out.println("Please enter user id : ");
			String log_id = scan.next();
			System.out.println("Please enter user password : ");
			String log_password = scan.next();
			reg.login(log_id,log_password);
			if(reg.isLoginAccept() == true) {
				System.out.println("Connection Succefuly...");
				toDoList toDo = new toDoList();
				toDo.listOperator();
				flag = false;
			}
			else {
				System.out.println("Wrong id or password try again...");
			}
			break;
		}
		case 3:{
			System.out.println("Exit : 0");
			int exit = scan.nextInt();
			if(exit == 0) {
				flag = false;
				break;
			}
			else {
				System.out.println("Try again...");
				break;
			}
		}
		default: 
			System.out.println("Try again...");
			break;
			}
		}
		reg.getUsers();
		
	}

}
