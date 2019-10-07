package controllers;

import models.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class CinemaManager {
	public static void addCinema(){
		Queue<Customer> customers = new LinkedList<Customer>();
		customers.add(new Customer("Hoàng Thanh Dương","09/02/1995","12345678901",949494949,"duong@gmail.com","Nam","Vip","Huế"));
		customers.add(new Customer("Nguyễn Văn Dương","20/02/1995","1119929442",294279217,"duongqua@gmail.com","Nam","Nomal","Đà Nẵng"));
		customers.add(new Customer("Nguyễn Văn A","06/12/1990","12345345",949443539,"vanA12@gmail.com","Nam","Vip","Quảng Nam"));
		customers.add(new Customer("Nguyễn Văn B","05/06/1989","12343534534",97456465,"vanB23@gmail.com","Nữ","Vip","Quảng Trị"));
		customers.add(new Customer("Hoang Thanh Duong","01/06/1990","422328901",32424329,"vanC@gmail.com","Nữ","Vip","Quảng Bình"));

		for (Customer s: customers){
			System.out.println(s);
		}
	}
}
