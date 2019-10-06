package Lab3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		System.out.println("Nhập số lượng học sinh:");
		Scanner Sc = new Scanner (System.in);
		int soLuong= Sc.nextInt();
		double [] diem = new double[soLuong];
		String [] ten = new String [soLuong];
		if (soLuong >0)
		{
			nhapmang(ten,diem);
			System.out.println("Danh sách học sinh:");
			xuatmang (ten,diem);
			System.out.println("Sắp xếp danh sách học sinh: ");
			sapxep(ten,diem);
		}
		else
		{
			System.out.println("Số lượng học sinh không hợp lệ.");
		}
		
}
	
	public static void nhapmang(String[] ten, double [] diem)
	{
		Scanner Sc = new Scanner(System.in);
		for (int i =0; i< ten.length;i++)
		{
			System.out.println("Nhập tên học sinh:" +i);
			Sc = new Scanner (System.in);
			ten[i] = Sc.nextLine();
			System.out.println("Nhập điểm học sinh:"+i);
			
			do
					{
				diem[i] = Sc.nextDouble();
				if (diem[i]<0|| diem[i]>10)
				{
					System.out.println("Điểm không hợp lệ. Vui lòng nhập lại:");
				}
					}
				while
					(diem[i] < 0 || diem[i] >10);
				
				
				
		}
			
	}
	public static void xuatmang (String [] ten, double [] diem)
	{
		 
		        for (int i = 1; i < ten.length; i++) {
		            System.out.print("Tên: " + ten[i] + " - Điểm = " + diem[i]);
		            if (diem[i] < 5) 
		            {
		                System.out.println(" - Học lực: Yếu");
		            }
		            else if (diem[i] < 6.5) 
		            {
		            
		            	System.out.println(" - Học lực: Trung bình");
		            } 
		            else if (diem[i] < 7.5) 
		            {
		                System.out.println(" - Học lực: Khá");
		            }
		            else if (diem[i] < 9) 
		            {
		                System.out.println(" - Học lực: Giỏi");
		            }
		            else
		            {
		                System.out.println(" - Học lực: Xuất sắc");
		            }
		        }
		
	}
	public static void sapxep (String [] ten, double [] diem)
	{
		for (int i = 0 ; i < diem.length; i++)
		{
			for (int j = i+1 ; j<diem.length;j++)
			{
				if (diem[i] > diem[j])
				{
					double tempDiem = diem[i];
					diem[i] = diem [j];
					diem[j] = tempDiem;
					
					String tempTen = ten[i];
					ten [i] = ten[j];
					ten [j] = tempTen;
					
				}
			}
		}

		for(int i=0;i<ten.length;i++)
		{
			System.out.println("Student " + (i+1));
			if(diem[i]>=9)
			{
				System.out.println("Tên học sinh: " + ten[i] +"\nĐiểm học sinh: " + diem[i] +"\nHọc Lực:: Xuất Sắc");
			}
			else if(diem[i] <9 && diem[i] >=7.5)
			{
				System.out.println("Tên học sinh: " + ten[i] +"\nĐiểm học sinh: " + diem[i]+"\nHọc Lực:: Giỏi");
			}
			else if(diem[i] <7.5 && diem[i] >=6.5)
			{
				System.out.println("Tên học sinh: " + ten[i] +"\nĐiểm học sinh: " + diem[i]+"\nHọc Lực:: Khá");
			}
			else if(diem[i] <6.5 && diem[i] >=5)
			{
				System.out.println("Tên học sinh: " + ten[i] +"\nĐiểm học sinh: " + diem[i]+"\nHọc Lực:: Trung Bình");
			}
			else
			{
				System.out.println("Tên học sinh: " + ten[i] +"\nĐiểm học sinh: " + diem[i]+"\nHọc Lực:: Yếu");
			}
		}
	}
}
	


