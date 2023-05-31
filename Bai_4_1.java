package lab4;

class Nguoi{
	private String ten;
	private int tuoi;
	private char gioitinh;
	
	public Nguoi() {
	
	}
	
	public Nguoi(String ten, int tuoi, char gioitinh) {
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

class BenhVien{
	private String ten;
	private String diaChi;
	private String giamDoc;
	
	public BenhVien(String ten,String diaChi,String giamDoc) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
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
	
	public void setgiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	public String getgiamDoc(String giamDoc) {
		return this.giamDoc;
	}
	
	public String toString() {
		return "\nTên bệnh viên : " + ten + "\nĐịa chỉ : " + diaChi + "\nTên giám đốc : " + giamDoc;
	}
}

class BenhNhan extends Nguoi{
    private String tienSu;
    private String chuanDoan;
    private BenhVien benhVien;

    public BenhNhan(String ten, int tuoi, char gioitinh, String tienSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioitinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    public String toString() {
        return super.toString() + "\nTiền sử: " + tienSu + "\nChuẩn đoán: " + chuanDoan + "\nThông tin bệnh viện: " + benhVien.toString();
    }
}


public class Bai_4_1 {
	public static void main(String[] args) {
		BenhVien benhVien = new BenhVien("Bệnh viện XYZ", "123 đường ABC, thành phố XYZ", "Nguyễn Văn A");
		BenhNhan benhNhan1 = new BenhNhan("Nguyễn Văn B", 30, '1', "Tiểu đường", "Bệnh A", benhVien);
		
		BenhNhan benhNhan2 = new BenhNhan("Nguyễn Thị A",40,'0',"Tim mạch","Huyết áp",benhVien);
		
		System.out.println(benhNhan1.toString());
		System.out.println("\n\n"+benhNhan2.toString());
		
	}
}