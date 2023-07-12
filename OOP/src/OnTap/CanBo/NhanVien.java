package OnTap.CanBo;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, String diaChi, String gioiTinh, String congViec) {
        super(hoTen, diaChi, gioiTinh);
        this.congViec = congViec;
    }

    public NhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public void nhapTT(Scanner sc) {
        super.nhapTT(sc);
        System.out.print("Nhap cong viec: ");
        congViec=sc.nextLine();
    }
    public void inTT() {
        super.inTT();
        System.out.println("Cong viec: "+congViec);
    }
}
