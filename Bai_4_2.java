package lab4;

class Nguoiz{
	private String ten;
	private int tuoi;
	private char gioitinh;
	
	public Nguoiz() {
	
	}
	
	public Nguoiz(String ten, int tuoi, char gioitinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTen(String ten) {
		return this.ten;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getTuoi(int tuoi) {
		return this.tuoi;
	}
	
	public void setGioiTinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}
	public char getGioiTinh(char gioitinh) {
		return this.gioitinh;
	}
	
	public String toString() {
		return "Tên : " + ten + "\nTuổi : " + tuoi + "\nGiới tính : " + gioitinh;
	}
}

class Truong{
	private String ten;
	private String diaChi;
	private String hieuTruong;
	
	public Truong(String ten,String diaChi,String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTen(String ten) {
		return this.ten;
	}
	
	public void setdiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getdiaChi(String diaChi) {
		return this.diaChi;
	}
	
	public void sethieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	public String gethieuTruong(String hieuString) {
		return this.hieuTruong;
	}
	
	public String toString() {
		return "\nTên bệnh viên : " + ten + "\nĐịa chỉ : " + diaChi + "\nTên hiệu trưởng : " + hieuTruong;
	}
}

class SinhVien extends Nguoiz{
    private String lop;
    private String nganh;
    private Truong truong;

    public SinhVien(String ten, int tuoi, char gioitinh, String lop,String nganh, Truong truong) {
        super(ten,tuoi,gioitinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getlop() {
        return this.lop;
    }

    public void setlop(String lop) {
        this.lop = lop;
    }

    public String getnganh() {
        return this.nganh;
    }

    public void setnganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong truong() {
        return this.truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String toString() {
        return super.toString() + "\nLớp: " + lop + "\nNgành: " + nganh + "\nThông tin trường học: " + truong.toString();
    }
}


public class Bai_4_2 {
	public static void main(String[] args) {
		Truong truong = new Truong("Trường Đại Học Y", "123 đường ABC, thành phố XYZ", "Võ Văn A");
		SinhVien sv1 = new SinhVien("Nguyễn Văn B",20,'1',"YDKB2","Y đa khoa", truong);
		
		SinhVien sv2 = new SinhVien("Nguyễn Thị C",40,'0',"YPTD9","Phẫu thuật",truong);
		
		System.out.println(sv1.toString());
		System.out.println("\n\n"+sv2.toString());
		
	}

}