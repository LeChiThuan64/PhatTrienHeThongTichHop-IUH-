public class SanPham {
    String maSP;
    String tenSP;
    double donGia;
    double soLuong;

    public SanPham(String maSP, String tenSP, double donGia, double soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    double tinhThanhTien() {
        return donGia * soLuong;
    }

    void hieuThi() {
        System.out.println("Ma : " + maSP);
        System.out.println("Ten : " + tenSP);
        System.out.println("Dongia: " + donGia);
        System.out.println("Soluong: " + soLuong);
        System.out.println("Thanhtien: " + soLuong + " * " + donGia + " = " + tinhThanhTien());
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP001 ", "Laptop ", 150, 2);
        sp1.hieuThi();

        // SanPham sp2 = new SanPham("SP002 ", "Chuot ", 250, 5);
        // sp2.hieuThi();


    }
}
