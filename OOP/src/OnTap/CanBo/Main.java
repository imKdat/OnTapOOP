package OnTap.CanBo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB ds = new QLCB();
        boolean flag = true;

        do {
            System.out.print("Ban muon lam gi(1.Nhap thong tin-2.In thong tin-3.Tim kiem can bo-4.Thoat) ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ds.nhapCB(sc);

                    break;
                case 2:

                    ds.inTT();
                    break;
                case 3:

                    System.out.print("Nhap loai can bo: ");
                    sc.nextLine();
                    String loai = sc.nextLine();
                    ds.timKiem(loai);
                    break;
                default:
                    System.out.print("Bye!!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
