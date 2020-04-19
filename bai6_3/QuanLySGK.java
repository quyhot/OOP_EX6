package bai6_3;

import java.util.ArrayList;

public class QuanLySGK {
	private static ArrayList<SachGiaoKhoa> SGK = new ArrayList<SachGiaoKhoa>();
	
	public static void nhapSach(SachGiaoKhoa sgk) {
		SGK.add(sgk);
	}
	public static void danhSach() {
		for (SachGiaoKhoa sgk : SGK) {
			System.out.println(sgk.thongTinSach());
		}
	}
	public static int thanhTien() {
		int sum = 0;
		for (SachGiaoKhoa sgk : SGK) {
			if(sgk.getTinhTrang() == "moi") {
				sum += sgk.soLuong*sgk.donGia;
			}
			else
				sum += sgk.soLuong*sgk.donGia/2;
		}
		return sum;
	}
}
