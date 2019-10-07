package models;

public class House extends Services {
	private String tieuChuanPhong;
	private String tienNghiKhac;
	private int soTang;
	public House() {

	}

	@Override
	public String showInfor() {
		return super.toString()+"\n"+
				"Tiêu Chuẩn phòng: '" + tieuChuanPhong +"\n" +
				"Tiện nghi khác: " + tienNghiKhac  +"\n" +
				"Số tầng: " + soTang +"\n";
	}


	public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String tienNghiKhac, int soTang) {
		super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
		this.tieuChuanPhong = tieuChuanPhong;
		this.tienNghiKhac = tienNghiKhac;
		this.soTang = soTang;
	}

	public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
		super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
	}
	public String getTieuChuanPhong(){
		return tieuChuanPhong;
	}
	public void setTieuChuanPhong(String tieuChuanPhong){
		this.tieuChuanPhong= tieuChuanPhong;
	}
	public String getTienNghiKhac(){
		return tienNghiKhac;
	}
	public void setTienNghiKhac(String tienNghiKhac){
		this.tienNghiKhac= tienNghiKhac;
	}

	public int getSoTang(){
		return soTang;
	}
	public void setSoTang(int soTang){
		this.soTang=soTang;
	}


}
