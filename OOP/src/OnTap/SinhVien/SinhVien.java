package OnTap.SinhVien;

import java.util.Scanner;

public class SinhVien {
    private String sBD,hoTen,diaChi;
    private String dienUuTien;
    public SinhVien() {
    }
    public SinhVien(String sBD, String hoTen, String diaChi, String dienUuTien) {
        this.sBD = sBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienUuTien = dienUuTien;
    }
    public String getsBD() {
        return sBD;
    }
    public void setsBD(String sBD) {
        this.sBD = sBD;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getDienUuTien() {
        return dienUuTien;
    }
    public void setDienUuTien(String dienUuTien) {
        this.dienUuTien = dienUuTien;
    }
    public void nhapTT(Scanner sc) {
        System.out.println("Nhap so bao danh: ");sc.nextLine();
        sBD=sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap dien uu tien: ");
        dienUuTien=sc.nextLine();
    }
    public void inTT() {
        System.out.println("SBD: "+sBD);
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Dien uu tien: "+dienUuTien);
    }
}
