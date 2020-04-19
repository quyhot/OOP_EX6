package bai6_3;

import java.util.ArrayList;

public class QuanLySNV {
	private static ArrayList<SachNgoaiVan> SNV = new ArrayList<SachNgoaiVan>();
	public static void nhapSach(SachNgoaiVan snv) {
		SNV.add(snv);
	}
	public static void danhSach() {
		for (SachNgoaiVan snv : SNV) {
			System.out.println(snv.thongTinSach());
		}
	}
	public static int thanhTien() {
		int sum = 0;
		for (SachNgoaiVan snv : SNV) {
			sum += snv.soLuong*snv.donGia*120/100;
		}
		return sum;
		
	}
}
