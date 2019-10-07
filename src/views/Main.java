package views;
import controllers.*;

import java.io.IOException;
import java.util.Scanner;
public class Main {
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
     	Main main = new Main();
		disPlayManuManager();
		int choice=scanner.nextInt();
		while (choice!=0){
		switch (choice) {
			case 1:
				main.controllerService();
				break;
			case 2:
				main.controllerCustomer();
				break;
			case 3:
				main.displayEmployee();
				break;
			case 4:
				main.displayVehicle();
				break;
			case 5:
				main.displayCinema();
				break;
			case 6:
				main.displayFileEmployee();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Nhập sai hãy nhập lại!");
      }
			disPlayManuManager();
		choice= scanner.nextInt();
		}
	}
	public void controllerService() {
			disPlayManu();
		int choice = scanner.nextInt();
		scanner.nextLine();
		while (choice != 0) {
			switch (choice) {
				case 1:
					ServiesManager.newRoom();
					break;
				case 2:
					ServiesManager.newVilla();
					break;
				case 3:
					ServiesManager.newHouse();
					break;
				case 4:
					ServiesManager.displayAllService();
					break;
				case 5:
					ServiesManager.show();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Nhập sai số!");
					break;
			}
			disPlayManu();
			choice = scanner.nextInt();

		}
	}
		public void controllerCustomer() throws IOException {
		disPlayManuCustomer();
		int choise =scanner.nextInt();

		while (choise!=0){
			switch (choise){
				case 1:
					CustomerManager.addNewCustomerForRen();
					break;
				case 2:
					CustomerManager.displayCustomer();
					break;
				case 3:
					SaveFileCustomerManager.SaveFileCustomer();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Nhập sai số! Vui lòng nhập lại");
					break;
			}
			disPlayManuCustomer();
			choise = scanner.nextInt();
		}
		}
	public static void disPlayManuCustomer(){
		System.out.println("Hãy chọn số để nhập một Customer: ");
		System.out.println("1.Chọn để nhập Customer");
		System.out.println("2.Hiển thị tất cả Customer");
		System.out.println("3.Save All file Customers");

	}
	public static void disPlayManuManager(){
		System.out.println("Hãy chọn chương trình bạn muốn chạy:");
		System.out.println("1.Add NewServices");
		System.out.println("2.Add New Customer ForRen: ");
		System.out.println("3.Display Employee");
		System.out.println("4.Display Vehicle");
		System.out.println("5.Display Cinema");
		System.out.println("6.Display files Employee");
		System.out.println("0.Exit.");
	}
		public static void disPlayManu(){
			System.out.println("Hãy chọn số để nhập vào một NewSercive!");
			System.out.println("1.Chọn để nhập Room");
			System.out.println("2.Chọn để nhập Villa");
			System.out.println("3.Chọn để nhập House");
			System.out.println("4.Hiển thị All Service");
			System.out.println("5.Sắp xếp Service");
			System.out.println("0.Thoát");
		}

		public static void displayEmployee(){
			EmployeeManager.addEmployee();
		}

		public static void displayVehicle(){
			VehicleManager.addVehicle();
		}

		public static void displayCinema(){
			CinemaManager.addCinema();
		}
		public static void displayFileEmployee(){
		FileEmployeeManager.addEmployee();
		}
//public void runVilla(){
//		ServiesManager.newVilla();
//}
//public void runHouse(){
//		ServiesManager.newHouse();
//}
//public void runRoom(){
//		ServiesManager.newRoom();
//}
}
