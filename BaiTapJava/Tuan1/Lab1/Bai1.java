package Lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main (String [] args)
	{
		Scanner Sc = new Scanner(System.in);
		String hoTen;
		double diem;
		System.out.println("Vui lòng nhập họ và tên của bạn:");
		hoTen = Sc.nextLine();
		 
		System.out.println("Nhập điểm của bạn:");
		diem = Sc.nextDouble();
		System.out.printf("%s %f điểm" ,hoTen ,diem);
	}

}
