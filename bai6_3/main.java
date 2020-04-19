package bai6_3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SachGiaoKhoa sgk1 = new SachGiaoKhoa(1, "abc", 1000, 10, "Kim Dong", true);
		QuanLySGK.nhapSach(sgk1);
		QuanLySGK.danhSach();
		SachGiaoKhoa sgk2 = new SachGiaoKhoa(1, "abc", 10000, 8, "Kim Dong", false);
		QuanLySGK.nhapSach(sgk2);
		QuanLySGK.danhSach();
		System.out.println(QuanLySGK.thanhTien());
//		SachThamKhao stk1 = new SachThamKhao(1, "abc", 1000, 10, "Kim Dong", "toan", 2000);
//		QuanLySTK.nhapSach(stk1);
//		QuanLySTK.danhSach();
//		System.out.println(QuanLySTK.thanhTien());
//		SachNgoaiVan snv1 = new SachNgoaiVan(1, "abc", 1000, 10, "Kim Dong", "Anh");
//		QuanLySNV.nhapSach(snv1);
//		QuanLySNV.danhSach();
//		System.out.println(QuanLySNV.thanhTien());
	}

}
