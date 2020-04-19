package bai6_3;

public class SachThamKhao extends Sach {
	private String chuyenNganh;
	private int thue;
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}
	
	public SachThamKhao(int maSach, String tieuDe, int donGia, int soLuong, String nhaXuatBan, String chuyenNganh, int thue) {
		this.maSach = maSach;
		this.tieuDe = tieuDe;
		this.ngayNhap = ngayNhap.getInstance();
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
		this.chuyenNganh = chuyenNganh;
		this.thue = thue;
	}

	public String thongTinSach() {
		return "Ma sach: " + maSach 
				+ "\nTieu de: " + tieuDe
				+ "\nNgay nhap: " + ngayNhap.getTime()
				+ "\nDon gia: " + donGia
				+ "\nSo luong: " + soLuong
				+ "\nChuyen nganh: " + chuyenNganh
				+ "\nThue: " + thue;
	}
}
