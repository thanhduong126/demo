package models;

import java.io.Serializable;
import java.util.Date;

public class Customer extends Location implements Serializable {
	private String gioiTinh;
	private String loaiCustomer;
	private String diaChi;
	public Customer(){

	}
	public Customer(String hoTenCustomer, String ngaySinhCustomer, String soCmndCustomer, int soDtCustomer, String emailCustomer, String gioiTinh, String loaiCustomer, String diaChi) {
		super(hoTenCustomer, ngaySinhCustomer, soCmndCustomer, soDtCustomer, emailCustomer);
		this.gioiTinh = gioiTinh;
		this.loaiCustomer = loaiCustomer;
		this.diaChi = diaChi;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh){
		this.gioiTinh= gioiTinh;
	}

	public String getLoaiCustomer(){
		return loaiCustomer;
	}
	public void setLoaiCustomer(String loaiCustomer){
		this.loaiCustomer= loaiCustomer;
	}

	public String getDiaChi(){
		return diaChi;
	}
	public void setDiaChi(String diaChi){
		this.diaChi= diaChi;
	}

	@Override
	public String toString() {
		return super.toString()+
				"Giới tính: " + gioiTinh + "\n" +
				"Loại khách hàng: " + loaiCustomer + "\n" +
				"Địa chỉ khách hàng: " + diaChi + "\n";
	}
}
