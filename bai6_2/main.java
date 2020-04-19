package bai6_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChuyenXeNoiThanh n1 = new ChuyenXeNoiThanh(1, "A", 2, 100000, 50, 30);
		bai6_2.QuanLiXeNoiThanh.nhapXe(n1);
		bai6_2.QuanLiXeNoiThanh.danhSachXe();
		ChuyenXeNgoaiThanh n2 = new ChuyenXeNgoaiThanh(2, "B", 3, 70000, "10", 5);
		bai6_2.QuanLiXeNgoaiThanh.nhapXe(n2);
		bai6_2.QuanLiXeNgoaiThanh.danhSachXe();
		System.out.println(QuanLiXeNoiThanh.tongDoanhThu());
	}
}
