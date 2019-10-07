package controllers;

import models.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class VehicleManager {

	public static void addVehicle(){
		Set<Vehicle> vehicles = new HashSet<Vehicle>();

		vehicles.add(new Vehicle("Xe máy","Dream","43A-H1-34343"));
		vehicles.add(new Vehicle("Xe ô tô","Huyn dai","43A-A1-4444"));
		vehicles.add(new Vehicle("Xe mô tô","Z1000","75A-K1-6666"));
		vehicles.add(new Vehicle("Máy bay","AirLine","76A-K9-99999"));
		vehicles.add(new Vehicle("Trực thăng","VipVN","52A-G3-1111"));

		for (Vehicle s: vehicles){
			System.out.println(s);
		}
	}

//	public static void main(String[] args) {
//		addVehicle();
//	}

}
