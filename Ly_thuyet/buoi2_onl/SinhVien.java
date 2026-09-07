/**
 * SinhVien
 */
public class SinhVien {
    String mssv;
    String hoTen;
    Double diemTB;
    public SinhVien(String mssv, String hoTen, Double diemTB) {
       this.mssv= mssv;
       this.hoTen = hoTen;
       this.diemTB = diemTB;

    }
    void inThongTin(){
        System.out.println("mssv: "+ mssv + " Ho vs Ten: "+ hoTen + " diem trung binh: "+ diemTB  );
    }
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("123", "Nguyen Van A", 8.5);
        sv1.inThongTin();
    }
}