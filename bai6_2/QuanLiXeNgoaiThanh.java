package bai6_2;

import java.util.ArrayList;

public class QuanLiXeNgoaiThanh extends QuanLiXeNoiThanh{
	private static ArrayList<ChuyenXeNgoaiThanh> xeNgoaiThanh = new ArrayList<ChuyenXeNgoaiThanh>();
	
	public static void nhapXe(ChuyenXeNgoaiThanh xe) {
		xeNgoaiThanh.add(xe);
	}
	public static void danhSachXe() {
		for (ChuyenXeNgoaiThanh xe : xeNgoaiThanh) {
			System.out.println(xe.thongTinXe());
		}
	}
	public static int tongDoanhThu() {
		int sum = 0;
		for(ChuyenXeNgoaiThanh xe : xeNgoaiThanh) {
			sum += xe.doanhThu;
		}
		return sum;
	}
	
}
