package models;

import java.util.Date;

public class Employee extends Location {
	private String trinhDo;
	private String viTri;
	private double luong;

	public Employee(){

	}

	public Employee(String hoTenCustomer, String ngaySinhCustomer, String soCmndCustomer, int soDtCustomer, String emailCustomer, String trinhDo, String viTri, double luong) {
		super(hoTenCustomer, ngaySinhCustomer, soCmndCustomer, soDtCustomer, emailCustomer);
		this.trinhDo = trinhDo;
		this.viTri = viTri;
		this.luong = luong;
	}

	public String getTrinhDo(){
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo){
		this.trinhDo = trinhDo;
	}

	public String getViTri(){
		return viTri;
	}
	public void setViTri(String viTri){
		this.viTri=viTri;
	}

	public double getLuong(){
		return luong;
	}
	public void setLuong(double luong){
		this.luong=luong;
	}

	@Override
	public String toString() {
		return super.toString() +
				"Trình độ: " + trinhDo +"\n" +
				"Vị trí: " + viTri + "\n" +
				"Lương: " + luong +"\n";
	}
}
