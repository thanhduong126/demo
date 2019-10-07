package service.impl;

public interface ServiceValidation {
	 void checkDientich(double area) throws Exception;
	 void checkChiPhiThue(double phiThue) throws Exception;

	 void checkSoLuongNguoiToiDa(int soNguoiToiDa) throws Exception;

	 void checkDichVuDiKem(String dichVuDiKem);

	 void checkQuyDinhSoTang(int quyDinhSoTang ) throws Exception;

}
