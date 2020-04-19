package bai6_2;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public ChuyenXeNgoaiThanh(int msChuyen, String hoten, int soXe, int doanhThu, String noiDen, int soNgayDiDuoc) {
		this.msChuyen = msChuyen;
		this.hoten = hoten;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public String thongTinXe() {
		return	"Ma so chuyen: " + msChuyen
				+ "\nHo ten: " + hoten
				+ "\nSo xe: " + soXe
				+ "\nNoi Den: " + noiDen
				+ "\nSo ngay di duoc: " + soNgayDiDuoc
				+ "\nDoanh thu: " + doanhThu;
	}
}
