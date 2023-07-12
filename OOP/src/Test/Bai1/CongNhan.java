package Test.Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;
    Scanner sc = new Scanner(System.in);

    public CongNhan() {
    }

    public CongNhan(String hoTen, String ngaySinh, String gioitinh, String diachi, int bac) {
        super(hoTen, ngaySinh, gioitinh, diachi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.println("Nhap cap bac: ");
        bac = sc.nextInt();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Cap bac " + bac + "/7");
    }

}
