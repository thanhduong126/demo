package models;

public abstract class Location {
	private String hoTen;
	private String ngaySinh;
	private String soCmnd;
	private int soDienThoai;
	private String email;
	public Location(){
	}
	public Location(String hoTenCustomer, String ngaySinhCustomer, String soCmndCustomer, int soDtCustomer, String emailCustomer){
		this.hoTen = hoTenCustomer;
		this.ngaySinh = ngaySinhCustomer;
		this.soCmnd = soCmndCustomer;
		this.soDienThoai = soDtCustomer;
		this.email = emailCustomer;
	}

	public String getHoTen(){
		return hoTen;
	}
	public void setHoTen(String hoTen){
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh){
		this.ngaySinh = ngaySinh;
	}

	public String getSoCmnd(){
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd){
		this.soCmnd = soCmnd;
	}
	public int getSoDienThoai(){
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai){
		this.soDienThoai = soDienThoai;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString() {
		return
				"Họ tên : " + hoTen + "\n" +
				"Ngày sinh : " + ngaySinh +"\n"+
				"Số chứng minh thư : " + soCmnd +"\n"+
				"Số điện thoại : " + soDienThoai +"\n"+
				"Email : " + email + "\n";

	}
}
