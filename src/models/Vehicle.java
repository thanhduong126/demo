package models;

public class Vehicle {
	private String tenXe;
	private String loaiXe;
	private String bienSo;

	public Vehicle() {
	}

	public Vehicle(String tenXe, String loaiXe, String bienSo) {
		this.tenXe = tenXe;
		this.loaiXe = loaiXe;
		this.bienSo = bienSo;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Override
	public String toString() {
		return "Vehicle: " +"\n"+
				"Tên xe: " + tenXe + "\n" +
				"Loại xe: " + loaiXe + "\n" +
				"Biển số: " + bienSo + "\n";
	}
}
