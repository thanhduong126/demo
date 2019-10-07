package service;

import service.impl.ServiceValidation;

public class ServiceValidationimpl implements ServiceValidation {


	public ServiceValidationimpl() {
	}

	@Override
	public void checkDientich(double area) throws Exception{
		if (area<30){
			throw new Exception("Nhập vào không hợp lệ!");
		}
	}

	@Override
	public void checkChiPhiThue(double phiThue) throws  Exception{
			if (phiThue<0){
				throw new Exception("Nhập vào không hợp lệ!");

			}
	}

	@Override
	public void checkSoLuongNguoiToiDa(int soNguoiToiDa) throws Exception{
		if (soNguoiToiDa<0 || soNguoiToiDa>20){
			throw new Exception("Nhập vào không hợp lệ");
		}
	}

	@Override
	public void checkDichVuDiKem(String dichVuDiKem) {
	}

	@Override
	public void checkQuyDinhSoTang(int quyDinhSoTang) throws Exception {
		if(quyDinhSoTang<0){
			throw new Exception("Nhập vào không hợp lệ");
		}
	}



}
