package OnTap.CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bacCap;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String diaChi, String gioiTinh, int bacCap) {
        super(hoTen, diaChi, gioiTinh);
        this.bacCap = bacCap;
    }

    public int getBacCap() {
        return bacCap;
    }

    public void setBacCap(int bacCap) {
        this.bacCap = bacCap;
    }

    public void nhapTT(Scanner sc) {
        super.nhapTT(sc);
        System.out.print("Nhap bac: ");
        bacCap=sc.nextInt();
    }
    public void inTT() {
        super.inTT();
        System.out.println("Bac: "+bacCap+"/10");
    }
}
