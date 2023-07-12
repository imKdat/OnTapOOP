package Test.Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;
    Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String gioitinh, String diachi, String congViec) {
        super(hoTen, ngaySinh, gioitinh, diachi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap cong viec: ");
        
        congViec = sc.nextLine();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Cong viec: " + congViec);
    }

}
