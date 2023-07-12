package OnTap.CanBo;

import java.util.Scanner;

public class CanBo {
    protected String hoTen, diaChi, gioiTinh;

    public CanBo(String hoTen, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public CanBo() {
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapTT(Scanner sc) {
        System.out.print("Nhap ho va ten: ");sc.nextLine();
        hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    public void inTT() {
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Dia chi: "+diaChi);
    }
}
