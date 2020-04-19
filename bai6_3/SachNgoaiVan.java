package bai6_3;

public class SachNgoaiVan extends Sach {
	private String ngonNgu;
	public String getNgonNgu() {
		return ngonNgu;
	}
	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}
	
	public SachNgoaiVan(int maSach, String tieuDe, int donGia, int soLuong, String nhaXuatBan, String ngonNgu) {
		this.maSach = maSach;
		this.tieuDe = tieuDe;
		this.ngayNhap = ngayNhap.getInstance();
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
		this.ngonNgu= ngonNgu;
	}
	
	public String thongTinSach() {
		return "Ma sach: " + maSach 
				+ "\nTieu de: " + tieuDe
				+ "\nNgay nhap: " + ngayNhap.getTime()
				+ "\nDon gia: " + donGia
				+ "\nSo luong: " + soLuong
				+ "\nNgon ngu" + ngonNgu;
	}
}
