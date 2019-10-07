package controllers;

import models.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
	public static void addEmployee() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee employee1 = map.put(1, new Employee("Hoàng Thanh Dương", "09/02/1995", "4444444444", 324343224, "duong@gmail.com", "Đại học", "Giám Đốc", 8000000));
		Employee employee2 = map.put(2, new Employee("Trần Đức Toàn", "09/08/1980", "5555555555", 545464564, "toan@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee3 = map.put(3, new Employee("Nguyễn Thành Lâm", "09/08/2000", "666666666", 56765757, "lam@gmail.com", "Tiểu học", "Nhân Viên", 3000000));
		Employee employee4 = map.put(4, new Employee("Nguyễn Văn Chục", "09/08/1990", "6666666666", 22131231, "chuc@gmail.com", "Trung học phổ thông", "Trưởng phòng", 7000000));
		Employee employee5 = map.put(5, new Employee("Nguyễn Văn A", "09/08/1985", "777777777", 546464564, "vanA@gmail.com", "Trung học", "Nhân Viên", 6000000));
		Employee employee6 = map.put(6, new Employee("Nguyễn Văn B", "09/08/1981", "888888888", 54654654, "vanB@gmail.com", "Trung học", "Phó Phòng", 7000000));
		Employee employee7 = map.put(7, new Employee("Nguyễn Văn C", "10/08/1985", "99999999", 545464655, "vanC@gmail.com", "Trung học cơ sở", "Nhân Viên", 5000000));
		Employee employee8 = map.put(8, new Employee("Nguyễn Văn D", "15/02/1994", "59595959", 545464564, "vanE@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee9 = map.put(9, new Employee("Nguyễn Văn E", "09/12/1983", "555995555", 959595555, "vanF@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee10 = map.put(10, new Employee("Lê Văn Luyện", "19/10/1989", "555959255", 62929255, "vanP@gmail.com", "Trung học", "Nhân Viên", 5500000));

		for (int i = 1; i <= map.size(); i++) {
			System.out.println("Key: "+i+"\n" +map.get(i));
		}

		}
	}





