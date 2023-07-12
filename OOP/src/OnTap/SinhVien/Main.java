package OnTap.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSTS dsts=new DSTS();
        System.out.println("Nhap tt");
        dsts.nhapTS(sc);
        System.out.println("Thi sinh du thi");
        dsts.inTT();
        System.out.println("Tim sbd");
        String sbd=sc.nextLine();
        dsts.timKiemSBD(sbd);
    }
}
