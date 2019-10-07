package models;

public class Room extends Services {
	private String dichVuMienPhi;


	 public Room(){
	 }

	@Override
	public String showInfor() {
		return super.toString() +"\n"+ "Dịch vụ miễn phí: " + dichVuMienPhi+"\n";
	}

	public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuMienPhi) {
		super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
		this.dichVuMienPhi = dichVuMienPhi;
	}

	public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
		super(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
	}

	public String getdichVuMienPhi() {
		return dichVuMienPhi;
	}

	public void setdichVuMienPhi(String dichVuMienPhi) {
		this.dichVuMienPhi = dichVuMienPhi;
	}


}
