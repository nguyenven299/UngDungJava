package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main (String [] args)
	{
		System.out.println("Nhập 2 cạnh của bạn:");
		Scanner Sc = new Scanner (System.in);
		float canh1 = Sc.nextFloat();
		float canh2 = Sc.nextFloat();
		float chuVi= (canh1 + canh2) *2;
		float dienTich = (canh1 * canh2);
		float canhMin = Math.min(canh1, canh2);
		System.out.printf("Chu Vi:" +chuVi +"\nDiện Tích:" +dienTich+"\nCạnh nhỏ nhất:"+canhMin);
	}

}
