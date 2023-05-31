package lab4;

import java.util.Scanner;

abstract class Hocvien{
	protected String hoTen;
	protected String diaChi;
	protected int loaiUT;
	protected String loaiCT;
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên học viên : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ học viên : ");
		diaChi = sc.nextLine();
		System.out.println("Nhập loại chương trình : ");
		loaiCT = sc.nextLine();
		System.out.println("Nhập loại ưu tiên : ");
		loaiUT = sc.nextInt();
	}
	
	public abstract void hocPhi();
	
	public void inThongTin() {
		System.out.println("Họ tên học viên : " + hoTen);
		System.out.println("Địa chỉ học viên : " + diaChi);
		System.out.println("Loại ưu tiên : " + loaiUT);
		System.out.println("Loại chương trình đăng kí học : " + loaiCT);
	}
	
}

class HocvienDH extends Hocvien{
	private int soBuoi;
	private int donGiaDH = 500000;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số buổi học : ");
		soBuoi = sc.nextInt();
	}
	
	public void hocPhi() {
		int uuTien = 0;
		if (loaiUT == 1) {
			uuTien = 1000000;
		}else if(loaiUT == 2) {
			uuTien = 500000;
		}else uuTien = 0;
		int hocPhi = soBuoi * donGiaDH - uuTien;
		System.out.println("Học phí : " + hocPhi);
	}
}

class HocvienLT extends Hocvien{
	private int soBuoi;
	private int donGiaLT = 300000;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số buổi học : ");
		soBuoi = sc.nextInt();
	}
	
	public void hocPhi() {
		int uuTien = 0;
		if (loaiUT == 1) {
			uuTien = 1000000;
		}else uuTien = 0;
		int hocPhi = soBuoi * donGiaLT - uuTien;
		System.out.println("Học phí : " + hocPhi);
	}
	
}
public class Bai_4_4 {
	public static void main(String[] args) {
		HocvienDH hvDH1 = new HocvienDH();
		HocvienLT hvLT1 = new HocvienLT();
		hvDH1.nhapThongTin();
		hvDH1.inThongTin();
		hvDH1.hocPhi();
		
		hvLT1.nhapThongTin();
		hvLT1.inThongTin();
		hvLT1.hocPhi();
	}
}