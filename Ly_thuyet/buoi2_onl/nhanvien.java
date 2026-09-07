public class nhanvien {
    protected String hoTen;
    protected String cccd;
    protected double luongCB;

    public nhanvien(String hoTen, String cccd, double luongCB) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.luongCB = luongCB;
    }
    public double tinhLuong(){
        return 0;
    }
}
class NhanVienToanThoiGian extends nhanvien{
    private double luongthang;

    @Override
    public double tinhLuong(){
        return luongthang;
    }
}