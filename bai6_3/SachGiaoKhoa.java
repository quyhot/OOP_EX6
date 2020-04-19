package bai6_3;

import java.util.Calendar;

public class SachGiaoKhoa extends Sach{
	private String tinhTrang;
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public SachGiaoKhoa(int maSach, String tieuDe, int donGia, int soLuong,String nhaXuatBan, boolean tinhTrang) {
		this.maSach = maSach;
		this.tieuDe = tieuDe;
		this.ngayNhap = ngayNhap.getInstance();
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
		if(tinhTrang == true) {
			this.tinhTrang = "moi";
		}
		else {
			this.tinhTrang = "cu";
		}
	}
	
	public String thongTinSach() {
		return "Ma sach: " + maSach 
				+ "\nTieu de: " + tieuDe
				+ "\nNgay nhap: " + ngayNhap.getTime()
				+ "\nDon gia: " + donGia
				+ "\nSo luong: " + soLuong
				+ "\nTinh trang: " + tinhTrang;
	}
}
