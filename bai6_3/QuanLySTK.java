package bai6_3;

import java.util.ArrayList;

public class QuanLySTK extends QuanLySGK {
	private static ArrayList<SachThamKhao> STK = new ArrayList<SachThamKhao>();
	
	public static void nhapSach(SachThamKhao stk) {
		STK.add(stk);
	}
	public static void danhSach() {
		for (SachThamKhao stk : STK) {
			System.out.println(stk.thongTinSach());
		}
	}
	public static int thanhTien() {
		int sum = 0;
		for (SachThamKhao stk : STK) {
			sum += stk.soLuong*stk.donGia + stk.getThue();
		}
		return sum;
		
	}
}
