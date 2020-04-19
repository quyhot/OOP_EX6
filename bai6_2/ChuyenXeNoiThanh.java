package bai6_2;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKm;
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKm() {
		return soKm;
	}
	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	
	public ChuyenXeNoiThanh(int msChuyen, String hoten, int soXe, int doanhThu, int soTuyen, int soKm) {
		this.msChuyen = msChuyen;
		this.hoten = hoten;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	public String thongTinXe() {
		return	"Ma so chuyen: " + msChuyen
				+ "\nHo ten: " + hoten
				+ "\nSo xe: " + soXe
				+ "\nSo tuyen: " + soTuyen
				+ "\nSo KM di duoc: " + soKm
				+ "\nDoanh thu: " + doanhThu;
	}
}
