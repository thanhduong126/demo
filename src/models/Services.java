package models;

public abstract class Services {
	private String tenDichVu;
	private double dienTichSuDung;
	private double chiPhiThue;
	private int soNguoiToiDa;
	private String kieuThue;
//	private static int service_count = 0;
	public Services() {
	}
//	public static int getService_count() {
//		return service_count;
//	}
//
//	public static void setService_count(int service_count) {
//		Services.service_count = service_count;
//	}

	public abstract String  showInfor();

	public Services(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue){
		this.tenDichVu=tenDichVu;
		this.dienTichSuDung=dienTichSuDung;
		this.chiPhiThue = chiPhiThue;
		this.soNguoiToiDa=soNguoiToiDa;
		this.kieuThue = kieuThue;
	}

	public String getTenDichVu(){
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu){
		this.tenDichVu = tenDichVu;
	}
	public double getDienTichSuDung(int area){
		return dienTichSuDung;
	}
	public void setDienTichSuDung(double dienTichSuDung){
		this.dienTichSuDung= dienTichSuDung;
	}

	public double getChiPhiThue(){
		return chiPhiThue;
	}
	public void setChiPhiThue(double chiPhiThue){
		this.chiPhiThue = chiPhiThue;
	}
	public int getSoNguoiToiDa(){
		return soNguoiToiDa;
	}
	public void setSoNguoiToiDa( int soNguoiToiDa){
		this.soNguoiToiDa = soNguoiToiDa;
	}
	public String getKieuThue(){
		return kieuThue;
	}
	public void setKieuThue(String kieuThue){
		this.kieuThue= kieuThue;
	}



	public String toString(){
		return "Tên dịch vụ: "+tenDichVu+"\n"+
				"Diện tích sử dụng: " + dienTichSuDung+"\n"+
				"Chi phi thue: " + chiPhiThue+"\n"+
				"Số người tối đa: "+ soNguoiToiDa+"\n"+
				"Kiểu thuê: "+ kieuThue;
	}


}
