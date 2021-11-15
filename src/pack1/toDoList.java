package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
	private ArrayList<String> toDoList;
	private String list;
	public void listOperator() {
		Scanner scan = new Scanner(System.in);
		toDoList = new ArrayList<String>();
		while(true) {
			System.out.println("Write your to-do list here...");
			list = scan.next();
			toDoList.add(list);
			System.out.println("Exit : 0");
			int exit = scan.nextInt();
			if(exit == 0) {
				break;
			}
		}
	}
	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}
	
}
