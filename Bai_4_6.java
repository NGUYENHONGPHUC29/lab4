package lab4;

import java.util.Scanner;
import java.math.*;

abstract class CongNhan{
	protected String hoTen;
	protected String diaChi;
	protected String loaiCN;
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên công nhân : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ : ");
		diaChi = sc.nextLine();
		System.out.println("Nhập loại công nhân : ");
		loaiCN = sc.nextLine();
	}
	
	public abstract void tinhLuong();
	
	public void inThongTin() {
		System.out.println("Họ tên : " + hoTen);
		System.out.println("Địa chỉ : " + diaChi);
		System.out.println("Loại công nhân : " + loaiCN);
	}
}

class CNKSP extends CongNhan{
	private int thuong;
	private int donGiaSP = 100000;
	private int soSP;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số sản phẩm : ");
		soSP = sc.nextInt();
	}
	
	public void tinhLuong() {
		if(soSP >= 150) {
			thuong = 1500000;
		}else if(soSP >= 100) {
			thuong = 1000000;
		}else thuong = 0;
		int luongThang = soSP * donGiaSP + thuong;
		System.out.println("Lương tháng : " + luongThang);
	}
}

class CNTCN extends CongNhan{
	private int luongCB = 2000000;
	private double heSoLuong;
	private double thuong;
	private int soNgay;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số lương : ");
		heSoLuong = sc.nextDouble();
		System.out.println("Nhập số ngày công : ");
		soNgay = sc.nextInt();
	}
	
	public void tinhLuong() {
		if(soNgay < 20) {
			thuong = 0;
		}else thuong = 1.2 * luongCB;
		double luongThang = luongCB * heSoLuong + thuong;
		System.out.println("Lương tháng : " + luongThang);
	}
}

public class Bai_4_6 {
	public static void main(String[] args) {
		CNKSP cnksp1 = new CNKSP();
		CNTCN cntcn1 = new CNTCN();
		
		cnksp1.nhapThongTin();
		cnksp1.inThongTin();
		cnksp1.tinhLuong();
		
		System.out.println("\n");
		cntcn1.nhapThongTin();
		cntcn1.inThongTin();
		cntcn1.tinhLuong();
	}
}