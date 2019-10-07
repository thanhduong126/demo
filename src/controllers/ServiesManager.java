package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;
import service.ServiceValidationimpl;
import java.util.*;
public class ServiesManager {
	static List<House> houses = new ArrayList<House>();
	static List<Room> rooms = new ArrayList<Room>();
	static List<Villa> villas = new ArrayList<Villa>();
	static List<Services> services = new ArrayList<>();

	public static void show() {
		addList();
		for(Services service:services) {
			System.out.println(service.showInfor());
		}
		services=new ArrayList<>();
	}
	public static void addList() {
		for (Villa villa : villas) {
			services.add(villa);
		}
		for (Room room : rooms) {
			services.add(room);
		}
		for (House house : houses) {
			services.add(house);
		}
		Collections.sort(services, new Comparator<Services>() {
			@Override
			public int compare(Services o1, Services o2) {
				return o1.getTenDichVu().compareTo(o2.getTenDichVu());
			}
		});

	}
	public static void newVilla() {
		Scanner scanner = new Scanner(System.in);
		Villa villa = new Villa();
		ServiceValidationimpl service = new ServiceValidationimpl();
		System.out.println("Tên dịch vụ: ");
		villa.setTenDichVu(scanner.nextLine());

		boolean flag = false;
		do {
			try {
				flag = false;
				System.out.println("Nhập diện tích: ");
				int area = scanner.nextInt();
				service.checkDientich(area);
				villa.setDienTichSuDung(area);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải lớn hơn 30." + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);

		do {
			try {
				flag = false;
				System.out.println("Nhập chi phí thuê: ");
				int phiThue = scanner.nextInt();
				service.checkChiPhiThue(phiThue);
				villa.setChiPhiThue(phiThue);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải là số dương" + "\n" + "Lỗi: " + ex.getMessage());
			}

		} while (!flag);


		do {
			try {
				flag = false;
				System.out.println("Nhập số người: ");
				int soNguoi = scanner.nextInt();
				service.checkSoLuongNguoiToiDa(soNguoi);
				villa.setSoNguoiToiDa(soNguoi);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Số người phải từ 0 đến 20" + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		scanner.nextLine();
		System.out.println("Kiểu thuê: ");
		villa.setKieuThue(scanner.nextLine());


		System.out.println("Tiêu chuẩn phòng: ");
		villa.setTieuChuanPhong(scanner.nextLine());

		System.out.println("Tiện nghi khác: ");
		villa.setTienNghiKhac(scanner.nextLine());

		System.out.println("Diện tích hồ bơi: ");
		villa.setDienTichHoBoi(scanner.nextDouble());

		do {
			try {
				flag = false;
				System.out.println("Nhập vào số tầng: ");
				int soTang = scanner.nextInt();
				service.checkQuyDinhSoTang(soTang);
				villa.setSoTang(soTang);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Số tầng phải lớn hơn 0" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		villas.add(villa);

	}

	public static void newHouse() {
		Scanner scanner = new Scanner(System.in);
		House house = new House();
		ServiceValidationimpl service = new ServiceValidationimpl();
		System.out.println("Tên dịch vụ: ");
		house.setTenDichVu(scanner.nextLine());
		boolean flag = false;
		do {
			try {
				flag = false;
				System.out.println("Nhập diện tích: ");
				int area = scanner.nextInt();
				service.checkDientich(area);
				house.getDienTichSuDung(area);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải lớn hơn 30." + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);


		do {
			try {
				flag = false;
				System.out.println("Nhập chi phí thuê: ");
				int phiThue = scanner.nextInt();
				service.checkChiPhiThue(phiThue);
				house.setChiPhiThue(phiThue);
				flag = true;

			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải là số dương" + "\n" + "Lỗi: " + ex.getMessage());
			}

		} while (!flag);
		do {
			try {
				flag = false;
				System.out.println("Nhập số người: ");
				int soNguoi = scanner.nextInt();
				service.checkSoLuongNguoiToiDa(soNguoi);
				house.setSoNguoiToiDa(soNguoi);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Số người phải từ 0 đến 20" + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		scanner.nextLine();

		System.out.println("Kiểu thuê : ");
		house.setKieuThue(scanner.nextLine());

		System.out.println("Tiêu chuẩn phòng: ");
		house.setTieuChuanPhong(scanner.nextLine());

		System.out.println("Tiện nghi khác");
		house.setTienNghiKhac(scanner.nextLine());

		do {
			try {
				flag = false;
				System.out.println("Nhập vào số tầng: ");
				int soTang = scanner.nextInt();
				service.checkQuyDinhSoTang(soTang);
				house.setSoTang(soTang);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Số tầng phải lớn hơn 0" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		houses.add(house);
	}

	public static void newRoom() {
		Scanner scanner = new Scanner(System.in);

		Room room = new Room();
		ServiceValidationimpl service = new ServiceValidationimpl();
		System.out.println("Tên dịch vụ: ");
		room.setTenDichVu(scanner.nextLine());

		boolean flag = false;
		do {
			try {
				flag = false;
				System.out.println("Nhập diện tích: ");
				int area = scanner.nextInt();
				service.checkDientich(area);
				room.setDienTichSuDung(area);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải lớn hơn 30." + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);

		do {
			try {
				flag = false;
				System.out.println("Nhập chi phí thuê: ");
				int phiThue = scanner.nextInt();
				service.checkChiPhiThue(phiThue);
				room.setChiPhiThue(phiThue);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải là số dương" + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);

		do {
			try {
				flag = false;
				System.out.println("Nhập số người: ");
				int soNguoi = scanner.nextInt();
				service.checkSoLuongNguoiToiDa(soNguoi);
				room.setSoNguoiToiDa(soNguoi);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Số người phải từ 0 đến 20" + "\n" + "Lỗi " + ex.getMessage());
			}
		} while (!flag);
		scanner.nextLine();

		System.out.println("Kiểu thuê:");
		room.setKieuThue(scanner.nextLine());


		System.out.println("Dịch vụ miễn phí đi kèm: ");
		room.setdichVuMienPhi(scanner.nextLine());


		rooms.add(room);
	}

	public static void displayAllService() {

		for (int i = 0; i < houses.size(); i++) {
			System.out.println("House: " + houses.get(i).showInfor());
		}
		for (int j = 0; j < rooms.size(); j++) {
			System.out.println("Room: " + rooms.get(j).showInfor());
		}
		for (int a = 0; a < villas.size(); a++) {
			System.out.println("Villa: " + villas.get(a).showInfor());
		}
	}

}
