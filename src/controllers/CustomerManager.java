package controllers;
import User.ExceptionImpl;
import models.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
	static List<Customer> customers = new ArrayList<Customer>();

	public static void addNewCustomerForRen() {
		ExceptionImpl exceptionImpl = new ExceptionImpl();
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		boolean check;

		System.out.println("Họ tên Customer: ");
		customer.setHoTen(scanner.nextLine());

		do {
			try {
				flag = false;
				do {
					System.out.println("Nhập ngày sinh: ");
					String checkDate = scanner.nextLine();
					check = false;
					if (exceptionImpl.checkDateException(checkDate)) {
						customer.setNgaySinh(checkDate);
						check = true;
					} else {
						System.out.println("Nhập date lỗi");
					}
				} while (!check);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Nhập sai định dạng!");
			}
		} while (!flag);


		do {
			try {
				flag = false;
				do {
					System.out.println("Số chứng minh: ");
					String checkID = scanner.nextLine();
					check = false;
					if (exceptionImpl.checkIdChungMinhException(checkID)) {
						customer.setSoCmnd(checkID);
						check = true;
					} else {
						System.out.println("Nhập sai định dạng!");
					}
				} while (!check);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Nhập sai định dạng! Hãy nhập lại!");
			}
		} while (!flag);

		System.out.println("Nhập số điện thoại: ");
		customer.setSoDienThoai(scanner.nextInt());
		scanner.nextLine();
		do {
			try{
				flag = false;
				do {
					System.out.println("Nhập email: ");
					String checkEmail = scanner.nextLine();
					check = false;
					if (exceptionImpl.checkEmailException(checkEmail)){
						customer.setEmail(checkEmail);
						check = true;
					}else {
						System.out.println("Nhập sai định dạng!");
					}
				}while (!check);
				flag =true;
			}catch (Exception ex){
				System.out.println("Nhập sai đinh dạng! Hãy nhập lại!");
			}
		}while (!flag);

		System.out.println("Nhập giới tính: ");
		customer.setGioiTinh(scanner.nextLine());

		System.out.println("Loại Customer: ");
		customer.setLoaiCustomer(scanner.nextLine());

		System.out.println("Địa chỉ: ");
		customer.setDiaChi(scanner.nextLine());

		customers.add(customer);

	}

	public static void displayCustomer() {

		for (int i = 0; i < customers.size(); i++) {
			System.out.println("Customer: " + customers.get(i).toString());
		}
	}
}
