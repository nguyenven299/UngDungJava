package Lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh:");
		float canh = Sc.nextFloat();
		float theTich =(float) Math.pow(canh, 3);
		System.out.println("Thể tích khối lập phương:" +theTich);
	}

}
