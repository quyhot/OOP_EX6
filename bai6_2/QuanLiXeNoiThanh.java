package bai6_2;

import java.util.ArrayList;

public class QuanLiXeNoiThanh {
	private static ArrayList<ChuyenXeNoiThanh> xeNoiThanh = new ArrayList<ChuyenXeNoiThanh>();
	
	public static void nhapXe(ChuyenXeNoiThanh xe) {
		xeNoiThanh.add(xe);
	}
	public static void danhSachXe() {
		for (ChuyenXeNoiThanh xe : xeNoiThanh) {
			System.out.println(xe.thongTinXe());
		}
	}
	public static int tongDoanhThu() {
		int sum = 0;
		for(ChuyenXeNoiThanh xe : xeNoiThanh) {
			sum += xe.doanhThu;
		}
		return sum;
	}
	
}
