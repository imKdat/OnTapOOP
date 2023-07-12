package OnTap.SinhVien;

import java.util.Scanner;

public class KhoiA extends SinhVien{
    private String mon1,mon2,mon3;

    public KhoiA() {
    }

    public KhoiA(String mon1, String mon2, String mon3) {
        
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public void nhapTT(Scanner sc) {
        super.nhapTT(sc);
        System.out.println("Nhap mon 1: ");
        mon1=sc.nextLine();
        System.out.println("Nhap mon 2: ");
        mon2=sc.nextLine();
        System.out.println("Nhap mon 3: ");
        mon3=sc.nextLine();
    }
    public void inTT() {
        super.inTT();
        System.out.println("Mon 1: "+mon1);
        System.out.println("Mon 2: "+mon2);
        System.out.println("Mon 3: "+mon3);
    }
}
