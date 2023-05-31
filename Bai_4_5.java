package lab4;

import java.util.Scanner;

abstract class GiangVien{
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên giảng viên : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ : ");
		diaChi = sc.nextLine();
		System.out.println("Nhập loại giảng viên : ");
		loaiGV = sc.nextLine();
	}
	
	public abstract void tinhLuong();
	
	public void inThongTin() {
		System.out.println("Họ tên : " + hoTen);
		System.out.println("Địa chỉ : " + diaChi);
		System.out.println("Loại giảng viên : " + loaiGV);
	}
	
}

class GVCoHuu extends GiangVien{
	private double heSoLuong;
	private int luongCB = 2000000;
	private int thamNien;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số lương : ");
		heSoLuong = sc.nextDouble();
		System.out.println("Nhập năm thâm niên : ");
		thamNien = sc.nextInt();
	}
	
	public void tinhLuong() {
		double phuCap = 0;
		if(thamNien < 5) {
			phuCap = 0/100 * luongCB;
		}else if(thamNien == 5) {
			phuCap = 5/100 * luongCB;
		}else {
			phuCap = thamNien/100 * luongCB;
		}
		double luongThang = luongCB * heSoLuong + phuCap;
		System.out.println("Lương tháng : " + luongThang);
	}
}

class GVThinhGiang extends GiangVien{
	private int soTiet;
	private int donGia = 200000;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiết dạy : ");
		soTiet = sc.nextInt();
	}
	public void tinhLuong() {
		double ptThuNhap = 15/100 * (soTiet * donGia);
		
		double luongThang = soTiet * donGia - ptThuNhap;
		System.out.println("Lương tháng : " + luongThang);
	}
}

public class Bai_4_5 {
	public static void main(String[] args) {
		GVCoHuu gvch1 = new GVCoHuu();
		GVThinhGiang gvtg1 = new GVThinhGiang();
		
		gvch1.nhapThongTin();
		gvch1.inThongTin();
		gvch1.tinhLuong();
		
		System.out.println("\n");
		gvtg1.nhapThongTin();
		gvtg1.inThongTin();
		gvtg1.tinhLuong();
	}
}