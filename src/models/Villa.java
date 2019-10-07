package models;

public class Villa extends Services {
	private String tieuChuanPhong;
	private String tienNghiKhac;
	private double dienTichHoBoi;
	private int soTang;

	public Villa() {
	}

	@Override
	public String showInfor() {
		return super.toString() +"\n"+"Tiểu chuẩn phòng" + tieuChuanPhong + "\n" +
				"Tiện nghi khác: " + tienNghiKhac + "\n" +
				"Diện tích hồ bơi: " + dienTichHoBoi +"\n"+
				"Số tầng: " + soTang +"\n";
	}


	public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
		super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
	}

	public String getTieuChuanPhong(){
		return tieuChuanPhong;
	}
	public void setTieuChuanPhong(String tieuChuanPhong){
		this.tieuChuanPhong = tieuChuanPhong;
	}

	public String getTienNghiKhac(){
		return  tienNghiKhac;
	}
	public void setTienNghiKhac(String tienNghiKhac){
		this.tienNghiKhac = tienNghiKhac;
	}

	public double getDienTichHoBoi(){
		return dienTichHoBoi;
	}
	public void setDienTichHoBoi(double dienTichHoBoi){
		this.dienTichHoBoi= dienTichHoBoi;
	}

	public int getSoTang(){
		return soTang;
	}
	public void setSoTang(int soTang){
		this.soTang= soTang;
	}


}
