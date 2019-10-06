package Lab2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		System.out.println("Nhập số điện của bạn:");
		Scanner Sc = new Scanner(System.in);
		float soDien = Sc.nextFloat();
		if(soDien <= 50)
		{
			float tienDien = soDien * 1000;
			System.out.println("Số tiền điện của bạn:"+tienDien);
		}
		else
		{
			float tienDien = (50*1000 + ((soDien-50)*1200));
			System.out.println("Số tiền của bạn:"+tienDien);
		}

	}

}
