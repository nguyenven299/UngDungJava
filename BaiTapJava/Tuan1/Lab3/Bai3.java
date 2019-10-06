package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String [] args)
	{
		
			Scanner Sc = new Scanner (System.in);
			System.out.println("Nhập số phần tử của mảng:");
			int n = Sc.nextInt();
			double []mang =new double [n];
			System.out.println("Nhập mảng");
			for(int  i =0; i<n;i++)
			{
				System.out.printf("a[%d]\n",i);
				mang[i]= Sc.nextDouble();

			}
			System.out.println("các phần tử mảng:"+Arrays.toString(mang));
			sapXep (mang);
			soSanh (mang);
			trungBinhCong(mang);
	}
		
		private static void sapXep(double[]mang)
		{
			Arrays.sort(mang);
			System.out.println("\nSắp xếp các phần tử:"+ Arrays.toString(mang));
		}
		private static void soSanh (double [] mang)
		{
			double min = mang[0];
			for (int i = 0; i<mang.length-1;i++)
			{
				double Min = Math.min(min, mang[i]);
				System.out.println("số bé:"+Min);
			}
		}
		private static void trungBinhCong(double[]mang)
		{
			double tong = 0, dem =0;
			for(int i =0; i<mang.length;i++)
			{
				
				if(mang [i] %3 ==0)
				{
					
					tong += mang[i];
					dem ++;
					
				}
			}
			double trungBinhCong= tong /dem;
			System.out.println("" +trungBinhCong);
			
		}
	
	}

