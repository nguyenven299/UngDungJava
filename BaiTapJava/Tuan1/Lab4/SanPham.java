package Lab4;

import java.util.Scanner;

public class SanPham {
	private String tenSP ;
	private double donGia;
	private double giamGia;
	
	
	
	public SanPham(String tenSP, double donGia, double giamGia) {
		
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}



	public SanPham(String tenSP, double donGia) {
		
		this.tenSP = tenSP;
		this.donGia = donGia;
	}



	public SanPham() {
		
	}



	public String getTenSP() {
		return tenSP;
	}



	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}



	public double getDonGia() {
		return donGia;
	}



	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}



	public double getGiamGia() {
		return giamGia;
	}



	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}



	private double getThueNhapKhau()
	{
		return this.getDonGia() *0.1; //quay lên chỗ double getDongia
		
	}
	public void nhap()
	{
		Scanner Sc = new Scanner (System.in);
		System.out.print("Nhập tên sản phẩm:");
		String tenSP = Sc.nextLine();
		this.setTenSP(tenSP);
		System.out.print("Nhập đơn giá sản phẩm");
		double donGia = Sc.nextDouble();
		this.setDonGia(donGia);
		System.out.print("Nhập giá giảm:");
		double giamGia =Sc.nextDouble();
		this.setGiamGia(giamGia);
	}
	public void xuat()
	{
		System.out.println("Tên Sản Phầm:" + this.getTenSP());
		System.out.println("Đơn Giá Sản Phẩm:" +this.getDonGia());
		System.out.println("Tiền Giảm Giá:" +this.getGiamGia());
		System.out.println("Thuế:" +this.getThueNhapKhau());
	}
	public void nhapMang ()
	{
		System.out.print("Nhập số lượng sản phẩm");
		Scanner Sc = new Scanner (System.in);
		int n = Sc.nextInt();
		SanPham[] Sp = new SanPham [n];
		for (int i =0; i< n; i++)
		{
			SanPham chuaSP = new SanPham();
			chuaSP.nhap();
			Sp[i] = chuaSP;
			
			
		}
		for(int i =0; i<n ; i++)
		{
			System.out.println("Tên Sản Phầm:" + Sp[i].getTenSP());
			System.out.println("Đơn Giá Sản Phẩm:" +Sp[i].getDonGia());
			System.out.println("Tiền Giảm Giá:" +Sp[i].getGiamGia());
			System.out.println("Thuế:" +Sp[i].getThueNhapKhau());
		}
	}
}




