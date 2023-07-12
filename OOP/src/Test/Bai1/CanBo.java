package Test.Bai1;

import java.util.Scanner;

public class CanBo {
    private String hoTen, ngaySinh, gioitinh, diachi;
    Scanner sc = new Scanner(System.in);

    public CanBo() {
    }

    public CanBo(String hoTen, String ngaySinh, String gioitinh, String diachi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhapTT() {
        System.out.println("Nhap ten can bo: ");
        
        hoTen = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
    }

    public void inTT() {
        System.out.println("Ten: " + hoTen);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diachi);
    }
}
