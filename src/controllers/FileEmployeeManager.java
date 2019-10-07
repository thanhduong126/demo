package controllers;

import models.Employee;

import java.util.Stack;

public class FileEmployeeManager {
	public static void addEmployee(){
		Stack<Employee> employees = new Stack<Employee>();
		employees.push(new Employee("Hoàng Thanh Dương","09/02/1995","12121212121",156156156,"duong@gmail.com","Tiến sĩ","Giám đốc",10000000));
		employees.push(new Employee("Nguyễn Văn A","05/06/1992","415151514",48491919,"vana@gmail.com","Thạc sĩ","Phó Giám đốc",8000000));
		employees.push(new Employee("Nguyễn Văn B","02/02/1991","1212345321",324234256,"vanb@gmail.com","Đaị học","Trưởng phòng",7000000));
		employees.push(new Employee("Nguyễn Văn C","09/09/1990","1245642121",1561456456,"vanc@gmail.com","Cao Đẳng","Phó phòng",60000000));
		employees.push(new Employee("Nguyễn Văn D","20/10/1995","4564212121",4564564,"vand@gmail.com","Trung cấp","Nhân viên",5000000));

		for (Employee s:employees) {
			System.out.println(s);
		}
	}

}
